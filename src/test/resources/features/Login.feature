Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password
  @TestCase1
  Scenario: The user login to the Swaglabs web application successfully. - Happy Path
    When the user enter valid username as a "standard_user".
    And the user enter valid password as a "secret_sauce".
    And the user click on login button.
    Then the user navigates to the "Products" page successfully.

