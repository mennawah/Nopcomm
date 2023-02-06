package org.example.StepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.StepDefs.TestBase.driver;

public class ST_9_MakingsuccessfulOrder {
    @And("Proceed in checkout procedures")
    public void Checkout() throws InterruptedException {
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("Email")).sendKeys("Monz@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Monz@2023");

}
    @And("complete checkout")
    public void CompleteCheckout() throws InterruptedException {
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("Egypt");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Cairo");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("maadi");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("112233");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1133");
        driver.findElement(By.name("save")).click();
        //
        driver.findElement(By.id("shippingoption_1")).click();
        driver.findElement(By.className("button-1 shipping-method-next-step-button")).click();
        driver.findElement(By.className("button-1 payment-method-next-step-button")).click();
        driver.findElement(By.className("button-1 payment-info-next-step-button")).click();
        driver.findElement(By.className("button-1 confirm-order-next-step-button")).click();
    }
@Then("user can make a successful order")
public void orderCompleted(){
    Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/checkout/completed");

}
}
