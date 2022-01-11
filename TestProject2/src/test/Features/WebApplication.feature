Feature:Gmail Login
  Scenario: Log into gmail with valid credentials
    Given user logged into gmail page
    When the user enters valid credentials
    And click on submit
    Then the user should be able to logged in successfully
