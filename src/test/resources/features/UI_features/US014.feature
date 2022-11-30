@14
Feature: Physician (Doctor) "Edit Inpatient" (Yatılı Tedavi) işlemleri yapabilmeli

  Scenario:  "Doktor""ID, start and end dates, description, created date
  appointment id, status, room and patient"" bilgilerini görüntülüyebilmelidir."
    Given ydoctor "medunnaUrl" adresine gider.
    Then ydoctor signin sekmesini tıklar
    And ydoctor geçerli bir username girer
    And ydoctor geçerli bir password girer
    And ydoctor Signin butonuna tıklar
    And "MY PAGES" sekmesine tıklar
    And  My Inpatients sekmesine tıklar
    And  Doktor ID, start and end dates, description, created datappointment id, status,room and  patient bilgilerini görüntüleyebilir
    And Adının üstüne tıkladıgında acılan signout sekmesine tıklayarak cikis yapabilir
