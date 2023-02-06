package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ST_4_SearchProducts {
    P03_HomePage search = new P03_HomePage();
    SoftAssert softAssert = new SoftAssert();

    @When("User search with product name {string} in search field")
    public void searchForProduct(String name) {
        search.searchField().sendKeys(name);
    }


    @And("User click search button")
    public void clickSearchBtn() {
        search.searchBtn().click();
    }

    @Then("results will appear if exists {string}")
    public void productAppears(String name) {
        softAssert.assertTrue(TestBase.driver.getCurrentUrl().toLowerCase().contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> products = search.searchResults();
        for (WebElement product : products) {
            softAssert.assertTrue(product.getText().toLowerCase().contains(name));
        }

        softAssert.assertAll();
    }


}
