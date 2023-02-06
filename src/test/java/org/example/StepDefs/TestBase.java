package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    @Before
    public void openBrowser(){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        TestBase.driver = driver;

        driver.manage().window().maximize();

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
