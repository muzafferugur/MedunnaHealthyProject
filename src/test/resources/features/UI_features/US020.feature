@US020
Feature: Adminin "User management" menusunden kullanici active etmesi ve gerekli rolleri olusturmasi

  Background:
    Given AdminHus "medunnaURL" gider
    When AdminHus Giris ikonuna tiklar
    Then AdminHus Sign in secenegine tiklar
    And  AdminHus  "adminUserName" ve "adminPassword" ile giris yapar
    And  AdminHus Sign in butonuna tiklar
    And  AdminHus AdminHus Administration butonuna tıklar
    And  AdminHus User Management butonunu tiklar

  @US020_TC01
  Scenario: Admin, kayıtlı kişilerin "firstname, lastname, email... gibi bilgilerini görebilmeli.
    And AdminHus ikinci kullaniciyi secer ve view butonunu tiklar
    And AdminHus firstname, lastname,email bilgilerinin gorunur oldugunu dogrular
    Then AdminHus sayfayi kapatir

  @US020_TC02
  Scenario: Admin; "User management" menüsünden kullanıcı Active eder ve bir rol olusturur
    And AdminHus kendi olusturdugu kullaniciya ait edit butonunu tiklar
    And AdminHus activated box i tiklayarak kullanici aktive edebilir veya iptal edebilir
    And AdminHus profiles seceneginden Role-Admin atayabildigini test eder
    And AdminHus profiles seceneginden Role-User atayabildigini test eder
    And AdminHus profiles seceneginden Role-Patient atayabildigini test eder
    And AdminHus profiles seceneginden Role-Staff atayabildigini test eder
    And AdminHus profiles seceneginden Role-Physician atayabildigini test eder
    Then AdminHus sayfayi kapatir

#Bu testte silme islemi yapilmaktadir#
  @US020_TC03
  Scenario: Admin kullanicilari silebilir
    And AdminHus ilk satırda bulunan delete butonunu tıklar
    And AdminHus ekranda gorulen "Are you sure" açılır penceresinde delete butonuna tiklar
    And AdminHus ekranda "A staff is deleted with"mesajinin göründüğünü doğrular
    Then AdminHus sayfayi kapatir
