package org.example.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.example.pages.CheckoutPage;

import static org.example.driverfactory.ManageDriver.driver;

public class CheckoutSteps {


    @And("^enter Email \"([^\"]*)\"$")
    public void enterEmail(String Email)  {
       new CheckoutPage().setEmail(Email);
    }

    @And("^clicks on next$")
    public void clicksOnNext() {
        new CheckoutPage().clickOnNext();
    }

    @And("^enter Password \"([^\"]*)\"$")
    public void enterPassword(String Password)  {
        new CheckoutPage().setPassword(Password);
    }

    @And("^click on signin$")
    public void clickOnSignin() {
        new CheckoutPage().setSignInButton();
    }



    @And("^Enter MobileNumber$")
    public void enterMobileNumber() {
        new CheckoutPage().setMobileNumber();
       // driver.navigate().refresh();
    }

    @And("^click on click and collect Radiobutton$")
    public void clickOnClickAndCollectRadiobutton()  {
      //  new CheckoutPage().setMobileNumber();
        new CheckoutPage().clickRadioButton();
    }


    @And("^enter post code and click on find collection point search$")
    public void enterPostCodeAndClickOnFindCollectionPointSearch() {
        new CheckoutPage().enterPostCode("HA55DS");
        new CheckoutPage().clickOnFindCollectionPoint();
    }

    @And("^select outlet$")
    public void selectOutlet() {
        new CheckoutPage().selectWatfordOutlet();
    }
    @And("^click on review and pay$")
    public void clickOnReviewAndPay() {
        new CheckoutPage().setReviewAndPay();
    }


}
