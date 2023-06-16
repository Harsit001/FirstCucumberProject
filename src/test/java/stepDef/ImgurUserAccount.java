package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImgurUserAccount {
    @Given("User with {username} has access to imagur {accountEndpoint}")
    public void user_with_has_access_to_imagur_endpoint(String username, String accountEndpoint) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("UserName is "+username);
        System.out.println("Account Endpoint : "+accountEndpoint);
    }
    @When("User tries to {GET} Account details with valid {clientID}")
    public void user_tries_to_make_lookup_for_account_details_with_valid(String GET, String clientID) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("CLIENTID PASSED to header: "+clientID);
    }
    @Then("User finds out to be an active user with Valid {response}")
    public void user_finds_out_to_be_an_active_user_with_valid(String response) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Response code from Accounts endpoint ");
    }

}
