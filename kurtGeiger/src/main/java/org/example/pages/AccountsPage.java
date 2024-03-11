package org.example.pages;

import org.apache.log4j.LogManager;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage extends Utility {
    private static final org.apache.log4j.Logger log = LogManager.getLogger(AccountsPage.class.getName());

    public AccountsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Create Account']")
    WebElement createAccount;
    @CacheLookup
    @FindBy(id = "prefix")
    WebElement tittle;
    @CacheLookup
    @FindBy(id = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "email_address")
    WebElement email;
    @CacheLookup
    @FindBy(id = "password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "password-confirmation")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(css = "button[title='Create an account'] span")
    WebElement createAnAccountButton;
    @CacheLookup
    @FindBy(css = ".icon-address-book.item-title")
    WebElement addressBook;


    public void clickOnCreateAccount() {
        log.info("Click on Create Account ");
        clickOnElement(createAccount);
    }

    public void setTittle(String Tittle) {
        log.info("Click on Tittle and select Tittle from Dropdown ");
        clickOnElement(tittle);
        selectByVisibleTextFromDropDown(tittle, Tittle);
    }

    public void setFirstName(String FirstName) {
        log.info("Enter Firstname ");
        sendTextToElement(firstName, FirstName);
    }

    public void setLastName(String LastName) {
        log.info("Enter LastName ");
        sendTextToElement(lastName, LastName);
    }

    public void setEmail(String Email) {
        log.info("Enter Email ");
        sendTextToElement(email, Email);
    }

    public void setPassword(String Password) {
        log.info("Enter Password ");
        sendTextToElement(password, Password);
    }

    public void setConfirmPassword(String ConfirmPassword) {
        log.info("Enter confirmPassword ");
        sendTextToElement(confirmPassword, ConfirmPassword);
    }

    public void clickOnCreateAccountButton() {
        log.info("click on create an account button ");
        clickOnElement(createAnAccountButton);
    }

    public void setAddressBook() {
        log.info("Enter Address Book ");
        clickOnElement(addressBook);
    }
}
