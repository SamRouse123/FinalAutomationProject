package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.RemoveItem;
import pageObjects.ShoppingCart;

public class BasketStepDefs {
    HomePage homePage;
    RemoveItem removeItem;

    ShoppingCart shoppingCart;

    public BasketStepDefs() {
        homePage = new HomePage();
        removeItem = new RemoveItem();
        shoppingCart = new ShoppingCart();
    }




    @When("I click on the item of purchase")
    public void iAmClickingOnTheItem() {
        removeItem.chooseItem();

    }


    @When("I add the item to the cart and I proceed to checkout")
    public void iAmAddingItemToCartAndCheckingOut() {
        removeItem.addingToCart();
        removeItem.checkingOut();
    }


    @Then("the current basket will be empty")
    public void iAmClearingTheBasket() {
        removeItem.removingItem();
        Assert.assertEquals("There are no more items in your cart", shoppingCart.confirmCartIsEmpty());
    }
}