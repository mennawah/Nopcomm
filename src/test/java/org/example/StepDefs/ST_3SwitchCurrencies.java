package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ST_3SwitchCurrencies {
    P03_HomePage homePage = new P03_HomePage();
    P02_Login login = new P02_Login();

    @Given("User navigates to Home page")
    public void validateHomePage() {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(TestBase.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/"));
    }
    @When("User choose euro currency")
    public void selectOtherCurrency() {
        Select select = new Select(homePage.switchCurrency());
        select.selectByVisibleText("Euro");
    }
    @Then("user can see all the prices are changed from dollar to euro")
    public void pricesCurrencyChanged() {
        List<WebElement> itemsPrices = homePage.itemsPrices();
        for(WebElement itemPrice : itemsPrices){
            Assert.assertTrue(itemPrice.getText().contains("€"));
        }
    }
}
