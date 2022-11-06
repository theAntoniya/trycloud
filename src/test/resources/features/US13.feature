@US13 @regression
Feature: As a user, I should be able to view the contact list.
  User story: User should see contacts names after clicking contacts module
  Scenario Outline:
    Given User logged with "<username>" in and at dashboard page
    When user clicks at ''Contacts'' module.
    Then user should see contacts list.
    Examples:
      | username |
      #| user7  |
      #| user34 |
      | user99 |