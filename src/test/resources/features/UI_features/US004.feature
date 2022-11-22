
Feature: US004 registerPage

  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Sign in butonuna tiklar

    Scenario: TC 001 gecerli username ve password girilir

Given  Kullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı girer
And  Kullanici acilan sayfada Password bolumune gecerli bir sifre girer
Then  Kullanici giris yapmak için başari mesajını dogrular

  Scenario: TC 002 remember me butonu tıklanır

  And  Kullanıcının mevcut kimlik bilgilerini her zaman kullanabilecegi, "Remember me" seçenegini tiklar
  Then Kullanıcının  "Remember me" seçeneginin tiklandıgını dogrular


