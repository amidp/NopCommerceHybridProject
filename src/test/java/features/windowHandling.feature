Feature: Facebook and NopCommerce windows handling
  @test
  Scenario: As a user on nopCommerce when I click on Facebook I should be able to navigate to different webpage accordingly
    Given I am on homepage
    When I click on Facebook Button
    And I accept all cookies on Facebook WebPage
    Then I should be able to verify that I am on Facebook page through nopCommerce
