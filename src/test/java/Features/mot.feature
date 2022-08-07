Feature: To test valid/invalid registration number for mot details

  Scenario Outline: check Mot is successful with valid credentials

    Given user is on mot status page
    When user clicks on start now button
    Then user enters "<Registrationnumber>"
    And  user should see the validity of Mot


    Examples:
      |Registrationnumber  |
      | V399 HJN           |
      | EX65 YEB           |
      | 123x YE            |
      | @XTB HGFD          |
      | xcv1 ytc           |




