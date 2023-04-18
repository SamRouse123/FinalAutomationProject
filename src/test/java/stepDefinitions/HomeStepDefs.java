package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;

public class HomeStepDefs {
    HomePage homePage;

    public HomeStepDefs() {
        homePage = new HomePage();
    }

    @Given("I am on the homepage")
    public void iAmOnHomePage() {
        homePage.goToHomepage();
        System.out.println("I am on the homepage");
    }
}