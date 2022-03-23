Feature: feature to test login shadhin app

  Scenario: validate login functionality of shdahin app is working
    Given open chrome browser
    And user is on shadin main page
    And select login link/button
    When user enter a mobile number and password in respective fields
    And hits enter button
    Then user is navigated to his/her profile