package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ST_5SelectingSubcateogry {
    P03_HomePage homePage = new P03_HomePage();
    SoftAssert softAssert = new SoftAssert();

    String subCategory;

    @When("User can click on a category and select a subcateogry")
    public void selectSubcategory() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(homePage.electronicsMainCategory()).
                moveToElement(homePage.electronicsMainCategory()).build().perform();
        WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(homePage.electronicsMainCategory()));
        subCategory = homePage.cellPhonesSubCategory().getText().toLowerCase().trim();
        System.out.println("!!!!" + subCategory + "!!!!");
        actions.moveToElement(homePage.electronicsMainCategory()).
                moveToElement(homePage.cellPhonesSubCategory())
                .click().build().perform();

    }

    @Then("User can see the results of subcategory")
    public void subcategoryResults() {
        softAssert.assertTrue(TestBase.driver.getCurrentUrl().contains("cell-phones"));
        softAssert.assertEquals(homePage.subcategoryPageTitle().getText(), "Cell phones");
        softAssert.assertTrue(homePage.subcategoryPageTitle().getText().
                toLowerCase().equals(subCategory));
        softAssert.assertAll();
    }
}
