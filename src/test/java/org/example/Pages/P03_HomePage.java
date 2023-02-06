package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.StepDefs.TestBase.driver;

public class P03_HomePage {

    public WebElement switchCurrency(){
        By currencyDropDown = By.id("customerCurrency");
        return driver.findElement(currencyDropDown);
    }

    public List<WebElement> itemsPrices(){
        By itemsPrices = By.className("prices");
        return driver.findElements(itemsPrices);
    }

    public WebElement searchField(){
        By searchField = By.id("small-searchterms");
        return driver.findElement(searchField);
    }

    public WebElement searchBtn(){
        By searchBtn = By.xpath("//*[@class=\"button-1 search-box-button\"]");
        return driver.findElement(searchBtn);
    }

    public List<WebElement> searchResults(){
        By searchResults = By.className("item-box");
        return driver.findElements(searchResults);
    }



    public WebElement electronicsMainCategory(){
        By electronicsMainCategory = By.xpath("//ul[@class='top-menu notmobile']/li[2]/a");
        return driver.findElement(electronicsMainCategory);
    }

    public WebElement cellPhonesSubCategory(){
        By cellPhonesSubCategory = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a");
        return driver.findElement(cellPhonesSubCategory);
    }

    public WebElement subcategoryPageTitle(){
        By subCategoryPageTitle = By.xpath("//*[@class='page-title']");
        return driver.findElement(subCategoryPageTitle);
    }



    public WebElement FollowFacebook(){
        By faceBookIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[1]");
        return driver.findElement(faceBookIcon);
    }

    public WebElement FollowTwitter(){
        By twitterIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[2]");
        return driver.findElement(twitterIcon);
    }

    public WebElement FollowYoutube(){
        By twitterIcon = By.xpath("//div[@class=\"footer-block follow-us\"]/div/ul/li[4]");
        return driver.findElement(twitterIcon);
    }

    public WebElement clickonWishlist(){
        By HTCWishListBtn = By.xpath("(//*[@class=\"button-2 add-to-wishlist-button\"])[3]");
        return driver.findElement(HTCWishListBtn);
    }

    public WebElement successMsg(){
        By successMessage = By.xpath("//*[@class=\"bar-notification success\"]");
        return driver.findElement(successMessage);
    }

    public WebElement wishListTab(){
        By wishListTab = By.xpath("//*[@class=\"wishlist-label\"]");
        return driver.findElement(wishListTab);
    }

    public WebElement productQuantity(){
        By productQty = By.xpath("//*[@class=\"qty-input\"]");
        return driver.findElement(productQty);
    }
}
