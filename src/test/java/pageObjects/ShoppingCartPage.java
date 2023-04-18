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

    private static final By PERSONAL_INFORMATION_CONTINUE_BUTTON = By.cssSelector("button[data-link-action=register-new-customer]");

    private static final By CHOOSE_STATE = By.cssSelector("select[name='id_state']");
    private static final By ADDRESS_CONTINUE_BUTTON = By.cssSelector("[name='confirm-addresses']");
    private static final By SHIPPING_CONTINUE_BUTTON = By.cssSelector("[name='confirmDeliveryOption']");
    private static final By PAY_BY_BANK_WIRE_OPTION = By.cssSelector("#payment-option-2");
    private static final By ACCEPT_TERMS_AND_CONDITIONS = By.cssSelector("div.float-xs-left > span");
    private static final By ORDER_WITH_OBLIGATION_TO_PAY = By.cssSelector("button.btn.btn-primary.center-block");


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
    public void clickPersonalInformationContinueButton(){
        waitAndClick(PERSONAL_INFORMATION_CONTINUE_BUTTON);
    }

    public void selectState(String state){
        selectDropDownByText(CHOOSE_STATE, state);
    }

    public void clickAddressContinueButton() {
        waitAndClick(ADDRESS_CONTINUE_BUTTON);
    }

    public void clickShippingContinueButton() {
        waitAndClick(SHIPPING_CONTINUE_BUTTON);
    }
    public void clickPayByBankWire() {
        waitAndClick(PAY_BY_BANK_WIRE_OPTION);
    }
    public void clickAcceptTermsAndConditions() {
        waitAndClick(ACCEPT_TERMS_AND_CONDITIONS);
    }

    public void clickOrderWithObligationButton() {
        waitAndClick(ORDER_WITH_OBLIGATION_TO_PAY);
    }

}
