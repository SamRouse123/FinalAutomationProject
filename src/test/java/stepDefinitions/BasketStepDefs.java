package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.CategoryPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class BasketStepDefs {
    LoginPage loginPage;
    HomePage homePage;
    CategoryPage categoryPage;

    public BasketStepDefs() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        categoryPage = new CategoryPage();
    }
    @Given("I am on the category page")
    public void iAmOnTheCategoryPage() {
        categoryPage.goToCategoryPage();
        System.out.println("on category page");
    }

    @When("I click blouse")
    public void iClickBlouse() {
        categoryPage.clickBlouse();
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

}
