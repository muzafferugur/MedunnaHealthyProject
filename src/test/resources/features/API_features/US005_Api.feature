@US005_tc_01
Feature: US005 Appointment post


@US005

  Scenario: Hastanin Appointment get islemi yaparak Dogrulamasi

    Given kullanici get request yapar
    When status kodunun 200 oldugunu dogrular
    Then gelen bilgilerin dogrulugunu test eder


  Scenario: Hastanin Appointment post islemi yaparak olusturmasi

    Given Kullanici ia url adresine gider
    And Kullanici ia token alir
    Then Post islemi yaparak Appointment olusturur


