@US027_UI

Feature: US027 Admin mesajlari gorebilir ve duzenleyebilir

  Background: Ortak Stepler
    Given  Medunna anasayfasina gidilir
    Then   fgAccount menu butonu tiklanir
    And    fgSign in butonuna tiklar
    And    fgKullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı girer
    And    fgKullanici acilan sayfada Password bolumune gecerli bir sifre girer
    And    fgSign in butonuna
    And    fgItems Titles butonuna tiklar



  @US027_TC01
  Scenario : US027_TC01 Admin, mesaj portalına gidebilir ve tüm mesajları, yazarlarını ve e-postalarını görüntüleyebilir.
    Given fgAcilan menuden message bolumune tiklar
    And fgYazilan mesajlarin gorundugunu dogrular
    And fgMesajlari gonderenkerin isimlerinin gorundugunu dogrular
    And fgMesajlari gonderenlerin e-postalarinin gorundugunu dogrular



  @US027_TC02
  Scenario: US027_TC02 Admin, mesajları oluşturabilir, güncelleyebilir, silebilir.
    Given fgAcilan menuden message bolumune tiklar
    Then fgCreate a new message butonuna tiklar
    And fgAcilan sayfada   Name, Email, Subject, Message bölümlerine gerekli bilgileri girer
    And fgSave butonuna tiklar
    And fgOnceden olusturulan bir mesaji Edit butonunu kullanarak gunceller
    And fgEdit ile guncellenen mesaji Save yaptigi zaman gelen onay mesajini gorur
    And fgDelete butonu ile olusturulan bir mesaji siler
    And fgSilinen mesajin onay mesajinin geldigini dogrular
