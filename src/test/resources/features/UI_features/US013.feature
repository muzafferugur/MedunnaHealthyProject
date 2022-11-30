@13
Feature: Physician (Doktor) "Test Results" işlemleri yapabilmeli
  Background: ilkAdimlar
    Given yDoktor "medunnaUrl" adresine gidebilir
    Then yDoktor signin sekmesini tıklar
    Then yDoktor geçerli bir username girer
    And yDoktor geçerli bir password girer
    And Sign in butonuna tıklar
    And MY PAGES  sekmesine tıklar
    And My Appointments sekmesine tıklar
    And Doctor hastanın edit sekmesine tıklar
  @13a
  Scenario:Doktor "id, name(Urea, Sodium, Glucose etc..), default max value, default min value,test, description and the date" bilgilerini görebilmelidir.
    And Doctor show Test Result sekmesine tıklar
    And Doctor view results diyerek test sonuclarını görüntüler
    And Doctor hastadan istenen sonucların "default max value, default min value,test, description and the date bilgilerini görebilmeli"

  @13b
  Scenario: Physician (Doktor) "Test Results" işlemleri yapabilmeli
      #  And Doctor Request MYInpatient sekmesine tıklar
    And Doctor hastaya yatıs verdigini kontrol eder
    And Doctor hesapadının üstüne  clik yapar
    And  signout yaparak cikis yapar
