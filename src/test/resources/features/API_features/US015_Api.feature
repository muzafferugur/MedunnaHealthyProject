@0015
Feature: API test

  Scenario: US_015 Admin tarafından hasta oluşturma ve düzenleme
    Given SG Admin hasta bilgilerini Get request ile alir
    Then SG Admin status kodunun 200 oldugunu dogrular
    Then SG Admin hasta bilgilerini dogrular