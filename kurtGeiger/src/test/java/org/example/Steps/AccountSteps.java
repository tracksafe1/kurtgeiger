package org.example.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pages.AccountsPage;
import org.example.pages.AddressBookPage;
import org.example.pages.HomePage;

public class AccountSteps {
    @And("^I click on create account icon$")
    public void iClickOnCreateAccountIcon() {
        new HomePage().setAccountIcon();
    }

    @And("^click on create account$")
    public void clickOnCreateAccount() {
        new AccountsPage().clickOnCreateAccount();
    }


    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() {
        new AccountsPage().clickOnCreateAccountButton();
    }

    @And("^Enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void enter(String firstname, String lastname, String email, String password, String confirmPassword) {

        new AccountsPage().setTittle("Ms");
        new AccountsPage().setFirstName(firstname);
        new AccountsPage().setLastName(lastname);
        new AccountsPage().setEmail(email);
        new AccountsPage().setPassword(password);
        new AccountsPage().setConfirmPassword(confirmPassword);
    }


    @And("^I click on addressBook$")
    public void iClickOnAddressBook() {
        new AccountsPage().setAddressBook();
    }

    @And("^I enter PHONE NUMBER$")
    public void iEnterPHONENUMBER() {
        new AddressBookPage().setPhoneNumber("7777777777");

    }

    @And("^I enter POSTCODE$")
    public void iEnterPOSTCODE() {
        new AddressBookPage().setPostCode("WD63QJ");
    }

    @And("^click on FIND ADDRESS$")
    public void clickOnFINDADDRESS() {
        new AddressBookPage().clickOnFindAddress();
    }

    @And("^I select ADDRESS from dropdown$")
    public void iSelectADDRESSFromDropdown() {
        new AddressBookPage().clickOnSelectAddress(5);
    }

    @And("^I click on SAVE ADDRESS$")
    public void iClickOnSAVEADDRESS() {
        new AddressBookPage().clickOnSaveAddress();
    }

    @And("^I click on add new address$")
    public void iClickOnAddNewAddress() {
        new AddressBookPage().clickOnAddNewAddress();
    }

    @And("^I enter New POSTCODE$")
    public void iEnterNewPOSTCODE() {
        new AddressBookPage().setPostCode("HA55DS");
    }

    @And("^I click on Default Billing Address$")
    public void iClickOnDefaultBillingAddress() {
        new AddressBookPage().clickOnDefaultBillingAddress();
    }

    @Then("^I click on SAVE ADDRESS again$")
    public void iClickOnSAVEADDRESSAgain() {
        new AddressBookPage().clickOnSaveAddress();
    }
}
