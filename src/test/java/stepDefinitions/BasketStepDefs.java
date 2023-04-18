package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasketPage;
import pageObjects.TShirtPage;
import pageObjects.HomePage;

public class BasketStepDefs {
    HomePage homePage;
    BasketPage basketPage;
    TShirtPage tShirtPage;

    public BasketStepDefs() {
        homePage = new HomePage();
        basketPage = new BasketPage();
        tShirtPage = new TShirtPage();
    }

    @Given("I am on the homepage")
    public void iAmOnHomePage() {
        homePage.goToHomepage();
    }

    @When("I select an item")
    public void clickOnItem() {
        homePage.clickOnDress();
    }

    @And("Click add to cart button and proceed to checkout")
    public void addToCart() {
        tShirtPage.clickAddToCart();
        tShirtPage.clickProceedToCheckOut();
    }

    @And("I increase the quantity of item")
    public void increaseItemQuantity() {
        basketPage.clickIncreaseQuantity();
    }

    @Then("I will have another item")
    public void checkIncreasedQuantity() {
        basketPage.checkForIncreasedItems("2");
    }
}
