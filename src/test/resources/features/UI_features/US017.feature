@US017
Feature: US017 Test items(oge) Olustur / Guncelle / Sil

  Background: Ortak Adimlar
    Given AdminHercai belirtilen URL' e gider
    And AdminHercai sign in sekmesine tiklar
    And AdminHercai gecerli Username i girer
    When AdminHercai gecerli Password u girer
    And AdminHercai sign in butonuna tiklar
    And AdminHercai Items&Titles sekmesine tiklar
    Then AdminHercai Test Items sekmesine tiklar

  @US017_TC001
  Scenario: US017_TC001 Admin yeni test ogeleri olusturabilir
    Given AdminHercai Create a New  Test Item butonunun oldugunu dogrular

  @US017_TC003
  Scenario: US017_TC003 Admin test ogelerini goruntuleyebilir.
    Given AdminHercai ilk View butonuna tiklar
    And AdminHercai Name, Description, Price, Default Min. Value, Default Max. Value ve Created Date yazilarinin gozuktugunu dogrular

  @US017_TC004
  Scenario: US017_TC004 Admin test öğelerini silebilir.
    Given AdminHercai kendi olusturdugu Test Item a gider
    Then AdminHercai Delete butonuna basar
    And AdminHercai Delete butonuna basar