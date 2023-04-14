package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage{

    private static final By LOGGED_IN_SUCCESSFULLY = By.cssSelector("a>span.hidden-sm-down");

    public String getUsername() {
        return driver.findElement(LOGGED_IN_SUCCESSFULLY).getText();
    }



}
