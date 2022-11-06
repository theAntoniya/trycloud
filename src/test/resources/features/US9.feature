Feature:As a user,I should be able to write comments to file/folders.

  @wip
  Scenario: Verify users to write comments to file/folder
    Given user on the dashboard page
    When the user clicks the "File" module
    And user click action-icon from any file on the page
    And user choose the "Details" option
    And user write a comment inside the input box
    And user click the submit button to post it
    Then verify the comment is displayed in the comment section

 Scenario Outline: Verify user '<username>' to write comments to file/folder
    Given user logged with "<username>" on the dashboard page
    When the user clicks the "File" module
    And user click action-icon from any file on the page
    And user choose the "Details" option
    And user write a comment inside the input box
    And user click the submit button to post it
    Then verify the comment is displayed in the comment section

    Examples:
      | username |
      | user26   |
      | user56   |
      | user86   |
      | user116  |

