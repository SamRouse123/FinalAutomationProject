package pageObjects;
import org.openqa.selenium.By;


public class AccountPage extends BasePage {

    private static final By LOGGED_IN_SUCCESSFULLY = By.cssSelector("a>span.hidden-sm-down");

    public String getUsername() {
        return driver.findElement(LOGGED_IN_SUCCESSFULLY).getText();
    }


}
