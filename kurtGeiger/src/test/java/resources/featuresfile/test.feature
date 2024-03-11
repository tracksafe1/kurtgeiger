Feature:Framework Test

  @Smoke
  Scenario Outline:user wants to create an account
    Given I am on Homepage
    When I click on accept cookies
    And click on NO THANKS
    And I click on create account icon
    And click on create account
    And Enter "<FIRSTNAME>","<LASTNAME>","<EMAIL>","<PASSWORD>","<CONFIRM PASSWORD>"
    And I click on create an account button
    And I click on addressBook
    And I enter PHONE NUMBER
    And I enter POSTCODE
    And click on FIND ADDRESS
    And I select ADDRESS from dropdown
    And I click on SAVE ADDRESS
    And I click on add new address
    And I enter PHONE NUMBER
    And I enter New POSTCODE
    And click on FIND ADDRESS
    And I select ADDRESS from dropdown
    And I click on Default Billing Address
    Then I click on SAVE ADDRESS again

    Examples:
      | FIRSTNAME | LASTNAME | EMAIL                     | PASSWORD  | CONFIRM PASSWORD |
      | Shikha11  | Kapur    | 2shikhaskapur1259@gmail.com | Agile99$$ | Agile99$$        |


  @Sanity
  Scenario:Verify user complete journey
    Given I am on Homepage
    When I click on accept cookies
    And I click on shoes category
    And click on Sneakers
    And click on NO THANKS
    And mouseHover on sort by
    And select radiobutton Bestsellers
    And click on Laney Octavia Sneaker
    And click on size and select size
    And click on Add to Bag
    And mouseHover on bag icon and click on checkout page
    And click on checkout securely
    And enter Email "2shikhaskapur1259@gmail.com"
    And clicks on next
    And enter Password "Agile99$$"
    And click on signin
    And Enter MobileNumber
    And click on click and collect Radiobutton
    And enter post code and click on find collection point search
    And select outlet
    Then click on review and pay













