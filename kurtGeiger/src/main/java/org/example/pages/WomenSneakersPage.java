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
    @FindBy(xpath = "//span[normalize-space()='Sort By']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//div[@id='__next']/div[2]/main/div[4]/div/div[2]/button/span[2]")
    WebElement filters;

    @CacheLookup
    @FindBy(xpath = "//div[@id='__next']/div/main/div[4]/div/div[3]/div/div[2]/div/label")
    WebElement bestSellers;

    @CacheLookup
    @FindBy(xpath="//div[@id='__next']/div[2]/main/div[4]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div[3]/div/label/span")
    WebElement size4;
    @CacheLookup
    @FindBy(xpath="//div[@id='__next']/div/main/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/p")
    WebElement size;
   @CacheLookup
    @FindBy(xpath=" //div[@id='__next']/div/main/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[2]/button[3]")
    WebElement size37;
    @CacheLookup
    @FindBy(xpath="//div[@id='__next']/div/main/div[4]/div/div[2]/div/div[1]/div[2]/button")
    WebElement ApplyFilters;
    @CacheLookup
    @FindBy(xpath="//img[@alt='Laney Octavia Sneaker - white']")
    WebElement LaneyOctaviaSneaker;
    @CacheLookup
    @FindBy(xpath="//div[@id='__next']/div[2]/main/div[3]/div[2]/div[2]/div[2]/div[1]/button")
    WebElement AddToBag;
    @CacheLookup
    @FindBy(xpath="//*[@id=\"header\"]/div/div[1]/div[3]/div[4]/div[1]")
    WebElement BagIcon;
    @CacheLookup
    @FindBy(xpath="//button[@data-hookid='viewAndCheckoutSecurelyButton']")
    WebElement checkoutSecurely;
    @CacheLookup
    @FindBy(xpath="//button[@data-hookid='checkoutButton']")
    WebElement checkoutSecurely1;



    public void mouseHoverSortby() {
        log.info("MouseHover on SortBy ");
        mouseHoverToElement(sortBy);
    }

    public void mouseHoverAndClickBestsellers() {
        log.info(" MouseHover And Click on Bestsellers ");
        mouseHoverToElementAndClick(bestSellers);
    }
    public void mouseHoverFilters() {
        log.info("MouseHover on Filters ");
        mouseHoverToElement(filters);
    }
    public void SelectSize() {
        log.info(" MouseHover And select size4/37 ");
        clickOnElement(size4);
    }
    public void clickOnAppliedFilters(){
        log.info(" Click on ApplyFilters ");
        clickOnElement(ApplyFilters);
    }public void clickOnLaneyOctaviaSneaker(){
        log.info(" Click on Laney Octavia Sneaker ");
        clickOnElement(LaneyOctaviaSneaker);
    }
    public void sizeSelected(){
       clickOnElement(size);
       clickOnElement(size37);
    }
    public void clickAddToBag(){
        clickOnElement(AddToBag);
    }
    public void mouseHoverOnBagIcon(){
        mouseHoverToElement(BagIcon);
        clickOnElement(checkoutSecurely);
    }
    public void setCheckoutSecurely1(){
        clickOnElement(checkoutSecurely1);
    }
}







