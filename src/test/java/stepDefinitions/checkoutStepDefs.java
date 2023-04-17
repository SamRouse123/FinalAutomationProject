package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.text.CaseUtils;
import org.openqa.selenium.By;
import pageObjects.ShoppingCartPage;

import java.util.Map;

import static stepDefinitions.Hooks.driver;

public class checkoutStepDefs {

    ShoppingCartPage shoppingCartPage;

    public checkoutStepDefs() {
        shoppingCartPage = new ShoppingCartPage();
    }

    @Given("I am on the Shopping Cart Page and I proceed to checkout")
    public void goFromShoppingCartToCheckout() {
        shoppingCartPage.goToShoppingCart();
    }

    @When("I fill in my personal information")
    public void iFillInMyPersonalInformationAddressAndShippingMethod(DataTable table) {
        Map<String, String> mapOfTable = table.asMap();
        shoppingCartPage.fillInAddress(mapOfTable);
        shoppingCartPage.clickContinueButton();

    }
    @When("provide my address and shipping method")
    public void provideMyAddressAndShippingMethod(DataTable table) {
        Map<String, String> mapOfTable = table.asMap();
        shoppingCartPage.fillInAddress(mapOfTable);
        shoppingCartPage.clickContinueButton();
        shoppingCartPage.clickStateDropDown();
//        shoppingCartPage.chooseState("Alabama");
    }
}

