package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderConfirmationPage extends BasePage {

    private static final By ORDER_CONFIRMATION_HEADING = By.cssSelector("h3.h1.card-title");
    public void assertOrderConfirmed() {
        String orderConfirmedMessage = "YOUR ORDER IS CONFIRMED";
        Assert.assertTrue("Does not contain " + orderConfirmedMessage, getElementText(ORDER_CONFIRMATION_HEADING).contains(orderConfirmedMessage));
    }
}
