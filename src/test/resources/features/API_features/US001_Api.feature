
Feature: US001_API
  @US001_API
  Scenario: Register yaparak API ile kullanici olusturun

    Given   Kullanici Post islemi yaparak user olustur
    When    Kullanici Status kodun 201  oldugunu dogrular
    Then    Kullanici olusturdugu user dogrular
