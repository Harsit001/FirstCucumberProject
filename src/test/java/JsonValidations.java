import groovy.json.JsonOutput;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import reusableComponents.Payload;

public class JsonValidations {
    @Test
    public void JsonVa()
    {
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
        Assert.assertEquals(purchaseAmount,Amount);
    /*if (Amount == purchaseAmount)
        System.out.println("The two Amounts matched");
*/

    }
}
