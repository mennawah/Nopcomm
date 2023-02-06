package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class ST_1Registration {
    P01_Register register = new P01_Register();


    @Given("user go to register page")
    public void registrationLink(){
        register.registrationPage().click();
    }

    @When("user click on Gender type")
    public void ClickGender() {
        register.clickGenderType().click();
    }

    @And("user write first name")
    public void enterFirstName() {

        register.WriteFirstName().click();

        register.WriteFirstName().sendKeys("Menna");
    }

    @And("user write last name")
    public void enterLastName() {
        register.WriteLastName().sendKeys("Wahby");
    }

    @And("user choose birth date")
    public void writeBirthDate() {
        Select select = new Select(register.chooseBirthingDay());
        select.selectByValue("20");

        select = new Select(register.chooseBirthMonth());
        select.selectByValue("4");

        select = new Select(register.chooseBirthYear());
        select.selectByValue("1992");
    }

    @And ("user write valid email")
    public void enterEmail() {
        register.enterEmail().sendKeys(register.validEmail());
    }


    @And ("user write password matches the criteria")
    public void enterPassword() {
        register.enterPassword().sendKeys(register.validPassword());
    }

    @And ("user write the password in confirm password field")
    public void enterConfirmPassword() { register.enterConfirmPassword().sendKeys(register.validPassword()); }

    @And ("user clicks on register button")
    public void clickRegister() {
        register.clickOnregister().click();
    }

    @Then("user is registered successfully")
    public void userCanSuccessfullyRegister() {
        SoftAssert softAssert= new SoftAssert();
        String actualResult = register.showSuccessMessage().getText();
        String expectedResult = "Your registration completed";
        String MsgColor = register.showSuccessMessage().getCssValue("color");
        softAssert.assertEquals(actualResult,expectedResult);
        softAssert.assertEquals(MsgColor,"rgba(76, 177, 124, 1)");
        System.out.println("Color = " + MsgColor);
    }
}
