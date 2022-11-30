@US019
Feature: Adminin Yeni Staff (Personel) Oluşturması / Güncellemesi / Görüntülemesi ve Silmesi

  Background:
    Given AdminHus "medunnaURL" gider
    When AdminHus Giris ikonuna tiklar
    Then AdminHus Sign in secenegine tiklar
    And AdminHus  "adminUserName" ve "adminPassword" ile giris yapar
    And AdminHus Sign in butonuna tiklar
    And AdminHus ItemsTitles butonuna tiklar
    And AdminHus Staff seçeneğine tıklar


  @US019_TC01
  Scenario: Admin, doktorlarin bilgilerini gorebilmelidir
    And AdminHus Create a new Staff 'a tiklar
    And AdminHus Use Search tiklar
    And AdminHus SSN girer
    And AdminHus Search User checkbox'a tıklar
    And AdminHus açılan sayfada "User found with search SSN" mesajının göründüğünü doğrular
    Then AdminHus sayfayi kapatir

  @US019_TC02
  Scenario: Admin, tum bilgileri doldurmalidir
    And AdminHus Create A new Staff secenegine tiklar
    And AdminHus açılan ekrandaki tüm alanları doldurur
    And AdminHus Save butonuna tiklar
    And AdminHus ekranda "Field User cannot be empty" mesajı göründüğünü doğrular
    Then AdminHus sayfayi kapatir

  @US019_TC03
  Scenario: Admin, kayitli kisilerden bir kullanici secebilir
    And AdminHus açılan ekranda ilk satırdaki view butonuna tıklar
    And AdminHus staff bilgilerinin ekranda olduğunu doğrular
    Then AdminHus sayfayi kapatir

  @US019_TC04
  Scenario: Admin, kullanici bilgilerini duzenleyebilir
    And AdminHus ikinci sayfaya tiklar ve daha once olusturdugu staffin satırındaki edit butonuna tıklar
    And AdminHus zorunlu alanlarda güncelleme yapar
    And AdminHus save buttonuna tıklar
    And AdminHus ekranda "A staff is updated with"mesajının göründüğünü doğrular
    Then AdminHus sayfayi kapatir

#Bu testte silme islemi yapilmaktadir#
  @US019_TC05
  Scenario: Admin, kullanici bilgilerini silebilir
    And AdminHus oluşturduğu staffın satırındaki delete butonuna tıklar
    And AdminHus ekranda gorulen "Are you sure" açılır penceresinde delete butonuna tiklar
    And AdminHus ekranda "A staff is deleted with"mesajinin göründüğünü doğrular
    Then AdminHus sayfayi kapatir
