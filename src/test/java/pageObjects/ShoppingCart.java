package pageObjects;

import org.openqa.selenium.By;

public class ShoppingCart extends BasePage {

    private static final By EMPTY_CART = By.cssSelector(".cart-overview.js-cart");

    public String confirmCartIsEmpty() {
        return driver.findElement(EMPTY_CART).getText();
    }


}
