package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Hooks {

    @After
    public void teardown(){
        Driver.quitDriver();
    }
}
