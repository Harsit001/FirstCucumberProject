package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("User has valid credentials")
    public void user_has_valid_credentials() {
        System.out.println("User has valid crentials" );
      }
    @When("User tries to login with credentials")
    public void user_tries_to_login_with_credentials() {
        System.out.println("User tries to login" );
        }
    @Then("User should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() {
        System.out.println("User lands on homepage" );
        }
}
