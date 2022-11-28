@US08
Feature: US08 Daha guclu sifre icin en az 1 kucuk harf olmali


  Scenario:TC08 "Password strength:" seviyesinin degistigi
  gorulebilmelidir.

    Given Dr.Url adresine gider.
    Then Dr. Kullanici bilgi sekmesini tiklar.
    Then Dr. Login islemini gerceklestirir.
    Then kullanici Password butonunu tiklar
    And kullanici Current password secenegini tiklar
    And kullanici New password secenegini tiklar
    And kullanici New password secenegine en az alti  karakter ve bir kucuk harf girer.
    And kullanici Password strength ikinci seviyesinin degistigini gorur.



  Scenario: TC02 Sifre en az 1 buyuk harf icermeli ve "Password strength:" seviyesinin degistigi gorulebilmelidir.
    And kullanici sayfayi yeniler
    And kullanici New password secenegine en az alti  karakter ve bir buyuk harf girer.
    And kullanici Password strength ikinci seviyesinin degistigini gorur.



  Scenario:Şifre en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    And kullanici sayfayi yeniler
    And kullanici New password secenegine en az alti  karakter ve bir ozel harf girer.
    And kullanici Password strength dorduncu seviyesinin degistigini gorur.


  Scenario:Şifre en az 7 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    And kullanici sayfayi yeniler
    And kullanici en az yedi karakter girer
    And kullanici Password strength besinci seviyesinin degistigini gorur.
    And kullanici sayfayi kapatir


