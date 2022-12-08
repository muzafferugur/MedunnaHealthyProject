
Feature: US019_API
  @US019apı
  Scenario: Staff i API ile dogrulayin

    Given   AdminSevval User Medunna
    When    AdminSevval User send Get request
    Then    AdminSevval Status code is 200 oldugunu dogrular
    And     AdminSevval Verify expected data equals to actual data