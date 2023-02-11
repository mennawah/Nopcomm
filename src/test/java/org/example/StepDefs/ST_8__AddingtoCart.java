package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.TestBase.driver;
public class ST_8__AddingtoCart {
    SoftAssert softAssert = new SoftAssert();

    @And("navigates to gift card page")
    public void AddingtoCart() {
        driver.get("https://demo.nopcommerce.com/25-virtual-gift-card");}
    @When("user can select a product and put it in shopping cart")
    public void SelectproductinCart() throws InterruptedException {

        driver.findElement(By.id("giftcard_43_RecipientName")).sendKeys("Donia");
        driver.findElement(By.id("giftcard_43_RecipientEmail")).sendKeys("donia@gmail.com");
        driver.findElement(By.id("giftcard_43_SenderName")).sendKeys("menna");
        driver.findElement(By.id("giftcard_43_SenderEmail")).sendKeys("Menna@gmail.com");
        driver.findElement(By.id("giftcard_43_Message")).sendKeys("Happy birthday");
        driver.findElement(By.id("add-to-cart-button-43")).click();
        driver.findElement(By.cssSelector("a[href=\"/cart\"]")).click();
    }
    @Then("user can see the selected product in the shopping cart")
    public void seeProduct(){
        Assert.assertTrue(driver.findElement(By.id("updatecart")).isDisplayed());

        Boolean textfound = driver.getPageSource().contains("shopping cart");
        System.out.println("MW");
        System.out.print(textfound);
        softAssert.assertTrue(textfound);
        softAssert.assertAll();

    }

}
