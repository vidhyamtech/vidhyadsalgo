Feature: Navigate to Graph page

  Background: The user sign in to dsAlgo Portal
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid "passionate_coders" and valid "pa$$word123"
    Then The user should land in Data Structure Home Page with message

  Scenario Outline: Verify that user is able to navigate to Graph data structure page
    When The user clicks the Getting Started button in Graph Panel
    Then The user should be directed to Graph Data StructurePage


