
@US8 @regression
Feature: As a user, I should be able to delete a file/folder.

  Scenario: Verify users delete a file/folder

    Given user on the dashboard page
    When the user clicks the "files" module
    And user click action-icon  from "prac" file on the page
    And user choose the "Delete folder" option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the "prac" deleted file is displayed on the page.


