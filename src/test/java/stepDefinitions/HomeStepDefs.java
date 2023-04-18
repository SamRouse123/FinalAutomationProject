package stepDefinitions;

import io.cucumber.java.en.Given;
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
    }
}
