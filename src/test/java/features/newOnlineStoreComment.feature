Feature: New comment to add and it should appear at the last on list
  @test
Scenario: As a registered user on nopCommerce I should be able to leave comment under new online store open and see it is last comment
      Given user is on registration page
      When user enters required registration details
      And click on register submit button
      And user should able to register successfully
      And user clicks continue
      And user clicks on Details under New Online Store is Open
      And user enters required details
      And user clicks on New Comment
      Then user should be able to verify that the added comment is last on the list.

