package pageObjects;
import org.openqa.selenium.By;

import java.util.Map;

public class ShoppingCartPage extends BasePage{
    HomePage homePage;
    BasketPage basketPage;
    TShirtPage tShirtPage;

    public ShoppingCartPage() {
        homePage = new HomePage();
        basketPage = new BasketPage();
        tShirtPage = new TShirtPage();
    }
    private static final By PROCEED_TO_CHECKOUT = By.cssSelector
            ("[href='http://3.11.77.136/index.php?controller=order']");

    private static final By CONTINUE_BUTTON = By.xpath
            ("//footer[@class='form-footer clearfix']/button");

    private static final By CHOOSE_STATE = By.cssSelector("select[name='id_state']");

    public void goToShoppingCart() {
        homePage.goToHomepage();
        homePage.clickOnDress();
        tShirtPage.clickAddToCart();
        tShirtPage.clickProceedToCheckOut();
        waitAndClick(PROCEED_TO_CHECKOUT);
    }
    public void fillInAddress(Map<String, String> map){
        for (Map.Entry<String, String> row : map.entrySet()) {
            waitAndSendKeys((By.name(row.getKey().toLowerCase()
                    .replaceAll("\\s+",""))), row.getValue());
        }
    }
    public void clickContinueButton(){
        waitAndClick(CONTINUE_BUTTON);
    }

    public void selectState(String state){
        selectDropDownByText(CHOOSE_STATE, state);
    }


}
