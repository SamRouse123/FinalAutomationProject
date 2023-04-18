package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.*;

public class BasketStepDefs {
    LoginPage loginPage;
    HomePage homePage;
    CategoryPage categoryPage;
    RemoveItem removeItem;
    ShoppingCart shoppingCart;

    public BasketStepDefs() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        categoryPage = new CategoryPage();
        removeItem = new RemoveItem();
        shoppingCart = new ShoppingCart();
    }
    @Given("I am on the category page")
    public void iAmOnTheCategoryPage() {
        categoryPage.goToCategoryPage();
        System.out.println("on category page");
    }

    @When("I click on the item of purchase")
    public void iAmClickingOnTheItem() {
        removeItem.chooseItem();
    }

    @And("^I click add (\\d) blouse to cart$")
    public void iClickAddToCart(int numberItems) {
        categoryPage.clickCheckout();
        System.out.println("I add " + numberItems + " blouse to cart");
    }

    @Then("^I will see a pop up confirming ive added (\\d) item to the basket$")
    public void iWillSeeAPopUpConfirmingIveAddedItemToTheBasket(int numberItems) {
        String message = "Product successfully added to your shopping cart";
        String qunatityMessage = "Quantity: 1";
        Assert.assertTrue("expected message not displayed \"" + message + "\"",categoryPage.SuccessfulAddProduct().contains(message));
        Assert.assertTrue("expected message not displayed \"" + qunatityMessage + "\"",categoryPage.QuantityProduct().contains(qunatityMessage));
        System.out.println("I will see a pop up confirming ive added " + numberItems + " item to the basket");
        System.out.println("Quantity will be " + numberItems);
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