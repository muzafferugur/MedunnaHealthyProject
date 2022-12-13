@DB_018
Feature: DB Testing

  @DB_US018
  Scenario Outline: Kayitli Doktorlari Dogrulama
    Given AdminHus baglanti kurar
    Then  AdminHus kayitli doktor bilgilerini getirir "<query>" ve "<columnName>"
    And   AdminHus olusturdugu doktor bilgilerini dogrular
    Examples:
      | query                                 | columnName  |
      | select * from patient     | id                       |




