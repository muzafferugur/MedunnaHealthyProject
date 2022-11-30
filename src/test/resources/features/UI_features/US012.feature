Feature:Doctor medunna sayfasında

  Background: ortak adimlar
    Given yaDoktor "medunnaUrl" adresine gider
    Then yaDoktor login sekmesini tiklar
    And  yaDoktor sign in sekmesine tiklar
    And yaDoktor geçerli bir username girer
    And  yaDoktor geçerli bir password girer
    And  yaDoktor signin butonuna tiklar
    And  Doktor MY PAGES sekmesine tiklar
    And  Doktor My Appointments sekmesine tiklar
    And Doktor hastanin edit sekmesine tiklar
    And  Doktor hastanin sayfasında Request A Test sekmesine tiklar

  @param1
  Scenario: TC01 Doktor test sayfasına gidebilmeli
    And       Doctor Test item yazisini görür


  @param2
  Scenario: Doktor Glucose, Urea, Creatinine, Sodium Potassium, Total protein, Albumin, Hemoglobin testleri isteyebilmeli
    Then sayfa belirlenen ölcüde kücülür
    And Doktor Glucose,Urea,Creatinine, Sodium Potassium,Total protein, Albumin, Hemoglobin testi secer
    And  Doktor Kullanici sayfayi kapatir
