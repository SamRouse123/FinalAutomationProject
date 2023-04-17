package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;

public class HomePageStepDefs {
    HomePage homePage;
    public HomePageStepDefs() {
        homePage = new HomePage();
    }

    @Given("I am on the homepage")
    public void iAmOnHomePage() {
        homePage.goToHomepage();

    }
}
