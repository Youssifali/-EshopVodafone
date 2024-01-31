package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectItemPage extends PageBase{
    public SelectItemPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "add-to-cart")
    WebElement addToCart;
    public void ClickOnAddToCart(){
        addToCart.click();
    }
}
