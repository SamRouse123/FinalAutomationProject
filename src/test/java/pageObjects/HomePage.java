package pageObjects;

import org.openqa.selenium.By;


public class HomePage extends BasePage {
    private static final String URL = ("http://3.11.77.136/index.php");
    private static final By CLICK_SIGN_IN_BUTTON = By.xpath("//span[text()='Sign in']");
    private static final By DRESS_LINK = By.xpath("//img[@src='http://3.11.77.136/img/p/1/1-home_default.jpg']");

    public void goToHomepage() {
        driver.get(URL);
    }

    public void clickSignIn() {
        waitAndClick(CLICK_SIGN_IN_BUTTON);
    }

    public void clickOnDress() {
        waitAndClick(DRESS_LINK);
    }
}
