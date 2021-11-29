Feature: SearchBoxTesting
 Background:
   Given the main page is open

   Scenario Outline:
     Given the '<space>' is filled with '<value>'
     When the search button is clicked
     Then the '<msg4>' error is shown
     Examples:
     |space           |value    |msg4|
     |search_query_top|         |Please enter a search keyword|
     |search_query_top|qwsadad  |No results were found for your search "qwsadad"|


   Scenario:
     Given the "search_query_top" is filled with "Blouse"
     When the search button is clicked
     Then the result item "Blouse" display

  Scenario:
    Given the "search_query_top" is filled with "Faded Short Sleeve T-shirts"
    When the search button is clicked
    Then the result item "Faded Short Sleeve T-shirts" display
