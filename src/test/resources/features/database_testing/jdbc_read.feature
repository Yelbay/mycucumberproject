Feature: database_read_feature
  @db_customer_ssn
  Scenario: TC01_read_customer_ssn_information
    Given user connects to the database
    And user gets "*" from "tp_customer" table
    And user reads all the "ssn" column data
    Then close the database connection