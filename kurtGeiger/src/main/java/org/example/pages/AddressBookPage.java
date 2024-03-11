package org.example.pages;

import org.apache.log4j.LogManager;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage extends Utility {
    private static final org.apache.log4j.Logger log = LogManager.getLogger(AddressBookPage.class.getName());

    public AddressBookPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "telephone")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(id = "zip")
    WebElement postCode;
    @CacheLookup
    @FindBy(css = ".action.primary.address-finder-btn.js-address-finder-btn")
    WebElement findAddress;
    @CacheLookup
    @FindBy(css = ".address-list-select.js-address-list-select")
    WebElement selectAddress;
    @CacheLookup
    @FindBy(css = "button[title='Save Address']")
    WebElement saveAddress;
    @CacheLookup
    @FindBy(css = "button[title='Add New Address'] span")
    WebElement addNewAddress;
    @CacheLookup
    @FindBy(css = "label[for='primary_billing'] span[class='c-form-checkbox__visible-checkbox']")
    WebElement defaultBillingAddress;

    public void setPhoneNumber(String PhoneNumber) {
        log.info("Enter Phone Number");
        sendTextToElement(phoneNumber, PhoneNumber);
    }

    public void setPostCode(String PostCode) {
        log.info("Enter Postcode ");
        sendTextToElement(postCode, PostCode);
    }

    public void clickOnFindAddress() {
        log.info("click on Find Address");
        clickOnElement(findAddress);
    }

    public void clickOnSelectAddress(int SelectAddress) {
        log.info("Select Address from dropdown ");
        clickOnElement(selectAddress);
        selectByIndexFromDropDown(selectAddress, SelectAddress);
    }

    public void clickOnSaveAddress() {
        log.info("Save Address ");
        clickOnElement(saveAddress);
    }

    public void clickOnAddNewAddress() {
        log.info("Click on Add new Address ");
        clickOnElement(addNewAddress);
    }

    public void clickOnDefaultBillingAddress() {
        log.info("click on Default Billing Address ");
        clickOnElement(defaultBillingAddress);
    }
}
