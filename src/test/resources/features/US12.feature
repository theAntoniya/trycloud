@US12
Feature: User should be able to access to Contacts module.
  User story: As a user, I should be able to access to Contacts module.

  Scenario Outline:
    Given User logged with "<username>" in and at dashboard page.
    When user clicks at ''Contacts'' module
    Then user should see ''Contacts - Trycloud QA'' as title
    Examples:
      | username |
      #| user7  |
      #| user34 |
      | user99   |