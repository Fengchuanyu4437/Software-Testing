Feature: forgot your password

  Background:
    Given the main page is open
    And the Sign In link is clicked
    Then Forgot your password clicked

  Scenario Outline:
    Given the '<space>' is filled with '<value>'
    When Retrieve Password clicked
    Then the '<msg2>' error message display
    Examples:
    |space|value         |msg2                                                              |
    |email|              |Invalid email address.                                            |
    |email|abcd.com      |Invalid email address.                                            |