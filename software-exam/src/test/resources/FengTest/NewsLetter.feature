Feature: NewsLetter subscribed
  Background:
    Given the main page is open

    Scenario Outline:
      Given the '<space>' is filled with '<value>'
      When submitNewsletter clicked
      Then the '<msg3>' error message comes up
      Examples:
      |space           |value           |msg3                                                               |
      |newsletter-input|                | Newsletter : Invalid email address.                               |
      |newsletter-input|abcd.com        | Newsletter : Invalid email address.                               |
      |newsletter-input|abcdef@email.com| Newsletter : This email address is already registered.            |
