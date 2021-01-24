Feature: Add Employee Functionality

  Background:
    When enter valid credentials
    And click on login button
    Then  verify dashboard is displayed
    When  click on PIM
    And click on add Employee button

  @addEmployeeWithoutLoginDetails
  Scenario: add employee without login details
   # Given navigate to the HRMS login page // already done with our Hooks

    Then enter first and last name
    And click on save button
    Then verify employee is added successfully

    @addEmployeeWithLoginDetails
    Scenario: Add employee with login credentials and with middle name
      Then enter first and last name and middle name
      When click on login detail checkbox
      Then enter login information details
      And click on save button
      Then verify employee is added successfully
      @parameter
      Scenario: Add employee without login details but with with middle name
        Then enter first name "Ahmad", middle name "Hafez" and last name "Jan"
        And click on save button
        Then verify that "Ahmad Hafez Jan" is added successfully

        @examples
        Scenario Outline: Adding multiple employees without login details
          When  enter "<FirstName>", "<MiddleName>" and "<LastName>"
          And click on save button
          Then verify "<FirstName>", "<MiddleName>" and "<LastName>" is added successfully

          Examples:
          |FirstName|MiddleName|LastName|
          |Mohammad    |Qasim     |Wardak  |
          |Mohammad    |Hafiz     |Wardak  |

          @dtWithHeader
          Scenario: Adding multiple employees at one execution
            When add multiple employees and verify they are added successfully
              |FirstName|MiddleName|LastName|EmployeeId|
              |Hakim    |Shaheen   |Sabor   |787909080 |
              |Shukor   |Karim     |Omar    |897964243 |

  @excelTask
  Scenario: Adding multiple employees from excel
    When add multiple employees from excel "AddEmployee" sheet and verify they are added



