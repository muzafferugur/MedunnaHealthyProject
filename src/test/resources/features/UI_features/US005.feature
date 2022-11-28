@Smoke
Feature: US_005 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  Background: Anasayfa Make an Appointment Test
    Given Kullanici  "medunnaUrl" anasayfaya gider
    Then Make an Appointment sekmesine tiklar


  Scenario Outline: TC_01 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    #Then Send an Appointment Request butonuna tiklar.
    #And "Appointment registration saved!" onay mesajini gorur.

    Examples:
      | FirstName | LastName | SSN         | Email           | Phone        | AppointmentDate |
      | firstname | lastname | 852-74-9641 | hasta@hasta.com | 741-852-9632 | 15122022         |

  Scenario Outline: TC_02 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your FirstName is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email           | Phone        | AppointmentDate |
      |           | lastname | 852-74-9641 | hasta@hasta.com | 741-852-9632 | 15122022         |


  Scenario Outline: TC_03 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your SSN is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN | Email           | Phone        | AppointmentDate |
      | firstname | lastname |     | hasta@hasta.com | 741-852-9632 | 15122022         |


  Scenario Outline: TC_04 Kullanıcı, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your LastName is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email           | Phone        | AppointmentDate |
      | firstname |          | 852-74-9641 | hasta@hasta.com | 741-852-9632 | 15122022        |


  Scenario Outline: TC_05 Kullanıcı email girmeli, email boş bırakılamaz
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Your email is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email | Phone        | AppointmentDate |
      | firstname | lastname | 852-74-9641 |       | 741-852-9632 | 15122022        |


  Scenario Outline: TC_06 Kullanıcı email adresine @ sembolü koymalıdır
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "This field is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email          | Phone        | AppointmentDate |
      | firstname | lastname | 852-74-9641 | hastahasta.com | 741-852-9632 | 15122022         |


  Scenario Outline: TC_07 Kullanıcı email adresine nokta isareti koymalıdır
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "This field is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email          | Phone        | AppointmentDate |
      | firstname | lastname | 852-74-9641 | hasta@hastacom | 741-852-9632 | 15122022         |


  Scenario Outline: TC_08 Kullanıcı telefon girmeli,telefon boş bırakılamaz.
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Phone number is required." hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email           | Phone | AppointmentDate |
      | firstname | lastname | 852-74-9641 | hasta@hasta.com |       | 15122022         |


  Scenario Outline: TC_09 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz.
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Phone number is invalid" hata mesajini gorur.



    Examples:
      | FirstName | LastName | SSN         | Email           | Phone           | AppointmentDate |
      | firstname | lastname | 852-74-9641 | hasta@hasta.com | 741-852-9632555 | 15122022         |


  Scenario Outline: TC_10 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz.
    And isim olarak "<FirstName>" girer
    And soy isim "<LastName>" girer
    And SSN numarasi olarak "<SSN>" girer
    And Email adresi olarak "<Email>" girer
    And Telefon numarasi olarak "<Phone>" girer
    And Appointment Date olarak "<AppointmentDate>" girer
    Then Send an Appointment Request butonuna tiklar.
    And "Phone number is invalid" hata mesajini gorur.
    And kullanici browseri kapatir



    Examples:
      | FirstName | LastName | SSN         | Email           | Phone      | AppointmentDate |
      | firstname | lastname | 852-74-9641 | hasta@hasta.com | 3335456985414 | 15122022      |
