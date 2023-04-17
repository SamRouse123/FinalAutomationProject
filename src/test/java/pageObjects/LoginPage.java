package pageObjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By SIGN_IN_BUTTON = By.cssSelector("a[title='Log in to your customer account'] span[class='hidden-sm-down']");

    public void clickSignIn() {
        waitAndClick(SIGN_IN_BUTTON);
    }
}

