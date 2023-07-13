
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pojo.AddLocationRequest;
import pojo.Response;
import pojo.location;
import reusableComponents.Payload;
import reusableComponents.ReusableMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryAPITests {

    @Test
    public void LibraryAPI()
    {
        Payload PayloadObj = new Payload();
        ReusableMethods ReusableMethodsObj = new ReusableMethods();
        RestAssured.baseURI = "http://216.10.245.166";

        String LibraryAPIPostResponse = given().log().all().header("Content-Type", "application/json")
                .body(PayloadObj.LibraryAPIInputPayloadPOST("bookName2", "isbnNo4", 114, "authorName2"))
                .when().post("Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();

        JsonPath js = ReusableMethodsObj.JsonFormatter(LibraryAPIPostResponse);
        String Msg = js.get("Msg");
        Assertions.assertEquals("successfully added", Msg);


    }
    //Parameterizing test data for 2 fields via data provider
    @Test(dataProvider = "AddMultipleBooks")
    public void LibraryAPI1(String isbn,String aisleNo)
    {
        Payload PayloadObj = new Payload();
        ReusableMethods ReusableMethodsObj = new ReusableMethods();
        RestAssured.baseURI = "http://216.10.245.166";

        String LibraryAPIPostResponse = given().log().all().header("Content-Type", "application/json")
                .body(PayloadObj.InputPayloadWithDataprovider(isbn,aisleNo))
                .when().post("Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();

        JsonPath js = ReusableMethodsObj.JsonFormatter(LibraryAPIPostResponse);
        String Msg = js.get("Msg");
        Assertions.assertEquals("successfully added", Msg);


    }
    @DataProvider(name="AddMultipleBooks")
    public Object[][] testdata()
    {
        //return new Object[][] {{"abc","123"},{"qqq","121"},{"aaa", "111"},{"bbb", "222"}};
        return new Object[][]
                {
                        {"abz", "12"},
                        {"qqz", "12"},
                        {"aaz", "11"},
                        {"bbz", "22"}
                };
    }

    //Adding Request payload for Library Add API via external file
    //@Test
    public void AddbookAPI() throws IOException {
        ReusableMethods ReusableMethodsObj = new ReusableMethods();

        RestAssured.baseURI = "http://216.10.245.166/";
        String AddAPIResponse= given().log().all().body(ReusableMethodsObj.FileRead("/Users/harsitagarwal/Downloads//AddAPIRequest.txt"))
                .when().post("Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();

        System.out.println("Response is     " +AddAPIResponse);
        JsonPath js1 = ReusableMethodsObj.JsonFormatter(AddAPIResponse);
        Assertions.assertEquals("Book Already Exists", js1.getString("Msg") );

    }
    @Test
    public void AddAPI()
    {
        AddLocationRequest req = new AddLocationRequest();

        location l = new location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        req.setLocation(l);
        req.setAccuracy(50);
        req.setName("Frontline house");
        req.setPhone_number("(+91) 983 893 3937");
        req.setLanguage("English");
        req.setWebsite("http://google.com");
        req.setAddress("29, side layout, cohen 09");
        List<String> obj = new ArrayList<>();
        obj.add("shop");
        obj.add("shoe park");
        req.setTypes(obj);



        RestAssured.baseURI = "https://rahulshettyacademy.com";
        //String AddResponse =

                Response Res = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(req)
                .when().post("/maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200).extract().response().as(Response.class);

                Assertions.assertEquals("OK", Res.getStatus());
                Assertions.assertEquals("APP", Res.getScope());





    }


}
