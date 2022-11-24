@deneme
Feature: US004 registerPage

  Background: Ortak Stepler
    Given Medunna anasayfasina gidilir
    Then Account menu butonu tiklanir
    And Sign in butonuna tiklar


  Scenario: TC 001 gecerli username ve password girilir

    Given  Kullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı girer
    And  Kullanici acilan sayfada Password bolumune gecerli bir sifre girer
    Then  Kullanici giris yapmak için başari mesajını dogrular
    And Sayfayi kapatir

  Scenario: TC 002 remember me butonu tıklanır

    Given  Kullanıcının mevcut kimlik bilgilerini her zaman kullanabilecegi, "Remember me" seçenegini tiklar
    Then Kullanıcının  "Remember me" seçeneginin tiklandıgını dogrular
    And Sayfayi kapatir


  Scenario: TC 003 şifre unutulursa tıklanır

    Given Kullanici acilan sayfada eger şifre unutulursa diye "Did you forget your password?" seçenegine tiklar
    Then Kullanici acilan sayfada "Enter the email address you used to register" yazisini dogrular
    And Sayfayi kapatir


  Scenario: TC 004 register sayfasına yönlendirilir

    Given Kullanici acilan sayfada "You don't have an account yet? Register a new account" seçenegi tiklar
    Then Kullanici acilan sayfada Registration sayfasina yonlendirildigini dogrular
    And Sayfayi kapatir


  Scenario: TC 005 cancel  butonu tıklanır
    Given Kullanici acilan sayfada "Cancel" secenegine tiklar
    Then Kullanici "medunna" ana sayfasina gittigini dogrular
    And Sayfayi kapatir
