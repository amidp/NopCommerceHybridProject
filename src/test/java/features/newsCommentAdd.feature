Feature: News comment to be added

  As a user I am on nopcommerce website,I should be able to add news comment

  @NewsComment

  Scenario: User  should be able to add news comment on news page

    Given user is on homepage as a registered user
    When user clicks on details under new store open under news option
    And user enters required details
    Then user should be able to submit comment successfully
