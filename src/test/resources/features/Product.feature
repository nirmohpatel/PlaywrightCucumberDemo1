Feature: As a user I am able to see product with product price.

  Background:
    Given the user is on the Swaglabs login page.
    And the user login with "standard_user".
    And the user navigates to the "Products" page successfully.

  @TestCase2
  Scenario: All the products listed on products page.
    Then the user should be able to verify the all the products with price.
      | Sauce Labs Bike Light             | $9.99  |
      | Sauce Labs Bolt T-Shirt           | $15.99 |
      | Sauce Labs Onesie                 | $7.99  |
      | Test.allTheThings() T-Shirt (Red) | $15.99 |
      | Sauce Labs Backpack               | $29.99 |
      | Sauce Labs Fleece Jacket          | $49.99 |