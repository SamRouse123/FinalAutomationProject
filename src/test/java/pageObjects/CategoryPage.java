package pageObjects;

import org.openqa.selenium.By;

public class CategoryPage extends BasePage{
    private static final String URL=("http://3.11.77.136/index.php?id_category=3&controller=category");
    private static final By BLOUSE = By.xpath("//img[@src='http://3.11.77.136/img/p/7/7-home_default.jpg']");
    private static final By ADD_TO_CART = By.cssSelector(".btn.btn-primary.add-to-cart");
    private static final By TEXT_SUCCESS_PAGE = By.xpath("//h4[@id='myModalLabel']");
    private static final By QUANTITY_ON_PAGE = By.xpath("//div[@class='col-md-5 divide-right']//p[2]");

    public void goToCategoryPage(){
        driver.get(URL);
    }

    public void clickBlouse(){
        waitAndClick(BLOUSE);
    }

    public void clickCheckout(){
        waitAndClick(ADD_TO_CART);
    }

    public String SuccessfulAddProduct(){
        return getTexOfThePage(TEXT_SUCCESS_PAGE);
    }

    public String QuantityProduct(){
        return getTexOfThePage(QUANTITY_ON_PAGE);
    }
}
