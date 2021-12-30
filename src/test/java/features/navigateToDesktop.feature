Feature: Navigate to desktop page

  As a user on nopcommerce website I should be able to navigate to desktop page

  @Navigate
  Scenario: User should be able to navigate to desktop page

    Given user is on homepage on nopcommerce website
    When user clicks on computers category
    And user clicks on desktop category
    Then user should be navigate to desktop page successfully
