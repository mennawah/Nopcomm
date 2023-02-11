package org.example.StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.StepDefs.TestBase.driver;

public class ST_11_AddtoCompareList {
    P03_HomePage homePage = new P03_HomePage();

    WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(10));
    SoftAssert softAssert = new SoftAssert();

    @When("User click on add to comparelist button of HTC phone product")
    public void clickomCompareListBtn() throws InterruptedException {

        homePage.clickonComparelist().click();
        Thread.sleep(3000);}


        @Then("Green success message should appear")
            public void verifyTheSuccessMsg() {
                Boolean textfound = driver.getPageSource().contains("product comparison");
                System.out.println("MW");
                System.out.print(textfound);
                softAssert.assertTrue(textfound);
                softAssert.assertAll();

    }}
