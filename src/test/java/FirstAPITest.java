
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Assertions;
import reusableComponents.Payload;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class FirstAPITest {

    public static void main(String[] args)
    {


        //Add API
        RestAssured.baseURI ="https://rahulshettyacademy.com/";
        String response= given().log().all().queryParam("key", "qaclick123")
                .body("{\n" +
                        "  \"location\": {\n" +
                        "    \"lat\": -38.383494,\n" +
                        "    \"lng\": 33.427362\n" +
                        "  },\n" +
                        "  \"accuracy\": 50,\n" +
                        "  \"name\": \"Frontline house\",\n" +
                        "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                        "  \"address\": \"29, side layout, cohen 09\",\n" +
                        "  \"types\": [\n" +
                        "    \"shoe park\",\n" +
                        "    \"shop\"\n" +
                        "  ],\n" +
                        "  \"website\": \"http://google.com\",\n" +
                        "  \"language\": \"French-IN\"\n" +
                        "}")
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(equalTo(200))
                .assertThat().header("Content-Type", "application/json;charset=UTF-8")
                .extract().body().asString();

        System.out.println("Response is: "+response);

        JsonPath js = new JsonPath(response);
        String pID = js.get("place_id");

        System.out.println(pID);

        JsonPath js1 = new JsonPath(given().queryParam("key", "qaclick123").queryParams("place_id", pID)
                .when().get("maps/api/place/get/json")
                .then().assertThat().statusCode(200)
                .assertThat().body("accuracy",equalTo("50")).extract().body().asString());

         Assertions.assertEquals("-38.383494" , js1.get("location.latitude"));

        Payload payloadObj = new Payload();
         JsonPath js2 = new JsonPath(payloadObj.SamplePayload());
        String Courses = js2.get("courses").toString();
        System.out.println(Courses);
       int countOfCourses= js2.getInt("courses.size()");
       System.out.println("Count is: "+countOfCourses);
        int purchaseAmount = js2.getInt("dashboard.purchaseAmount");
        System.out.println(purchaseAmount);
        int Amount = 0;
        for(int i=0; i<countOfCourses; i++)
        {
         String Title = js2.get("courses["+i+"].title".toString());
            //System.out.print(Title+"       ");
            int Price = js2.getInt("courses["+i+"].price");
          //  System.out.println(Price);
            int Copies = js2.getInt("courses["+i+"].copies");



            if (Price>=45)
            {
                System.out.print(Title+ "      ");
                System.out.println(Price);

            }

             Amount = Amount+(Price*Copies);

        }

        System.out.println("Amount is :   "+Amount);
        if (Amount == purchaseAmount)
            System.out.println("The two Amounts matched");



















    }

}
