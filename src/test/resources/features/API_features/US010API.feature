@api10
Feature: US010_ApiTest

  Scenario: Doktor randevu listesini API ile gorebilmeli

    Given US010 Doktor Medunna Url i id ile  ayarlar
    Then US010 Doctor GET request yapar ve  response alir
    And US010 Doctor json datayi deserialize  yaparak javaya dondurur
    And US010 Doctor randevulari api  ile dogrular