Feature: As a user, I should be able to log in.



  @smoke
  Scenario Outline: Verify login with valid credentials
    Given user on the tryCloud login page
    When user use username "<username>" and passcode "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page

    Examples:

      | username | password    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |



  @smoke
  Scenario Outline: Verify user login fail with invalid credentials
    Given user on the tryCloud login page
    When user enter invalid "<username>" and "<password>"
    And user click the login button
    Then verify "<message>" message should be displayed
    Examples:
      | username | password    | message                     |
      | User9    | Wrong       | Wrong username or password. |
      | Wrong    | Userpass123 | Wrong username or password. |
      | Wrong    | Wrong       | Wrong username or password. |
