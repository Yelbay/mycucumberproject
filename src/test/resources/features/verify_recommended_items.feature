Feature: Add to cart from Recommended items
  Scenario:TC_22_Test_Cases
    Given launches the browser
    When navigate the URL
    Then user Scroll to bottom of page
    And user verifies RECOMMENDED ITEMS are visible
    And user click on Add to Cart on Recommended product
    And user click on View Cart button
    And user Verify that products is displayed in cart page
    Then closes the browser