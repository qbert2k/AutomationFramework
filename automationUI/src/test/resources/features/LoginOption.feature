Feature: Login

  Scenario: Login Option
    Given the user enter to main page
    When the user enter the user name and password
    Then add employee page is displayed

  Scenario Outline: Login Option multi user
    Given the user enter to main page
    When the user enter <UserName> and <Password>
    Then add employee page is displayed

    Examples:
      | UserName | Password |
      | boris    | 123456   |
      | Juan     | lalala   |
      | Monica   | Papepip  |