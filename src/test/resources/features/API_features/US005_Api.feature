@US005
Feature: US005 Appointment
  Scenario: Hastanin Appointment Dogrulamasi

    Given kullanici get request yapar
    When status kodunun 200 oldugunu dogrular
    Then gelen bilgilerin dogrulugunu test eder
