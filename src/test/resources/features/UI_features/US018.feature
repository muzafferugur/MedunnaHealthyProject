@US018
Feature: Adminin yeni Physicians Olusturmasi / Guncellemesi / Goruntulemesi ve Silmesi

  Background:
    Given AdminHus "medunnaURL" gider
    When AdminHus Giris ikonuna tiklar
    Then AdminHus Sign in secenegine tiklar
    And  AdminHus  "adminUserName" ve "adminPassword" ile giris yapar
    And  AdminHus Sign in butonuna tiklar
    And  AdminHus ItemsTitles butonuna tiklar
    And  AdminHus Physician secenegine tiklar

  @US018_TC01
  Scenario: Admin, doktorlarin bilgilerini gorebilmelidir
    And   AdminHus Physicians tablosundaki butun doktorlarin bigilerinin gorunur oldugunu test eder
    Then AdminHus sayfayi kapatir

  @US018_TC02
  Scenario: Admin, SSN kimligine gore kayitli bir kisiyi arayabilir
    And AdminHus Create a new physician butonuna tiklar
    And AdminHus Use Search Boxı isaretler
    And AdminHus SSN kutusuna kayitli bir "ssn" numarasi girer
    And AdminHus Search User butonuna tiklar
    And AdminHus alert mesajinin "User found with search SSN" icerdigini test eder
    Then AdminHus sayfayi kapatir

  @US018_TC03
  Scenario: Admin, Doktorlarin bilgilerini düzenleyebilir
    And AdminHus ilk edit butonuna tiklar
    And AdminHus doktor bilgilerini gunceller
    And AdminHus Save butonuna tiklar
    And AdminHus alert mesajinin "A Physician is updated with identifier" icerdigini test eder
    Then AdminHus sayfayi kapatir

#Bu testte silme islemi yapilmaktadir#
  @US018_TC07
  Scenario: Admin mevcut doktorları silebilir
    And AdminHus ilk delete butonuna tiklar
    And AdminHus alert mesajinin "A Physician is deleted with identifier" icerdigini test eder
    Then AdminHus sayfayi kapatir
