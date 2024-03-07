package org.example.pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
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
    @FindBy(xpath = "//input[@id='WHVGAV8']")
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
        sendTextToElement(mobileNumber, "07517404443");
    }

    public void clickOnNext() {
        clickOnElement(next);
    }

    public void setSignInButton() {
        clickOnElement(signInButton);
    }


    public void clickRadioButton() {
        clickOnElement(clickAndCollectFree);
    }

    public void clickOnFindCollectionPoint() {
        clickOnElement(findCollectionPoint);
    }

    public void enterPostCode() {
        sendTextToElement(postCode, "WD63QJ");
    }

    public void selectWatfordOutlet() {
        clickOnElement(watfordOutlet);
    }

    public void setReviewAndPay() {
        clickOnElement(reviewAndPay);
    }
}

