@US016
Feature: US016 Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)

  Background: Ortak Adimlar
    Given HercaiAdmin belirtilen URL' e gider
    And HercaiAdmin Sing in sekmesine tiklar
    And HercaiAdmin gecerli Username i girer
    And HercaiAdmin gecerli Password u girer
    When HercaiAdmin Sing in butonuna tiklar
    And HercaiAdmin Items&Titles sekmesine tiklar
    Then HercaiAdmin Room sekmesine tiklar

  @US016_TC001
  Scenario: US016_TC001 Admin, yatan hastalar için yeni oda oluşturabilir.
    Given  HercaiAdmin Create a new Room butonu oldugunu dogrular

  @US016_TC002
  Scenario: US016_TC002 Oda oluşturulurken "Room Number" mutlaka olmalı,
  "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE
    Given HercaiAdmin Create a new Room butonuna tiklar
    And  HercaiAdmin Room Number yazisini gordugunu dogrular
    Then HercaiAdmin Room Type da TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE seceneklerinin oldugunu dogrular

  @US016_TC003
  Scenario: US016_TC003 Oda için "Status" ayarlanabilir olmalı.
    Given HercaiAdmin Create a new Room butonuna tiklar
    And HercaiAdmin Status seceneginin tiklandigini dogrular

  @US016_TC004
  Scenario: US016_TC004 Fiyat eklenebilir olmalı ve boş bırakılamamalı.
    Given HercaiAdmin Create a new Room butonuna tiklar
    And HercaiAdmin Price box in oldugunu dogrular
    When HercaiAdmin Price box ine bir veri girmeden Save butonuna basar
    Then HercaiAdmin This field is required. yazisinin ciktigini dogrular

  @US016_TC005
  Scenario: US016_TC005 "Description" isteğe bağlı olarak doldurulmalı.
    Given HercaiAdmin Create a new Room butonuna tiklar
    And HercaiAdmin Room Number kutucuguna gecerli bir sayi girer
    And HercaiAdmin Price Kutucugunu doldurur
    When HercaiAdmin Description kutucugunun oldugunu dogrular ve icine bir veri girmez
    And HercaiAdmin Save butonuna tiklar
    Then HercaiAdmin olusturdugu odanin oldugunu dogrular

  @US016_TC006
  Scenario: US016_TC007 Admin aynı tür odaları görebilir.
    Given HercaiAdmin Room Type sekmesine basilabildigini dogrular

  @US016_TC007
  Scenario: US016_TC008 Admin mevcut odaları düzenleyebilir ve güncelleyebilir.
    Given HercaiAdmin Edit butonuna tiklar
    And  HercaiAdmin Price i degistirir
    When  HercaiAdmin editdeki Save butonuna tiklar
    Then  HercaiAdmin Price in degistigini dogrular

  @US016_TC008
  Scenario: US016_TC009 Odalar Admin tarafından silinebilir.
    Given HercaiAdmin daha once olusturdugu ve guncelledigi odaya gider Delete butonuna basar
    And HercaiAdmin ikinci Delete butonununun oldugunu dogrular

























