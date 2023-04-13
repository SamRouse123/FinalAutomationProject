package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Hooks;

import java.time.Duration;

abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public BasePage() {
        driver = Hooks.driver;
        wait = Hooks.wait;
    }

}
