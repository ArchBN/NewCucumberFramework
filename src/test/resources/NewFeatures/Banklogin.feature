#Feature:Bank application login
  #Scenario:Validate Login page of bank
   # Given Open DemoGuru URL and launch the application
    #When User enters username and password
    #Then Submit the credentials
Feature:Bank application login
  Scenario Outline:Validate Login page of bank
    Given Open DemoGuru URL and launch the application
    When User enters "<username>" and "<password>"
    Then Submit the credentials
    Then Homepage should be displayed
    Examples:
      | username   | password |
      | mngr356926 | Yheruje  |
      | mngr356926 | Yheruje  |
