Feature: Refer a product to friend

  As a registered user on nopcommerce website, I should be able to refer a product to friend

  @ReferaProduct

  Scenario: Registered user should be able to refer a product to friend

    Given Valid registered user is on homepage on nopcommerce website
    When user clicks on computers category
    And user clicks on desktop category
    And user clicks on Build your own computer category
    And user clicks on email a friend button
    And user enters required details on email a friend
    And user clicks on send email button
    Then user should be able to refer a product to a friend successfully
