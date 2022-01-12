package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebApplicationSteps {

    WebDriver driver;
    @Given("user logged into gmail page")
    public void user_logged_into_gmail_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mobiles.co.uk/my-account/login");
    }
    @When("click on submit")
    public void click_on_submit()throws Throwable {
        driver.findElement(By.xpath(".//input[@id='loginOrderId']")).sendKeys("105182582");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("nai123DUI@12");
    }
    @Then("the user should be able to logged in successfully")
    public void the_user_should_be_able_to_logged_in_successfully()
throws Throwable {
                driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
                driver.wait(10000);
    }
}
