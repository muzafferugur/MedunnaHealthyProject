Feature: US_021 Staff hastalar için randevuları görür


  Scenario:TC_001 Staff sadece randevulari guncelleyebilir.
    Given kullanici "MedunnaUrl" sayfasina gider
    When Sayfanin sag üst köşesinde yer alan  ikona tıklar
    Then Acilan dropdown menude Sign in butonuna tıklar
    And Username olarak "perUsername" girer
    And Password olarak "perPassword" girer
    And Sign in butonuna basar
    And MYPAGES dropdown menusune tıklar
    And Search Patient butonuna tıklar
    And Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder
    And Patient SSN kısmına hastanın SSN bilgisini girer
    And show appoinments box'i tiklar
    And Kullanici Edit butonuna tiklar
    And Randevu bilgilerinde degisiklik yapilip SAVE yapilir
    And Randevu bilgilerinde degisikliklerin oldugu gorulur
    And Sayfayi kapatir

  Scenario:TC_002 Staff hasta durumunu (status) "UNAPPROVED, PENDING veya CANCELLED" yapabilmeli ancak "COMPLETED" yapamamalı.
    Given kullanici "MedunnaUrl" sayfasina gider
    When Sayfanin sag üst köşesinde yer alan  ikona tıklar
    Then Acilan dropdown menude Sign in butonuna tıklar
    And Username olarak "perUsername" girer
    And Password olarak "perPassword" girer
    And Sign in butonuna basar
    And MYPAGES dropdown menusune tıklar
    And Search Patient butonuna tıklar
    And Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder
    And Patient SSN kısmına hastanın SSN bilgisini girer
    And show appoinments box'i tiklar
    And Kullanici Edit butonuna tiklar
    And Status seceneginin UNAPPROVED oldugu gorulmelidir
    And Status seceneginin PENDİNG  secilmelidir ve  doktor ataması yapilip SAVE yapilmalidir.Status seceneginin PENDİNG oldugu gorulmelidir
    And Status seceneginin COMPLETED  secilmemelidir ve SAVE yapilmalidir.Status seceneginin COMPLETED olmadigi gorulmelidir
    And Status seceneginin CANCELLED  secilmelidir ve SAVE yapilmalidir.Status seceneginin CANCELLED oldugu gorulmelidir
    And Sayfayi kapatir

  Scenario:TC_003 "Staff ""Anamnesis (Hastalık Geçmişi), Treatment ( Tedavi) veya Diagnosis(Teşhis)"" kısımlarına
    Given kullanici "MedunnaUrl" sayfasina gider
    When Sayfanin sag üst köşesinde yer alan  ikona tıklar
    Then Acilan dropdown menude Sign in butonuna tıklar
    And Username olarak "perUsername" girer
    And Password olarak "perPassword" girer
    And Sign in butonuna basar
    And MYPAGES dropdown menusune tıklar
    And Search Patient butonuna tıklar
    And Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder
    And Patient SSN kısmına hastanın SSN bilgisini girer
    And show appoinments box'i tiklar
    And Kullanici Edit butonuna tiklar
    And Anamnesis,Treatment,Diagnosis kisimlarina bilgi girilip,"SAVE"yapilmalidir.
    And Anamnesis,Treatment,Diagnosis kisimlarina bilgi girilmedigi gorulmelidir
    And Sayfayi kapatir

  Scenario:TC_004 Hasta için gerekli doktoru seçebilmeli ve randevuyu oluşturmalı.
    Given kullanici "MedunnaUrl" sayfasina gider
    When Sayfanin sag üst köşesinde yer alan  ikona tıklar
    Then Acilan dropdown menude Sign in butonuna tıklar
    And Username olarak "perUsername" girer
    And Password olarak "perPassword" girer
    And Sign in butonuna basar
    And MYPAGES dropdown menusune tıklar
    And Search Patient butonuna tıklar
    And Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder
    And Patient SSN kısmına hastanın SSN bilgisini girer
    And show appoinments box'i tiklar
    And Kullanici Edit butonuna tiklar
    And "Physician" kismindan doktor secilmelidir ve "SAVE" yapilmalidir
    And Randevunun olustugu  gorulmelidir
    And Sayfayi kapatir