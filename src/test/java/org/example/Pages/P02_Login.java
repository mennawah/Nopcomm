package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefs.TestBase.driver;

public class P02_Login {

    public WebElement loginLink(){
        By loginLink = By.className("ico-login");
        return driver.findElement(loginLink);
    }

    public WebElement clickloginButton() {
        By loginButton = By.cssSelector("button[class=\"button-1 login-button\"]");
        return driver.findElement(loginButton);
    }

    public WebElement MyAccount() {
        By myAccount = By.cssSelector("a[class=\"ico-account\"]");
        return driver.findElement(myAccount);
    }
    public String getCurrentURL(){
        String link = driver.getCurrentUrl();
        return link;
    }

    public WebElement errorMessage() {
        By unSuccessfullLoginMsg = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        return driver.findElement(unSuccessfullLoginMsg);
    }

}
