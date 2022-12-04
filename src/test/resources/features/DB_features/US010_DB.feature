@DBTest
Feature: DB ile randevulari dogrulama

  Scenario Outline:Dr DB ile randevulari dogrular

    Given Dr. DataBase ile baglanti kurar
    And Dr. tablodan appointment datalarini alir
    Then Dr. appointment datalarindan  "<query>" ve "<columnName>" olanlari alir
    And Dr database ile randevu bilgilerinin dogrulamasini yapar
    And Dr database baglantisini kapatir
    Examples:
      |query  |columnName|
    |select * from public.appointment|id|