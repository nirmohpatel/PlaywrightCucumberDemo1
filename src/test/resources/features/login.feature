Feature: login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password
  @Test1
  Scenario: Login to the swaglabs website
    Given  user navigates to the swaglabe website.
    When user validate the home title.
    Then user enter username.
    And user enter password.
    And user clicks on the signin button.
