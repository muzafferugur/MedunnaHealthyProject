@US015
Feature: US015 Admin tarafından hasta oluşturma ve duzenleme

  Background: Ortak Adimlar
    Given AdminSevval belirtilen URL' e gider
    And AdminSevval Sing in sekmesine tiklar
    And AdminSevval gecerli Username i girer
    And AdminSevval gecerli Password u girer
    And AdminSevval Sing in butonuna tiklar
    When AdminSevval Items&Titles sekmesine tiklar
    Then AdminSevval Patient Butonuna tiklar
  @US015_TC001
  Scenario: US015_TC001 Yeni hastalar yalnızca yönetici tarafından oluşturulabilir
    Given AdminSevval Create a new Patient butonuna tiklar
    And AdminSevval First Name kutusuna gecerli ismi girer
    And AdminSevval Last Name kutusuna gecerli ismi girer
    And AdminSevval Email kutusuna gecerli bir email girer
    And AdminSevval Phone kutusuna gecerli bir numara girer
    When AdminSevval Save butonuna tiklar
    When AdminSevval Save butonunun oldugunu dogrular


