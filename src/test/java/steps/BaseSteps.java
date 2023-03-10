package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;
import utils.Driver;

public class BaseSteps {

    //where we store test data
    WebDriver driver;

    @Before
    public void setup(){
        driver = Driver.getDriver();

    }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        System.out.println(url);
        driver.get(url);
    }
}
