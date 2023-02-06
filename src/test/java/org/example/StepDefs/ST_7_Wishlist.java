package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ST_7_Wishlist {
    P03_HomePage homePage = new P03_HomePage();

    WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(10));
    SoftAssert softAssert = new SoftAssert();

    @When("User click on add to wishlist button of HTC phone product")
    public void clickOnWishListBtn() {
        homePage.clickonWishlist().click();


    }

    @And("User click on Wishlist tab")
    public void clickWishlistBtn() throws InterruptedException {
        Thread.sleep(500);
        wait.until(ExpectedConditions.invisibilityOf(homePage.successMsg()));
        homePage.wishListTab().click();
    }

    @Then("Green success message should be shown to the user")
    public void verifyTheSuccessMsg() throws InterruptedException {
        Thread.sleep(500);
        softAssert.assertTrue(homePage.successMsg().isDisplayed());
        softAssert.assertEquals(homePage.successMsg().
                getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        softAssert.assertAll();
    }

    @Then("User should be navigated to wishlist page")
    public void checkProductQuantity() {
        int productQuantity = Integer.parseInt(homePage.productQuantity().getAttribute("value"));
        softAssert.assertTrue(productQuantity > 0);
        softAssert.assertAll();
    }
}
