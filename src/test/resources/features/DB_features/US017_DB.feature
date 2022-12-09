Feature: Test items(öge) Oluştur
  @us017_db
  Scenario Outline: kayıtlı kisiler olusturma

    Given YE Admin connection kurar
    Then YE Admin kayitli kisileri olusturur "<query>" ve "<ColumnName>"
    And YE Admin bilgilerini dogrular

    Examples: test verileri
      | query                  |  ColumnName|
      | SELECT * FROM c_test_item|  id      |