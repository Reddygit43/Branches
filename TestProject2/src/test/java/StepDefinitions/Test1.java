package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
    WebDriver driver;

    @Given("User has valid credentials")
    public void user_has_valid_credentials() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mobiles.co.uk/my-account/login");
    }

    @When("user logged into we application with valid credentials")
    public void user_logged_into_we_application_with_valid_credentials() {
        driver.findElement(By.xpath(".//input[@id='loginOrderId']")).sendKeys("105182582");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("nai123DUI@12");
    }


    @Then("user should be able to logged into web application")
    public void user_should_be_able_to_logged_into_web_application()
    throws Throwable {
            driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
            driver.wait(10000);


    }

}