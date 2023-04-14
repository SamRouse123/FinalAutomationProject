package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class loginStepDefs {
    LoginPage loginPage;
    HomePage homePage;

    public loginStepDefs() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
    @Given("I am on the homepage")
    public void iAmOnHomePage(){
        homePage.goToHomepage();
        System.out.println("I am on the homepage");
    }
    @When("I click on Sign In")
    public void clickSignIn(){
        homePage.clickSignIn();
        System.out.println("I am on the sign in page");
    }
}
