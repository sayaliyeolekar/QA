Feature: Update Incident

  Scenario: Update incident without request body
    Given setup endpoint
    Given setupn Authentication with valid credentials
    #When send the put request
    #Then verify the status code as 200
    And verify response body

  Scenario Outline: Update incident with request body
    Given setup endpoint
    Given setupn Authentication with valid credentials
    When send the put request with <fileName>
    Then verify the status code as 200
    And verify response body
    #Examples: 
      #| fileName   |
      #| Data1.json |
      #| Data2.json |
