package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @Given("user is on log in page")
    public void user_is_on_log_in_page() {
        System.out.println("The user is on login page");

    }
    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        System.out.println("Entered username and password");
    }
    @When("hit submit")
    public void hit_submit() {
        System.out.println("Click on Submit");

    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("Logged in");

    }


}
