package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.StepDefs.TestBase.driver;
public class ST_6_FilterWithColor {
    @And("navigates to shoes display page")
    public void filterwithColor() {
        driver.get("https://demo.nopcommerce.com/shoes");
    }
    @When("user choose a color from filter option")
    public void chooseColor() throws InterruptedException {
        driver.findElement(By.id("attribute-option-15")).click();}
    @Then("user can find the item with the color he chooses")
    public void findItemwithColor(){
        Assert.assertTrue(driver.findElement(By.cssSelector
                ("a[href=\"/adidas-consortium-campus-80s-running-shoes\"]")).isDisplayed());}

}
