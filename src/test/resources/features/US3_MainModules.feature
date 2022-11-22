Feature: As a user, I should be accessing all the main modules of the app
  User Story: As a user, I should be accessing all the main modules of the app

  Background: User on the login page
    Given User successfully login to the app
@us3
    Scenario: Verify users accessing all the main modules of the app
      When  User sees "Dashboard"  is in the title
      Then Verify the user see and access the following modules
        | Dashboard |
        | Files     |
        | Photos    |
        | Activity  |
        | Talk      |
        | Mail      |
        | Contacts  |
        | Circles   |
        | Calendar  |
        | Deck      |


