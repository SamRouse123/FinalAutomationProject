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
    AccountPage accountPage;

    public loginStepDefs() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        accountPage = new AccountPage();
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
    @And("^I use credentials email \"(.+@.+)\" and password \"(.*?)\" to sign in$")
    public void useCredentialsToSignIn(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickToSignInAsUser();
        System.out.println("Logged in with the email: " + email + " and the password: " + password);
    }

    @Then("I will be logged in as {string}")
    public void iWillBeLoggedInAsAUser(String user) {
        Assert.assertEquals(user, accountPage.getUsername());
        System.out.println("Logged in successfully");
    }

//    @When("^I click on \"(.*?)\"$")
//    public void clickSignIn(String elementToClick) {
//        if (elementToClick.equals("sign in")) {
//            homePage.clickSignIn();
//        }
//        System.out.println("I have clicked on the " + elementToClick + " button");
//    }
}
