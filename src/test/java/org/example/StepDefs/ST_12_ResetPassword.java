package org.example.StepDefs;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;


import static org.example.StepDefs.TestBase.driver;

public class ST_12_ResetPassword {

    SoftAssert softAssert = new SoftAssert();

    @When("click on Forgot Password and enter email")
    public void clickonForgotpassword() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).sendKeys("Mennatest@gmail.com");
        driver.findElement(By.id("Email")).sendKeys(Keys.RETURN);
        Thread.sleep(3000);}


        @Then("a message should be displayed to the user")
                public void MessageDisplayed(){
            Boolean textfound = driver.getPageSource().contains("Email with instructions has been sent to you");
            softAssert.assertTrue(textfound);
            softAssert.assertAll();



    }
}
