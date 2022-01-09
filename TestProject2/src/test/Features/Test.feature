Feature:
  Scenario: Basic test
    Given user is on log in page
    When the user enters valid credentials
    And hit submit
    Then the user should be logged in successfully
