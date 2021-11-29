Feature:Creat Account test

Background:
  Given the main page is open
  And the Sign In link is clicked

  Scenario Outline:
    Given the '<space>' is filled with '<value>'
    When the Create an account button is clicked
    Then the '<msg>' error message is shown
    Examples:
    |space       |value         |msg                              |
    |email_create |              |Invalid email address.           |
    |email_create |abcd.email.com|Invalid email address.           |
    |email_create |abcd@email.com|An account using this email address has already been registered. Please enter a valid password or request a new one.|
    |email_create |ab  cd        |Invalid email address.           |