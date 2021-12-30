Feature: :Navigate to Subcategory pages

  @test
  Scenario Outline: As a user, I should be able to navigate to subcategory pages successfully

    Given I am on homepage
    When I click on "<category>" button
    And I click on "<subcategory>"
    And I should able to verify the "<page_URL>" accordingly
    Then I should able to verify the the page title as "<page_title>"accordingly

    Examples:
      | category    | subcategory    | page_URL                                  | page_title     |
      | Computers   | Desktops       | https://demo.nopcommerce.com/desktops     | Desktops       |
      | Computers   | Notebooks      | https://demo.nopcommerce.com/notebooks    | Notebooks      |
      | Computers   | Software       | https://demo.nopcommerce.com/software     | Software       |
      | Electronics | Camera & photo | https://demo.nopcommerce.com/camera-photo | Camera & photo |
      | Electronics | Cell phones    | https://demo.nopcommerce.com/cell-phones  | Cell phones    |
      | Electronics | Others         | https://demo.nopcommerce.com/others       | Others         |
      | Apparel     | Shoes          | https://demo.nopcommerce.com/shoes        | Shoes          |
      | Apparel     | Clothing       | https://demo.nopcommerce.com/clothing     | Clothing       |
      | Apparel     | Accessories    | https://demo.nopcommerce.com/accessories  | Accessories    |
