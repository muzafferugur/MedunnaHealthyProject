Feature: BO_US002
  Scenario: TC004 Username API ile dogrulanmasi
    Given Kullanici register islemi icin POST Request gonderir
    Then Kullanici Status Code 201 oldugunu kontrol eder
    And Kullanici username ve email ile bilgileri dogrular





