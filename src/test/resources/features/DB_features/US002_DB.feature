Feature: BO_US002
  @US002DB
  Scenario: BO_TC05 E-mail DB ile doğrulanmalıdır.
    Given bo user connects to the database
    Then bo user gets user data from db
    And bo user validates user using "email" with db
    Then bo user closes to database connection
