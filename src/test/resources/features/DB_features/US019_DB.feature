Feature: Test items(oge) Olustur
  @us019_db
  Scenario Outline:Admin olarak Staff bilgilerini API ile doğrulayın

    Given AdminHe connection kurar
    Then AdminHe kayitli kisileri olusturur "<query02>" ve "<ColumnName02>"
    And  AdminHe bilgilerini dogrular

    Examples: test verileri
      | query02                  |  ColumnName02|
      | SELECT * FROM staff|  id      |