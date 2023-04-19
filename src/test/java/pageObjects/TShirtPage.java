package pageObjects;

import org.openqa.selenium.By;

public class TShirtPage extends BasePage{
private static final By ADD_TO_CART = By.cssSelector(".btn.btn-primary.add-to-cart");
private static final By PROCEED_TO_CHECKOUT = By.cssSelector("a.btn.btn-primary");
//        (".cart-content-btn > a");
    public void clickProceedToCheckOut(){
        waitAndClick(PROCEED_TO_CHECKOUT);
    }

    public void clickAddToCart(){
    waitAndClick(ADD_TO_CART);
}
}
