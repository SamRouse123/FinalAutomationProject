package pageObjects;
import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage{

    private static final String CART_URL = ("http://3.11.77.136/index.php?controller=cart&action=show");
    private static final By PROCEED_TO_CHECKOUT = By.cssSelector("a.btn.btn-primary");

    public void goToShoppingCart() {
        driver.get(CART_URL);
        waitAndClick(PROCEED_TO_CHECKOUT);
    }



//    public void assertionCheck() {
//
//        String message = "Product successfully added to your shopping cart";
//        Assert.assertTrue("expected message not displayed \"" + message +
//                        "\"", CheckoutPage.SuccessfulAddProduct().contains(message));
//    }
}
