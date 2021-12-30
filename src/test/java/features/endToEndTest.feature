Feature: End to end product testing
   @test
  Scenario: As a registered user on nopCommerce I should be able to do end to end testing for a product successfully
    Given user is on registration page
    When user enters required registration details
    And click on register submit button
    And user should able to register successfully
    And user clicks on computers category
    And user clicks on desktop category
    And user clicks on Build your own computer category
    And user choose configuration as per given requirement
    And user clicks on Add To Cart Button
    And user clicks on Shopping Cart
    And user clicks on Terms and Conditions check box
    And user clicks on Checkout Button
    And user fills all mandatory fields in Billing Address Page
    And user clicks on Continue button
    And user chooses Shipping option and shipping address and click Continue
    And user chooses Payment Method Credit Card and click Continue
    And user fills in all required details for Credit Card and clicks Continue
    And user clicks on Confirm button on Confirm Order page
    Then user should be able to place order successfully

