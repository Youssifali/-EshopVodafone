package BDDTests;

import Configuration.loaddataproperties;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SelectItemPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import utilities.HooksFile;

import java.time.Duration;


public class Stepdef{
    HomePage homePage;
    LoginPage loginPage;
    SelectItemPage selectItemPage;
    String email = loaddataproperties.UserData.getProperty("useremail");
    String password = loaddataproperties.UserData.getProperty("password");
    String item = loaddataproperties.UserData.getProperty("item3");

    @Given("Click Login Profile Icon")
    public void click_login_profile_icon(){
        homePage = new HomePage(HooksFile.driver);
        homePage.AcceptCookies();
        homePage.ClickOnUserProfileMenu();
    }
    @Given("Enter UserName Value")
    public void enter_user_name_value() {
        loginPage = new LoginPage(HooksFile.driver);
        loginPage.EnterUserNameValue(email);
    }
    @Given("Enter Password Value")
    public void enter_password_value() {
        loginPage = new LoginPage(HooksFile.driver);
        loginPage.EnterPasswordValue(password);
    }
    @Given("Click On Submit Button")
    public void click_on_submit_button() {
        loginPage = new LoginPage(HooksFile.driver);
        loginPage.ClickOnSubmitButton();
    }
    @Given("Click On The First Item")
    public void click_on_the_first_item() {
        homePage = new HomePage(HooksFile.driver);
        homePage.ClickOnItem1();
    }
    @Then("Click On Add To Cart")
    public void click_on_add_to_cart() {
        selectItemPage = new SelectItemPage(HooksFile.driver);
        selectItemPage.ClickOnAddToCart();
    }
    @Then("Navigate Back To Home Page")
    public void navigate_back_to_home_page() {
        HooksFile.driver.navigate().back();
    }
    @Then("Click On The Second Item")
    public void click_on_the_second_item() {
        homePage = new HomePage(HooksFile.driver);
        homePage.ClickOnItem2();
    }
    @Then("Add The Second Item To cart")
    public void add_the_second_item_to_cart() {
        selectItemPage = new SelectItemPage(HooksFile.driver);
        selectItemPage.ClickOnAddToCart();
    }
    @Then("Search For The Third Item")
    public void search_for_the_third_item() {
        homePage = new HomePage(HooksFile.driver);
        homePage.EnterSearchValue(item);
        homePage.SelectSearchResults();
    }
    @Then("Add The Third Item To cart")
    public void add_the_third_item_to_cart() {
        selectItemPage = new SelectItemPage(HooksFile.driver);
        selectItemPage.ClickOnAddToCart();
    }
}
