package pageObjects;

import org.openqa.selenium.By;

public class RemoveItem extends BasePage {
    private static final By SELECT_ITEM = By.xpath("//img[@src='http://3.11.77.136/img/p/7/7-home_default.jpg']");

    private static final By CART_BUTTON = By.cssSelector(".btn.btn-primary.add-to-cart");

    private static final By CHECKOUT_BUTTON = By.cssSelector(".cart-content-btn > a");

    private static final By REMOVE_BIN = By.cssSelector(
            "i.material-icons.float-xs-left");


    public void chooseItem() {
        waitAndClick(SELECT_ITEM);
    }


    public void addingToCart() {
        waitAndClick(CART_BUTTON);
    }


    public void checkingOut() {
        waitAndClick(CHECKOUT_BUTTON);
    }


    public void removingItem() {
        waitAndClick(REMOVE_BIN);
    }
}


