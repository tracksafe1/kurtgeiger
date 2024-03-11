package org.example.Steps;

import cucumber.api.java.en.And;
import org.example.pages.WomenSneakersPage;

public class WomenSneakersSteps {
    @And("^mouseHover on sort by$")
    public void mouseHoverOnSortBy() throws InterruptedException {
        new WomenSneakersPage().mouseHoverSortby();
    }

    @And("^select radiobutton Bestsellers$")
    public void selectRadiobuttonBestsellers() {
        new WomenSneakersPage().mouseHoverAndClickBestsellers();
    }

    @And("^click on Laney Octavia Sneaker$")
    public void clickOnLaneyOctaviaSneaker() throws InterruptedException {

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

    @And("^mouseHover on bag icon and click on checkout page$")
    public void mouseHoverOnBagIconAndClickOnCheckoutPage() {

        new WomenSneakersPage().mouseHoverOnBagIcon();
    }

    @And("^click on checkout securely$")
    public void clickOnCheckoutSecurely() throws InterruptedException {
        new WomenSneakersPage().setCheckoutSecurely1();
    }
}
