package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class ImgurUserAccount {

    @Given("User with {string} has access to imagur {string}")
    public void user_with_harsitagarwal2009_has_access_to_imagur_https_api_imgur_com_account(String username, String accountEndpoint) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("UserName is "+username);
    }
    @Given("User with {string} has access to imagur {string}")
    public void user_with_has_access_to_imagur_endpoint(String username, String accountEndpoint) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("UserName is "+username);
        //System.out.println("Account Endpoint : "+accountEndpoint);


    }
    @When("User tries to Get Account details with valid 9fbac80c419c625")
    public void user_tries_to_get_account_details_with_valid_9fbac80c419c625() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("User finds out to be an active user with Valid {int}")
    public void user_finds_out_to_be_an_active_user_with_valid(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }

    /*@Given("User with {string} has access to imagur {string}")
    public void user_with_has_access_to_imagur_endpoint(String username, String accountEndpoint) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("UserName is "+username);
        //System.out.println("Account Endpoint : "+accountEndpoint);


    }
    @When("User tries to {string} Account details with valid {string}")
    public void user_tries_to_make_lookup_for_account_details_with_valid(String GET, String clientID) {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("CLIENTID PASSED to header: "+clientID);
        RestAssured.baseURI = "https://api.imgur.com";

        RestAssured.given().log().all().header("Authorization", clientID)
                .when().get("3/account/harsitagarwal2009")
                .then().log().all().assertThat().statusCode(200);

    }
    @Then("User finds out to be an active user with Valid {string}")
    public void user_finds_out_to_be_an_active_user_with_valid(String response) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Response code from Accounts endpoint ");
    }
    *//*@Given("User with harsitagarwal2009 has access to imagur https:\\/\\/api.imgur.com\\/{int}\\/account\\/")
    public void user_with_harsitagarwal2009_has_access_to_imagur_https_api_imgur_com_account(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User tries to Get Account details with valid 9fbac80c419c625")
    public void user_tries_to_get_account_details_with_valid_9fbac80c419c625() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User finds out to be an active user with Valid {int}")
    public void user_finds_out_to_be_an_active_user_with_valid(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    *//*}
     */
}
