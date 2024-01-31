package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "userProfileMenu")
    WebElement userProfileMenu;
    @FindBy(id = "searchInput")
    WebElement searchInput;
    @FindBy(xpath = "//p[contains(.,'ساعة سامسونج جالاكسي ووتش 6 الذكية بتصميم كلاسيكي أسود /47 ملم')]")
    WebElement item1;
    @FindBy(xpath = "//p[@class='main-text main-text-trim bodyFont'][contains(.,'Apple Watch Series 8 GPS 45mm')]")
    WebElement item2;
    @FindBy(className = "product-result")
    WebElement SearchResult;
    @FindBy(xpath = "//button[contains(@id,'onetrust-reject-all-handler')]")
    WebElement AccpetCookies;

    public void ClickOnUserProfileMenu(){
        userProfileMenu.click();
    }
    public void AcceptCookies(){
        AccpetCookies.click();
    }
    public void EnterSearchValue(String Arg){
        searchInput.clear();
        searchInput.sendKeys(Arg);
    }
    public void ClickOnItem1(){
        item1.click();
    }
    public void ClickOnItem2(){
        item2.click();
    }
    public void SelectSearchResults(){
        SearchResult.click();
    }
}
