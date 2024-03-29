package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@data-hookid='globalHeaderAccountIcon']")
    WebElement accountIcon;
    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement AcceptAllCookies;
    @CacheLookup
    @FindBy(xpath = "//ul[@id='mainnavigation']/li[2]")
    WebElement shoes;
    @CacheLookup
    @FindBy(id = "women-shoes-sneakers")
    WebElement Sneakers;
    @CacheLookup
    @FindBy(xpath = "//button[@id='bx-close-inside-2036729']//*[name()='svg']")
    WebElement NoThanks;

    public void setAccountIcon() {
        clickOnElement(accountIcon);
    }

    public void clickAcceptCookies() throws InterruptedException {
        Thread.sleep(2000);
        log.info("clicking on AcceptAllCookies");
        clickOnElement(AcceptAllCookies);
    }


    public void clickShoes() {
        log.info("clicking on shoes");
        mouseHoverToElement(shoes);
    }

    public void selectingSneakers() {
        log.info("clicking on Kgkurtgeiger in shoes category");
        // mouseHoverToElementAndClick(Sneakers);
        clickOnElement(Sneakers);
    }

    public void clickingNoThanks() {
        log.info("clicking on NoThanks");
        clickOnElement(NoThanks);
    }


}

