
Feature: database test

  @dbase
  Scenario Outline: kullanici db test
    Given kullanci connection kurar
    And Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then Kullanici kullanici bilgilerini dogrular

    Examples: test verileri
      |query|columnName|
      |SELECT * FROM jhi_user|ssn|

