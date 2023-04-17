package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.CreateAccountPage;

import java.util.Map;

public class AccountStepDefs {
    CreateAccountPage createAccountPage;

    public AccountStepDefs() {
        createAccountPage = new CreateAccountPage();
    }

    @Given("I click on create account")
    public void iClickCreateAccount() {
        createAccountPage.clickCreateAccount();
    }

    @When("^I click (Mr|Mrs) social title button$")
    public void iClickSocialTitleButton(String title) {
        createAccountPage.clickTitleButton(title);
    }

    @And("I fill out the information table")
    public void FillInNewAccountInfoAndSave(DataTable table){
        Map<String, String> mapOfTable=table.asMap();
        createAccountPage.fillInAccount(mapOfTable);
        createAccountPage.clickSave();
        }

    @Then("I will be logged in as a new user")
    public void iWillBeLoggedInAsANewUser() {
        String nameOfNewUser = "Samuel Rouse";
        Assert.assertTrue("expected message not displayed \"" + nameOfNewUser + "\"",createAccountPage.successfulNewUser().contains(nameOfNewUser));
    }
}
