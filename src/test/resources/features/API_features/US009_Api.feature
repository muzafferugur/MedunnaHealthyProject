@009
Feature: API Test
  Scenario: TC04 Kullanıcı API kullanarak tüm hasta bilgilerini dogrulamalidir
    Given SG Kullanici 309176 id numarali hastanin tum bilgilerine GET request gonderir
    Then SG Kullanici status kodunun 200 oldugunu gorur
    And SG Kullanici bilgilerin dogrulandigini kontrol eder