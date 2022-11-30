Feature: US009 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir


  Scenario: TC01_My Pages sekmesinden hasta bilgilerini görebilmelidir.
    Given SG kullanici "MedunnaUrl" sayfasina gider
    And SG Sayfanin sag üst köşesinde yer alan  ikona tıklar
    Then SG Acilan dropdown menude Sign in butonuna tıklar
    And SG Username olarak "perUsername" girer
    And SG Password olarak "perPassword" girer
    And SG Sign in butonuna basar
    Then SG MYPAGES dropdown menusune tıklar
    And SG Search Patient butonuna tıklar
    Then SG Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder
    And SG Sayfayi kapatir


  Scenario: TC_02 Kullanıcı bütün hasta bilgilerini "id, firstname, lastname, birthdate, email, phone, gender, blood group,
  address, description, user, country and state/city" düzenleyebilmelidir.

    Given SG kullanici "MedunnaUrl" sayfasina gider
    And SG Sayfanin sag üst köşesinde yer alan  ikona tıklar
    Then SG Acilan dropdown menude Sign in butonuna tıklar
    And SG Username olarak "StaffUsername" girer
    And SG Password olarak "StaffPassword" girer
    And SG Sign in butonuna basar
    Then SG MYPAGES dropdown menusune tıklar
    And SG Search Patient butonuna tıklar
    Then SG Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar
    Then SG Hasta bilgilerinin düzenlenebilir oldugunu test eder
    And SG Sayfayi kapatir

  Scenario: TC_03 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli
  ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    And SG kullanici "MedunnaUrl" sayfasina gider
    Then SG Sayfanin sag üst köşesinde yer alan  ikona tıklar
    And SG Acilan dropdown menude Sign in butonuna tıklar
    And SG Username olarak "StaffUsername" girer
    And SG Password olarak "StaffPassword" girer
    Then SG Sign in butonuna basar
    And SG MYPAGES dropdown menusune tıklar
    Then SG Search Patient butonuna tıklar
    Then SG Patient SSN kısmına hastanın SSN bilgisini girer
    And SG Ilgili hastanın yanındaki view butonuna tıklar
    And SG kayit bilgilerinin gorunur oldugunu test eder
    And SG Sayfayi kapatir

  Scenario: TC_04  Kullanıcı herhangi bir hasta bilgisini silebilir.
    And SG kullanici "MedunnaUrl" sayfasina gider
    Then SG Sayfanin sag üst köşesinde yer alan  ikona tıklar
    And SG Acilan dropdown menude Sign in butonuna tıklar
    And SG Username olarak "StaffUsername" girer
    And SG Password olarak "StaffPassword" girer
    Then SG Sign in butonuna basar
    And SG MYPAGES dropdown menusune tıklar
    Then SG Search Patient butonuna tıklar
    Then SG Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar
    And SG kayit bilgilerini siler ve Save butonuna tıklar
    And SG bilgilerin silinip silinmedigini test eder
    And SG Sayfayi kapatir


