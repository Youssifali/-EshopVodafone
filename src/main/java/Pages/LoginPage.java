package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "username")
    WebElement UserNameField;
    @FindBy(id = "password")
    WebElement PasswordField;
    @FindBy(id = "submitBtn")
    WebElement SubmitButton;
    public void EnterUserNameValue(String Arg){
        UserNameField.clear();
        UserNameField.sendKeys(Arg);
    }
    public void EnterPasswordValue(String Arg){
        PasswordField.clear();
        PasswordField.sendKeys(Arg);
    }
    public void ClickOnSubmitButton(){
        SubmitButton.click();
    }
}
