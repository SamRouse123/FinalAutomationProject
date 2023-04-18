package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Hooks;

abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public BasePage() {
        driver = Hooks.driver;
        wait = Hooks.wait;
    }
    public void waitAndClick(By selector) {

        wait.until(ExpectedConditions.elementToBeClickable(selector)).click();
    }
    public void waitAndSendKeys(By selector, String keys) {
        wait.until(ExpectedConditions.elementToBeClickable(selector)).sendKeys(keys);
    }

    public void waitAndClick(By selector){
        wait.until(ExpectedConditions.elementToBeClickable(selector)).click();
    }

    }


