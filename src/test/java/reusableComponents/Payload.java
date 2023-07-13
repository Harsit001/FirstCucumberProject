package reusableComponents;

public class Payload {

    public String LibraryAPIInputPayloadPOST(String bookName, String isbnNo, int aisleNo, String authorName)
    {
        String inputPayload = "{\n" +
                "\n" +
                "\"name\":\""+bookName+"\",\n" +
                "\"isbn\":\""+isbnNo+"\",\n" +
                "\"aisle\":\""+aisleNo+"\",\n" +
                "\"author\":\""+authorName+"\"\n" +
                "}";

        return inputPayload;
    }
    public String InputPayloadWithDataprovider(String isbnNo, String aisleNo)
    {
        {
            String inputPayload = "{\n" +
                    "\n" +
                    "\"name\":\"HarryPotter\",\n" +
                    "\"isbn\":\""+isbnNo+"\",\n" +
                    "\"aisle\":\""+aisleNo+"\",\n" +
                    "\"author\":\"J.K.Rowling\"\n" +
                    "}";

            return inputPayload;
        }
    }

    public String SamplePayload()
    {
        String inputPayload = "{\n" +
                "   \"dashboard\": {\n" +
                "      \"purchaseAmount\": 910,\n" +
                "      \"website\": \"rahulshettyacademy.com\"\n" +
                "   },\n" +
                "   \"courses\": [\n" +
                "      {\n" +
                "         \"title\": \"Selenium Python\",\n" +
                "         \"price\": 50,\n" +
                "         \"copies\": 6\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\": \"Cypress\",\n" +
                "         \"price\": 40,\n" +
                "         \"copies\": 4\n" +
                "      },\n" +
                "      {\n" +
                "         \"title\": \"RPA\",\n" +
                "         \"price\": 45,\n" +
                "         \"copies\": 10\n" +
                "      }\n" +
                "   ]\n" +
                "}";
        return inputPayload;
    }


}
