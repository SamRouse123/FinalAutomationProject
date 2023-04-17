package pageObjects;

import org.openqa.selenium.By;

public class CreateAccount extends BasePage{
    private static final By CREATE_ACCOUNT_BUTTON = By.xpath("//a[@href='http://3.11.77.136/index.php?controller=authentication&create_account=1']");

    private static final By TITLE_BUTTON = By.xpath("//input[@name='id_gender' and @value='1']/parent::span");
    public void clickCreateAccount(){
        waitAndClick(CREATE_ACCOUNT_BUTTON);
    }
    public void clickTitleButton(String title){
        waitAndClick(TITLE_BUTTON);
    }
}
