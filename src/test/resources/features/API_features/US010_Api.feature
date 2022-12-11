@api100
Feature: US010_ApiTest

  Scenario: Doktor randevu listesini API ile gorebilmeli

    Given US010_ Doktor Medunna Url i id ile  ayarlar
    Then US010_ Doctor GET request yapar ve  response alir
    And US010_ Doctor json datayi deserialize  yaparak javaya dondurur
    And US010_ Doctor randevulari api  ile dogrular