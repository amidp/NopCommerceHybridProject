Feature: Vote Button and Popup handling
  @test
  Scenario: As a user I should be able to vote
    Given I am on homepage
    When I click on Vote button
    And I should be able to verify alert message accordingly
    Then I handle pop up as per requirement
