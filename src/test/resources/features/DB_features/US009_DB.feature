
Feature: US_009 Database Test

  Scenario Outline:US_009 Staff (Personel),hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir.
    Given SG Kullanici baglanti kurar
    Then SG Hasta bilgilerinin dogrulugunu "<query>" ve "<columnName>" kontrol eder

    Examples:DB test
      |query|columnName|
      |select * from public.patient|id|