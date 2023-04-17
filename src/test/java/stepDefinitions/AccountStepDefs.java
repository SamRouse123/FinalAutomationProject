package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.CreateAccount;

public class AccountStepDefs {
    CreateAccount createAccount;

    public AccountStepDefs(){
        createAccount = new CreateAccount();
    }
    @Given("I click on create account")
    public void iClickCreateAccount(){
        createAccount.clickCreateAccount();
    }

    @When("^I click (Mr|Mrs) social title button$")
    public void iClickSocialTitleButton(String title) {
        createAccount.clickTitleButton(title);
    }
}
