package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage{
    private static final String URL=("http://3.11.77.136/index.php?controller=cart&action=show");
    private static final By INCREASE_QUANTITY_BUTTON = By.cssSelector(".material-icons.touchspin-up");
private static final By QUANTITY_COUNTER = By.cssSelector(".js-cart-line-product-quantity");
    public void goToBasketPage(){driver.get(URL);}
    public void clickIncreaseQuantity(){
        waitAndClick(INCREASE_QUANTITY_BUTTON);
    }
    public void checkForIncreasedItems(String itemNumber){
        WebElement quantityCounter = driver.findElement(QUANTITY_COUNTER);
        Assert.assertEquals(itemNumber, quantityCounter.getAttribute("value"));
    }
}
