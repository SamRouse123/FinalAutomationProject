package pageObjects;

public class HomePage extends BasePage {
    private static final String URL=("http://3.11.77.136/index.php");
    public void goToHomepage(){
        driver.get(URL);
    }

}
