package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ST_10_Follow {
    P03_HomePage homePage = new P03_HomePage();

    @When("User click on Facebook icon")
    public void clickFacebook() {
        homePage.FollowFacebook().click();
    }

    @When("User click on Twitter icon")
    public void clickTwitter() {homePage.FollowTwitter().click();
    }



    @When("User click on Youtube icon")
    public void clickYoutube() {homePage.FollowYoutube().click();
    }

    @Then("this link {string} is opened")
    public void validateLink(String url) {

        List<String> tabs = new ArrayList<>(TestBase.driver.getWindowHandles());
        try {
            Thread.sleep(2000);
            ArrayList<String> openedTabs = new ArrayList<String>(TestBase.driver.getWindowHandles());
            if(openedTabs.size()>1) {
                TestBase.driver.switchTo().window(tabs.get(1));
            }
            else {
                TestBase.driver.switchTo().window(tabs.get(0));
            }

        }
        catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        Assert.assertEquals(TestBase.driver.getCurrentUrl(), url);
        TestBase.driver.close();
        TestBase.driver.switchTo().window(tabs.get(0));
    }
}
