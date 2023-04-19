package pageObjects;

import org.openqa.selenium.By;

import java.util.Map;

public class CreateAccountPage extends BasePage{
    private static final By CREATE_ACCOUNT_BUTTON = By.xpath("//a[@href='http://3.11.77.136/index.php?controller=authentication&create_account=1']");

    private static final By TITLE_BUTTON = By.xpath("//input[@name='id_gender' and @value='1']/parent::span");
    private static final By SAVE_BUTTON = By.cssSelector(".form-control-submit");
    private static final By NAME_SUCCESS = By.xpath("//span[normalize-space()='Samuel Rouse']");
    public void clickCreateAccount(){
        waitAndClick(CREATE_ACCOUNT_BUTTON);
    }
    public void clickTitleButton(String title){
        waitAndClick(TITLE_BUTTON);
    }
    public void fillInAccount(Map<String, String> map){
        for (Map.Entry<String, String> row : map.entrySet()) {
            waitAndSendKeys((By.name(row.getKey().toLowerCase().replaceAll("\\s+",""))), row.getValue());
        }
    }

    public void clickSave(){
        waitAndClick(SAVE_BUTTON);
    }
    public String successfulNewUser(){
        return getTexOfThePage(NAME_SUCCESS);

    }
}
