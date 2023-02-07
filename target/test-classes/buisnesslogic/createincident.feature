Feature: Create Incident

  Scenario: Create incident without request body
    #Given setup endpoint
    #Given setupn Authentication with valid credentials
    When send the post request
    Then verify the status code as 201
    And verify response body
    
    
  #Scenario Outline: Create incident with request body
    #Given setup endpoint
    #Given setupn Authentication with valid credentials
   #
    #When send the post request with <fileName>
    #Then verify the status code as 201
    #And verify response body
#
    #Examples: 
      #| fileName   |
      #| Data1.json |
      #| Data2.json |
