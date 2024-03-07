package org.example.Steps;

import cucumber.api.java.en.And;
import org.example.pages.WomenSneakersPage;

public class WomenSneakersSteps {
    @And("^mousehover on sort by$")
    public void mousehoverOnSortBy() {
        new WomenSneakersPage().mouseHoverSortby();
    }

    @And("^select radiobutton Bestsellers$")
    public void selectRadiobuttonBestsellers() {
        new WomenSneakersPage().mouseHoverAndClickBestsellers();
    }




    @And("^mousehover on Filters$")
    public void mousehoverOnFilters() {
        new WomenSneakersPage().mouseHoverFilters();
    }



    @And("^click on Apply Filters$")
    public void clickOnApplyFilters() {
        new WomenSneakersPage().clickOnAppliedFilters();
    }

    @And("^select size$")
    public void selectSize() {
        new WomenSneakersPage().SelectSize();
    }

    @And("^click on Lania Octavia Sneaker$")
    public void clickOnLaniaOctaviaSneaker() {
        new WomenSneakersPage().clickOnLaneyOctaviaSneaker();
    }

    @And("^click on size and select size$")
    public void clickOnSizeAndSelectSize() {
        new WomenSneakersPage().sizeSelected();
    }

    @And("^click on Add to Bag$")
    public void clickOnAddToBag() {
        new WomenSneakersPage().clickAddToBag();
    }

    @And("^mousehover on bag icon and click on checkout page$")
    public void mousehoverOnBagIconAndClickOnCheckoutPage() {
        new WomenSneakersPage().mouseHoverOnBagIcon();
    }

    @And("^click on checkout securely$")
    public void clickOnCheckoutSecurely() {
        new WomenSneakersPage().setCheckoutSecurely1();
    }
}
