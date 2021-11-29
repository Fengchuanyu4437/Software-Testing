Feature:Register form testing

  Background:
    Given the main page is open
    And the Sign In link is clicked
    And the email address filled with "qazqaz@email.com"
    And the Create an account button is clicked

    And Your Firstname is filled with "Terry"
    And Your Lastname is filled with "Feng"
    And Your Firstname_address is filled with "Terry"
    And Your Lastname_address is filled with "Feng"
    And Your City is filled with "Debrecen"
    And The state is selected to "New Jersey"
    And The Zipcode is filled with "12345"
    And The Country Field is selected to "United States"
    And The alias for furture field is filled with "anything"

Scenario Outline: Test password
  Given the '<space>' is filled with '<value>'
  And the address is filled with "somewhere"
  And the phonenumber is filled with "123456"
  When register button clicked
  Then the '<msg6>' is display
  Examples:
  |space|value|msg6|
  |passwd|    |passwd is required.|
  |passwd|1234|passwd is invalid.|

Scenario Outline: Test Address
  Given the '<space>' is filled with '<value>'
  And the password is filled with "somepassword"
  And the phonenumber is filled with "123456"
  When register button clicked
  Then the '<msg6>' is display
  Examples:
  |space|value|msg6|
  |address1|        |address1 is required.|
  |address1|@#$%^&  | address1 is invalid.|

Scenario Outline:Test Phonenumber
  Given the '<space>' is filled with '<value>'
  And the password is filled with "somepassword"
  And the address is filled with "somewhere"
  When register button clicked
  Then the '<msg6>' is display
  Examples:
  |space|value|msg6|
  |phone_mobile|    |You must register at least one phone number.|
  |phone_mobile|@#$%^^&*|phone_mobile is invalid.|
