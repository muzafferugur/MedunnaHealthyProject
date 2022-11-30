Feature:US028 Admin olarak; Country oluşturma / Okuma ve Silme

  Scenario: TC01_Kullanıcı yeni bir ulke olusturabilir.
    Given kullanici "MedunnaUrl" sayfasina gider
    And sayfanin sag ust kosesinde yeralan insan ikonuna tıklar
    Then acilan dropdown menude Sign in butonuna tıklar
    And Admin username olarak "AdminUsername" girer
    And Admin password olarak "AdminPassword" girer
    And Sign in butonuna basar
    Then Items&Titles dropdown menusune tıklar
    And Acilan menude Country secenegine tiklar
    Then Create a new Country butonuna tıklar
    And Eklemek istedigi ülke ismini girer
    And Tarihi girer
    And Save butonuna basar
    And Ulke olusturulup olusturulmadıgını kontrol eder
    And sayfayi kapatir


  Scenario: TC02_Kullanıcı, ulkeye gore ilgili eyaletler veya sehirler olusturabilmelidir.
    Given kullanici "MedunnaUrl" sayfasina gider
    And sayfanin sag ust kosesinde yeralan insan ikonuna tıklar
    Then acilan dropdown menude Sign in butonuna tıklar
    And Admin username olarak "AdminUsername" girer
    And Admin password olarak "AdminPassword" girer
    And Sign in butonuna basar
    Then Items&Titles dropdown menusune tıklar
    And Acilan menude State City secenegine tiklar
    Then Create a new State City butonuna tıklar
    And Eklemek istedigi State City ismini girer
    And Tarihi girer
    And Save butonuna basar
    And sayfayi kapatir


  Scenario: TC06_Kullanıcı ulkeleri silebilmelidir.
    Given kullanici "MedunnaUrl" sayfasina gider
    And sayfanin sag ust kosesinde yeralan insan ikonuna tıklar
    Then acilan dropdown menude Sign in butonuna tıklar
    And Admin username olarak "AdminUsername" girer
    And Admin password olarak "AdminPassword" girer
    And Sign in butonuna basar
    Then Items&Titles dropdown menusune tıklar
    And Acilan menude Country secenegine tiklar
    And Silmek istedigi Ulkenin yanindaki DELETE butonuna basar
    And Silme istegini onaylar
    And silme isleminin gerceklestiğini doğrular
    And sayfayi kapatir
