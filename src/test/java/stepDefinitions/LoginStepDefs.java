package stepDefinitions;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginStepDefs {
    LoginPage loginPage;
    HomePage homePage;

    public LoginStepDefs() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }
}