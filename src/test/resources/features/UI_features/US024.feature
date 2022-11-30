Feature: US024

  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Sign in butonuna tiklar
    And  Kullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı "onuray" girer
    And  Kullanici acilan sayfada Password bolumune gecerli bir sifre "2255049aA+" girer
    And Kullanici my appointments iconuna tiklar

  Scenario:TC_01 test bölümlerini görüntüleme


    Then Kullanici my appointments sayfasina geldigini dogrular
    And Kullanici my appointments sayfasinda show test butonuna tiklar
    And Kullanici test sayfasinda wiev result butonuna tiklar
    Then Kullanici test result sayfasinda test sonuclari sayfasinda bolumleri gordugunu dogrular
    And Sayfayi kapatir


  Scenario:TC 002 fatura görüntüleme

    Given  Kullanici my appointments sayfasinda show invonce butonuna tiklar
    Then Kullanici invonce sayfasina girdigini dogrular
    Then Kullanici faturasinin 940 $ oldugunu dogrular
