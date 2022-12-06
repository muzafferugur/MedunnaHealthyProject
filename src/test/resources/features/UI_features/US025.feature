Feature: US 025

  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Sign in butonuna tiklar
    And  Kullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı "HastaYasemin" girer
    And  Kullanici acilan sayfada Password bolumune gecerli bir sifre "Ankara06" girer


  Scenario: TC 001 yeni bir randevu oluşturma

    Given Kullanici make a appointments iconuna tiklar
    Then Kullanici make a appointments sayfasina geldigini dogrular
    And Kullanici make a appointments sayfasinda bilgileri girer
    And Kullanici sent and appointments request iconuna tiklar
    Then Kullanici appointment registration saved! Yazisini gordugunu dogrular
