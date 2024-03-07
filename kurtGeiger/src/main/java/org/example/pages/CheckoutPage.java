package org.example.pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import freemarker.log.Logger;
import org.apache.log4j.LogManager;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final org.apache.log4j.Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer-email']")
    WebElement email;
    @CacheLookup
    @FindBy(id = "customer-password")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[@data-hookid=\"buttonSignIn\"]/span")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//input[@data-hookid='valueShippingMobileNo']")
    WebElement mobileNumber;

    @CacheLookup
    @FindBy(xpath = "//fieldset[@id='customer-email-fieldset']/div[2]/button")
    WebElement next;

    @CacheLookup
    @FindBy(xpath = "//input[@id='to-collection-point']")
    WebElement clickAndCollectFree;
    @CacheLookup
    @FindBy(css = "#custom-checkout-form-collect [class='input-text']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/div[1]")
    WebElement watfordOutlet;
    @CacheLookup
    @FindBy(xpath = "//button[@data-hookid='buttonReviewAndPay']")
    WebElement reviewAndPay;
    @CacheLookup
    @FindBy(xpath = "//*[@id='custom-checkout-form-collect']/fieldset/div/div[2]/div/button/span[1]")
    WebElement findCollectionPoint;

    public void setEmail(String Email) {
        sendTextToElement(email, Email);
    }

    public void setPassword(String Password) {
        sendTextToElement(password, Password);
    }

    public void setMobileNumber() {

        log.info("Enter Mobile Number");
        sendTextToElement(mobileNumber, "07517404443");
    }

    public void clickOnNext() {
        log.info("Enter Mobile Number");
        clickOnElement(next);
    }

    public void setSignInButton() {
        log.info("Enter Mobile Number");
        clickOnElement(signInButton);
    }


    public void clickRadioButton() {
        log.info("Enter Mobile Number");
        clickOnElement(clickAndCollectFree);
    }

    public void clickOnFindCollectionPoint() {

        log.info("Enter Mobile Number");clickOnElement(findCollectionPoint);
    }

    public void enterPostCode(String Postcode) {
        log.info("Enter Postcode");
        sendTextToElement(postCode, Postcode);
    }

    public void selectWatfordOutlet() {log.info("Selecting Watford Outlet");
        clickOnElement(watfordOutlet);
    }

    public void setReviewAndPay() {
        log.info("Click on Review and Pay");
        clickOnElement(reviewAndPay);
    }
}

