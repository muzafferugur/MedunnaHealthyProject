Feature: Hastalar randevu tarihi oluşturabilmelidir.

  Background:
    Given Kullanici  "medunnaUrl" anasayfaya gider
    Then Kullanici hastaUsername ve hastaPassword ile siteye giris yapar
    And Kullanici Make An Appointment butonuna tiklar
    And Kullanici Make An Appointment bolumunun gorunurlugunu test eder

  Scenario Outline: TC_01 Kullanıcı guncel tarih girmelidir.
    And Kullanici "<phone>" bilgilerin doldurur
    And Kullanici guncel bir tarih secer
    And Kullanici Send an AppointmentRequest butonunu tiklar
    And Kullanici gecerli bir tarih girdigini cikan pop ile dogrular
    And Kullanici sing out yaparak oturumu kapatir
    Examples:
      |phone      |
      |555-555-4444|

  Scenario Outline: TC_02 Kullanıcı gecmis tarih girmelidir.

    And Kullanici "<phone>" bilgilerin doldurur
    And Kullanici gecmis bir tarih secer
    And Kullanici Send an AppointmentRequest butonunu tiklar
    And Kullanici gecersiz bir tarih girdigini cikan pop ile dogrular
    And Kullanici sing out yaparak oturumu kapatir

    Examples:
      |phone      |
      |555-777-4444|

  Scenario Outline: TC_03 Kullanıcı gelecek tarih girmelidir.

    And Kullanici "<phone>" bilgilerin doldurur
    And Kullanici gelecek bir tarih secer
    And Kullanici Send an AppointmentRequest butonunu tiklar
    And Kullanici gecerli bir tarih girdigini cikan pop ile dogrular
    And Kullanici sing out yaparak oturumu kapatir

    Examples:
      |phone      |
      |555-777-4444|
  Scenario Outline: TC_04 Tarih sırası gün/ay/yıl (ay/gün/yıl) şeklinde olmalıdır.

    And Kullanici "<date>" secer ve tarih sirasinin formata uygun seklinde oldugunu test eder
    And Kullanici sing out yaparak oturumu kapatir

    Examples:
      | date |
      | 25.08.2022|


