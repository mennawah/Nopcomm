package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefs.TestBase.driver;

public class P01_Register {

    public WebElement registrationPage(){
        By registerLink = By.className("ico-register");
        return driver.findElement(registerLink);
    }

    public WebElement clickGenderType() {
        By genderCheckBox = By.id("gender-female");
        return driver.findElement(genderCheckBox);
    }

    public WebElement WriteFirstName() {
        By insertFirstName = By.id("FirstName");
        return driver.findElement(insertFirstName);
    }

    public WebElement WriteLastName() {
        By insertLastName = By.id("LastName");
        return driver.findElement(insertLastName);
    }

    public WebElement chooseBirthingDay() {
        By selectBirthDay = By.name("DateOfBirthDay");
        return driver.findElement(selectBirthDay);
    }

    public WebElement chooseBirthMonth() {
        By selectBirthMonth = By.name("DateOfBirthMonth");
        return driver.findElement(selectBirthMonth);
    }

    public WebElement chooseBirthYear() {
        By selectBirthYear = By.name("DateOfBirthYear");
        return driver.findElement(selectBirthYear);
    }

    public WebElement enterEmail() {
        By emailAddress = By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]");
        return driver.findElement(emailAddress);
    }

    public String validEmail() {
        return "Mennatest@gmail.com";
    }

    public WebElement enterPassword() {
        By passwordfield = By.id("Password");
        return driver.findElement(passwordfield);
    }

    public String validPassword() {
        return "Valid@2023";
    }

    public WebElement enterConfirmPassword() {
        By confirmPassword = By.id("ConfirmPassword");
        return driver.findElement(confirmPassword);
    }

    public WebElement clickOnregister() {
        By registerButton = By.cssSelector("button[name=\"register-button\"]");
        return driver.findElement(registerButton);
    }

    public WebElement showSuccessMessage() {
        By successMessage = By.cssSelector("div[class=\"result\"]");
        return driver.findElement(successMessage);
    }

    public WebElement confirmPassTxtField() {
        return null;
    }
}
