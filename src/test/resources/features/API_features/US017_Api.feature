
Feature: US017_API
  @US017_API
  Scenario: Test Item lari API ile dogrulayin

    Given   AdminHercai User Medunna
    When    AdminHercai User send Get request
    Then    AdminHercai Status code is 200 oldugunu dogrular
    And     AdminHercai Verify expected data equals to actual data

  @US017APIPOST
  Scenario: Test Item API da Post yaparak dogrulayin

    Given   Admin HE goes to Medunna for post request the Test Item
    When    Admin HE sends Post request
    Then    Admin HE Status code is 201 oldugunu dogrular
    And     Admin HE Verify expected data equals to actual data