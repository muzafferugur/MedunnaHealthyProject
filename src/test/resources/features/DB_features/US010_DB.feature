@DBTest @US010
Feature: Database test

  Scenario: Randevu Db test
    Given US010 Kullanici connection kurar
    And US010 Kullanici hasta bilgilerini ceker
    Then US010 Kullanici hasta bilgilerini dogrular
