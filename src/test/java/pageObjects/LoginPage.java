package pageObjects;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private static final By LOGIN_EMAIL = By.xpath
            ("//input[@class='form-control']");
    private static final By LOGIN_PASSWORD = By.xpath
            ("//input[@class='form-control js-child-focus js-visible-password']");

    private static final By SIGN_IN_ON_SIGN_IN_PAGE = By.cssSelector("footer > button");

    public void enterEmail(String email){
        waitAndSendKeys(LOGIN_EMAIL, email);
    }
    public void enterPassword(String password){
        waitAndSendKeys(LOGIN_PASSWORD, password);
    }

    public void clickToSignInAsUser(){
        waitAndClick(SIGN_IN_ON_SIGN_IN_PAGE);
    }
}
