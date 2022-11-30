@US026_UI

Feature: US026 Contact bolumunden mesaj gonderme

  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir


  @US026_TC01
  Scenario : US026_TC01 Herhangi bir kullanici mesaj gonderir
    Given Contact butonuna tiklanir
    Then Sayfanin sonuna inilir
    And Mesaj gonderilebilecek alanin oldugu dogrulanir



  @US026_TC02
  Scenario: US026_TC02 Herhangi bir kullanici gerekli bilgileri girerek mesaj gonderir
    Given Contact butonuna tiklanir
    Then Sayfanin sonuna gidilir
    And Name yazan bolume bir isim girer
    And Email yazan bolume email girer
    And Subject yazan yere konu girer
    And Message yazan yere mesaj girer
    And Send butonuna tiklar
    And Your message has been received mesajinin gorundugunu dogrular
