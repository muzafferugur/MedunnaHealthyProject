Feature: Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.


  Background:
    Given Kullanici  "medunnaUrl" anasayfaya gider
    Then Kullanici Sign In butonuna tiklar

  Scenario Outline: TC_01 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.
    And Kullanici pozisyonuna gore username "<username>" girer
    And Kullanici pozisyonuna gore password "<password>" girer
    And Signin butonuna tiklar
    And Kullanici settings'e tiklar
    And Kullanici girerken doldurulan kullanıcı bilgilerini gorur(firstname, lastname, email )
    And Kullanici sing out yaparak oturumu kapatir


    Examples:
      |username   |password |
      |HastaYasemin   |Ankara06|
      |DoctorYasemin  |Amasya05|


  Scenario Outline: TC_02  "Firstname"güncelleme seçeneği olmalıdır.
    And Kullanici username olarak "<username>" girer
    And Kullanici password olarak "<password>" girer
    And Signin butonuna tiklar
    And Kullanici settings'e tiklar
    And Kullanici firstname kutusunu "<new firstname>" yazisi ile gunceller.
    And Kullanici Save butonuna tiklar ve firstname kutusundaki yazinin guncellendigini gorur.
    Then Kullanici firstname kutusunu "<previous firstname>" yazisi ile gunceller.
    And Kullanici sing out yaparak oturumu kapatir

    Examples:
      | username      | password | new firstname |previous firstname|
      |HastaYasemin   |Ankara06  |hastayeni      |hasta             |


  Scenario Outline: TC_03  "Lastname"güncelleme seçeneği olmalıdır.
    And Kullanici username olarak "<username>" girer
    And Kullanici password olarak "<password>" girer
    And Signin butonuna tiklar
    And Kullanici settings'e tiklar
    And Kullanici lastname  kutusunu "<new lastname>" yazisi ile gunceller.
    And Kullanici Save butonuna tiklar ve lastname kutusundaki yazinin guncellendigini gorur.
    And Kullanici lastname  kutusunu "<previous lastname>" yazisi ile gunceller.
    And Kullanici sing out yaparak oturumu kapatir
    Examples:
      | username      | password  | new lastname|previous lastname|
      |HastaYasemin   |Ankara06   |yaseminyeni  |yasemin          |

  Scenario Outline: TC_04  "email"güncelleme seçeneği olmalıdır.
    And Kullanici username olarak "<username>" girer
    And Kullanici password olarak "<password>" girer
    And Signin butonuna tiklar
    And Kullanici settings'e tiklar
    And Kullanici email  kutusunu "<new email>" yazisi ile gunceller.
    And Kullanici Save butonuna tiklar ve email kutusundaki yazinin guncellendigini gorur.
    And Kullanici email  kutusunu "<previous email>" yazisi ile gunceller.
    And Kullanici sing out yaparak oturumu kapatir

    Examples:
      | username | password |new email               |previous email      |
      |HastaYasemin   |Ankara06|hastayaseminyeni@gmail.com  |hastayasemin@gmail.com  |





