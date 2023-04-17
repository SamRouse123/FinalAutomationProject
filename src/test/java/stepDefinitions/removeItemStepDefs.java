package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RemoveItem;
import pageObjects.ShoppingCart;

public class removeItemStepDefs {
    HomePage homePage;
    RemoveItem removeItem;

    ShoppingCart shoppingCart;

    public removeItemStepDefs() {
        homePage = new HomePage();
        removeItem = new RemoveItem();
        shoppingCart = new ShoppingCart();
    }


    @Given("I am on the homepage")
    public void iAmOnHomePage() {
        homePage.goToHomepage();
    }


    @When("I click on the item of purchase")
    public void iAmClickingOnTheItem() {
        removeItem.chooseItem();

    }


    @And("I add the item to the cart and I proceed to checkout")
    public void iAmAddingItemToCartAndCheckingOut() {
        removeItem.addingToCart();
        removeItem.checkingOut();
    }




@Then("the current basket will be empty")
public void iAmClearingTheBasket() {
    removeItem.removingItem();
    shoppingCart.confirmCartIsEmpty();
    }
}

