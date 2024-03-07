package org.example.Steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.WomenSneakersPage;
import org.junit.Assert;

public class HomepageSteps {
    @Given("^I am on Homepage$")
    public void userIsOnHomepage() {
    }

    @When("^I click on accept cookies$")
    public void userClicksOnAcceptCookies() {
        new HomePage().clickAcceptCookies();
    }


    @And("^I click on shoes category$")
    public void iClickOnShoesCategory() {
        new HomePage().clickShoes();
    }


    @And("^click on NO THANKS$")
    public void clickOnNOTHANKS() {
        new HomePage().clickingNoThanks();
    }



    @And("^then click on Sneakers$")
    public void thenClickOnSneakers() {
        new HomePage().selectingSneakers();
    }
}
