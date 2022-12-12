
Feature: database test

  @dbase5
  Scenario Outline: kullanici db test
    Given kullanci baglanti kurar
    And Kullanici kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then Kullanici bilgilerini dogrular

    Examples: test verileri
      |query|columnName|
      |select * from public.appointment|id|

