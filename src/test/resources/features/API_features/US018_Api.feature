@US018_API
Feature: US018 Doktorun Dogrulanmasi
  Scenario: Olusturuan doktor bilgilerinin dogrulanmasi

    Given AdminHus endpointe gider
    Then status kodunun 200 oldugunu teyit eder
    And olusturulan doktorun bilgilerini dogrular
