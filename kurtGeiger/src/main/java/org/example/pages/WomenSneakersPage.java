package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenSneakersPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public WomenSneakersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@data-hookid='plpFilterBarSortByContainer']")
    WebElement sortBy;



    @CacheLookup
    @FindBy(xpath = "//div[@id='__next']/div/main/div[4]/div/div[3]/div/div[2]/div/label")
    WebElement bestSellers;


    @CacheLookup
    @FindBy(xpath="//div[@data-hookid='pdpContentContainer']/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/p")
    WebElement size;
   @CacheLookup
    @FindBy(xpath="//div[@data-hookid='pdpContentContainer']/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[2]/button[3]")
    WebElement size37;


    @CacheLookup
    @FindBy(xpath="//p[contains(text(),'Laney Octavia Sneaker')]")
    WebElement laneyOctaviaSneaker;
    @CacheLookup
    @FindBy(css=".ButtonStyles__StyledButton-sc-6id8bd-0.ezlZCY.desktop")
    WebElement AddToBag;
    @CacheLookup
    @FindBy(css=".MinibagIconStyles__StyledMinibagCount-sc-17jjqxa-1.kvXEaw")
    WebElement BagIcon;
    @CacheLookup
    @FindBy(xpath="//button[@data-hookid='viewAndCheckoutSecurelyButton']")
    WebElement checkoutSecurely;
    @CacheLookup
    @FindBy(xpath="//button[@data-hookid='checkoutButton']")
    WebElement checkoutSecurely1;



    public void mouseHoverSortby() throws InterruptedException {
        log.info("MouseHover on SortBy ");
        Thread.sleep(3000);
        mouseHoverToElement(sortBy);
    }

    public void mouseHoverAndClickBestsellers() {
        log.info(" MouseHover And Click on Bestsellers ");
        mouseHoverToElementAndClick(bestSellers);
    }




    public void clickOnLaneyOctaviaSneaker() throws InterruptedException {
        log.info(" Click on Laney Octavia Sneaker ");
        Thread.sleep(5000);
        clickOnElement(laneyOctaviaSneaker);
    }
    public void sizeSelected(){
        log.info("clicking on size and selecting it");
       clickOnElement(size);
       clickOnElement(size37);
    }
    public void clickAddToBag(){
        clickOnElement(AddToBag);
    }
    public void mouseHoverOnBagIcon(){
        log.info("clicking on BagIcon");
        mouseHoverToElement(BagIcon);
        log.info(" clicking on checkoutSecurely");
        clickOnElement(checkoutSecurely);
    }
    public void setCheckoutSecurely1() throws InterruptedException {
        log.info("  clicking on checkoutSecurely");
        Thread.sleep(2000);
        clickOnElement(checkoutSecurely1);
    }
}







