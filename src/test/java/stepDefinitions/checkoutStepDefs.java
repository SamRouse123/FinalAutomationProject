package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OrderConfirmationPage;
import pageObjects.ShoppingCartPage;

import java.util.Map;

public class checkoutStepDefs {

    ShoppingCartPage shoppingCartPage;
    OrderConfirmationPage orderConfirmationPage;

    public checkoutStepDefs() {
        shoppingCartPage = new ShoppingCartPage();
        orderConfirmationPage = new OrderConfirmationPage();
    }

    @Given("I am on the Shopping Cart Page and I proceed to checkout")
    public void goFromShoppingCartToCheckout() {
        shoppingCartPage.goToShoppingCart();
    }

    @When("I fill in my personal information")
    public void iFillInMyPersonalInformationAddressAndShippingMethod(DataTable table) {
        Map<String, String> mapOfTable = table.asMap();
        shoppingCartPage.fillInAddress(mapOfTable);
        shoppingCartPage.clickPersonalInformationContinueButton();

    }
    @When("provide my address and shipping method")
    public void provideMyAddressAndShippingMethod(DataTable table) {
        Map<String, String> mapOfTable = table.asMap();
        shoppingCartPage.fillInAddress(mapOfTable);
        shoppingCartPage.selectState("Alabama");
        shoppingCartPage.clickAddressContinueButton();
        shoppingCartPage.clickShippingContinueButton();
    }

    @Then("I can make my payment")
    public void iCanMakeMyPayment() {
        shoppingCartPage.clickPayByBankWire();
        shoppingCartPage.clickAcceptTermsAndConditions();
        shoppingCartPage.clickOrderWithObligationButton();
        orderConfirmationPage.assertOrderConfirmed();
    }
}

