package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.ShoppingCartPage;

public class checkoutStepDefs {

    ShoppingCartPage shoppingCartPage;
    public checkoutStepDefs(){
        shoppingCartPage = new ShoppingCartPage();
    }
    @Given("I am on the Shopping Cart Page and I proceed to checkout")
    public void goFromShoppingCartToCheckout() {
        shoppingCartPage.goToShoppingCart();
    }

}
