Feature:Framework Test


#  1. Open kurtgeiger.com
#  2. Select Shoes category.
#  3. Select any item.
#  4. Select any size &amp; add to Bag.
#  5. Go to checkout Page.
#  6. Enter all details.
#  7. Select any delivery method.
#  8. Go to Page review page.





  @Regression
  Scenario:Verify user complete journey
    Given I am on Homepage
    When I click on accept cookies
    And I click on shoes category
    And then click on Sneakers
    And click on NO THANKS
    And mousehover on sort by
    And select radiobutton Bestsellers
    And mousehover on Filters
    And  select size
   And click on Apply Filters
    And click on Lania Octavia Sneaker
    And click on size and select size
    And click on Add to Bag
    And mousehover on bag icon and click on checkout page
    And click on checkout securely
    And enter Email "shikhaskapur@gmail.com"
    And  clicks on next
    And enter Password "Agile99$$"
    And click on signin
    And Enter MobileNumber
    And click on click and collect Radiobutton
    And enter post code and click on find collection point search
    And select outlet
    And click on review and pay



   # And add it to bag









