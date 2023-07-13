package reusableComponents;

import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReusableMethods {

    public JsonPath JsonFormatter(String payload)
    {
        JsonPath js = new JsonPath(payload);
        return js;
    }
    public String FileRead(String filePath) throws IOException {
        String filecontent = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println("Request is" +filecontent);
        return filecontent;
    }




}
