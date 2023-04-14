package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private static final String URL=("http://3.11.77.136/index.php");

    private static final By CLICK_SIGN_IN_BUTTON = By.xpath("//span[text()='Sign in']");
//            By.cssSelector(".user-info > a");
    public void goToHomepage(){
        driver.get(URL);
    }
    public void clickSignIn(){
        waitAndClick(CLICK_SIGN_IN_BUTTON);
    }

}
