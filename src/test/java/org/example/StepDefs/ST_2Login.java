package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.TestBase.driver;

public class ST_2Login {
    P02_Login login = new P02_Login();

    @Given("user go to login")
    public void openLoginPage(){
        login.loginLink().click();
    }

    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String type, String username, String password) {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("user click on login button")
    public void clickOnLoginButton() {
        login.clickloginButton().click();
    }

    @Then("user is logged in to nopcommerce")
    public void userLoginSuccessfully() {
        SoftAssert softAssert= new SoftAssert();

        String myAccountTabactualResult = login.MyAccount().getText();
        String myAccountTabexpectedResult = "My account";
        softAssert.assertEquals(myAccountTabactualResult,myAccountTabexpectedResult);
        String currentURLActualResult = login.getCurrentURL();
        String currentURLexpectedResult = "https://demo.nopcommerce.com/";
        softAssert.assertEquals(currentURLActualResult,currentURLexpectedResult);
        softAssert.assertAll();
    }

    @Then("error message should appear login is unsuccessful")
    public void unsuccessfullogin() {
        SoftAssert softAssert= new SoftAssert();

        String actualResult = login.errorMessage().getText();
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String MsgColor = login.errorMessage().getCssValue("color");
        softAssert.assertEquals(actualResult,expectedResult);
        softAssert.assertEquals(MsgColor,"rgba(228, 67, 75, 1)");
        System.out.println("Color = " + MsgColor);
        softAssert.assertAll();
    }
}
