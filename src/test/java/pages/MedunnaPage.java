package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class MedunnaPage{
 public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
        }
//US-001 (11-110)
   @FindBy(id = "account-menu")   public WebElement accountMenu;
    @FindBy(xpath = "//*[text()='Register']")   public WebElement register;
    @FindBy(xpath = "//input[@name='ssn']")   public WebElement ssnBox;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")   public WebElement SSNFeedback;
    @FindBy(xpath = "//*[.='Your SSN is required.']")   public WebElement SSNRequiredFeedback;
    @FindBy(xpath = "//*[.='Your FirstName is required.']")   public WebElement firstNameRequiredFeedback;
    @FindBy(xpath = "//*[.='Your LastName is required.']")   public WebElement lastNameRequiredFeedback;
    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]")   public WebElement SSNValidFeedback;
    @FindBy(xpath = "//input[@name='firstName']")    public WebElement firstNameBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")   public WebElement firstNameFeedback;
    @FindBy(xpath = "//input[@name='lastName']")      public WebElement lastNameBox;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")     public WebElement lastNameFeedback;
    @FindBy(xpath = "//input[@name='username']")    public WebElement userNameBox;
    @FindBy(xpath = "//*[.='Your username is required.']")   public WebElement userNameRequiredFeedback;
    @FindBy(xpath = "//input[@name='email']")    public WebElement emailBox;
    @FindBy(xpath = "//*[.='Your email is required.']")   public WebElement emailRequiredFeedback;
    @FindBy(xpath = "//*[@id=\"register-form\"]/div[5]/div")   public WebElement emailInvalidFeedback;
    @FindBy(xpath = "//*[@id='firstPassword']")   public WebElement newPasswordBox;
    @FindBy(xpath = "//*[.='Your password is required to be at least 4 characters.']")
    public WebElement invalidPasswordFeedback;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement newPasswordFirstColor;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement newPasswordSecondColor;
    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement newPasswordFourthColor;
    public WebElement newPasswordFifthColor;
    @FindBy(xpath = "//input[@name='firstPassword']") public WebElement newPasswordSec;
    @FindBy(xpath = "//input[@name='username']") public WebElement username;
    @FindBy(xpath = "//*[text()='Sign in']") public WebElement signIn;
    @FindBy(xpath = "//*[text()='Administration']") public WebElement girisText;
    @FindBy(xpath = "//*[@id='rememberMe']") public WebElement rememberMe;
    @FindBy(xpath = "//*[text()='Did you forget your password?']") public WebElement didYouForget;
    @FindBy(xpath = "//*[text()='Enter the email address you used to register']") public WebElement resetPassword;
    @FindBy(xpath = "//*[text()='Register a new account']") public WebElement accountGo;
    @FindBy(xpath = "//*[text()='Cancel']") public WebElement cancel;
    @FindBy(xpath = "//*[@id='app-view-container']") public WebElement anaSayfa;
    @FindBy(xpath = "Sign out") public WebElement signOut;





  























































//US-002 (111-210)



































































































//US-003 (211-310)



































































































//US-004 (311-410)



































































































//US-005 (411-510)
 @FindBy(xpath = "//a[@class='appointment-btn scrollto']") public WebElement makeAppointmentButton;
 @FindBy(xpath = "//input[@id='firstName']") public WebElement firstNameBox3;
 @FindBy(xpath = "//input[@id='lastName']") public WebElement lastNameBox3;
 @FindBy(xpath = "//input[@id='ssn']") public WebElement SSNBox;
 @FindBy(xpath = "//input[@id='email']") public WebElement emailBox3;
 @FindBy(xpath = "//input[@id='phone']") public WebElement phoneBox;
 @FindBy(xpath = "//input[@id='appoDate']") public WebElement appointmentDateBox;
 @FindBy(xpath = "//button[@id='register-submit']") public WebElement sendAnAppointmentRequestButton;
 @FindBy(xpath = "//div[@class='invalid-feedback']") public WebElement hataMesaji;
 // @FindBy(xpath = "//strong[normalize-space()='Appointment registration saved!']")
 @FindBy(xpath = "//div[@role='alert']")
 public WebElement registerOnayMesaji;  // "Appointment registration saved! We will call you as soon as possible."

 @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
 public WebElement myPageButton;

 @FindBy(xpath = "//span[text()='Make an Appointment']")
 public WebElement makeAppintmentclickbutonu;

 @FindBy(xpath = "//span[text()='Appointment date can not be past date!']")
 public WebElement hataliTarihUyariYazisiElementi;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement signInButton2;

 @FindBy(xpath = "//input[@id='username']")
 public WebElement usernameTextBox;

 @FindBy(xpath = "//input[@id='password']")
 public WebElement passwordTextBox;

 @FindBy(xpath = "//*[text()='Settings']")
 public WebElement settingsButton;

 @FindBy(xpath = "//span[normalize-space()='hasta yasemin']")
 public WebElement settingsButton2;
 @FindBy(xpath = "//*[contains(text(),'User settings for')]")
 public WebElement userSettingsForText;

 @FindBy(xpath ="//input[@name='firstName']")
 public WebElement firstnameTextBox;

 @FindBy(xpath ="//input[@name='lastName']")
 public WebElement lastnameTextBox;

 @FindBy(xpath ="//input[@name='email']")
 public WebElement emailTextBox;

 @FindBy(xpath = "//span[text()='Sign out']")
 public WebElement signOutButton;
 @FindBy(xpath = "//span[normalize-space()='hasta yasemin']")
 public WebElement signOutButton2;
 @FindBy (xpath = "//span[text()='Save']")
 public WebElement saveButton;

 @FindBy(id = "account-menu")
 public WebElement accountMenu3;

 @FindBy(xpath = "//*[text()='Sign in']")
 public WebElement signInButton1;

 @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
 public WebElement myPagesButton;

 @FindBy(xpath = "//span[text()='Make an Appointment']")
 public WebElement makeanAppointmentButton;

 @FindBy(xpath = "(//*[text()='Make an Appointment'])[2]")
 public WebElement makeanAppointmenttext;

 @FindBy(id="phone")
 public WebElement phone;

 @FindBy(xpath = "//input[@value='2022-08-16']")
 public WebElement appointmentDateTime;

 @FindBy(xpath = "Appointment date can not be past date!")
 public WebElement sendAppointmentButton;

 @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")
 public WebElement sendAppointmentButton2;
 @FindBy(xpath = "//*[contains(text(),'Appointment registration saved')]")
 public WebElement successMessageToastContainer;

 @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
 public WebElement signIn3;

 @FindBy(xpath = "//span[normalize-space()='Register']")
 public WebElement register3;
 @FindBy(xpath = "//button[@id='register-submit']//span[contains(text(),'Register')]")
 public WebElement register2;

 @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")
 public WebElement sendAppointmentButton3;






//US-006 (511-610)



































































































//US-007 (611-710)



































































































 //US-008 (711-810)
@FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
public WebElement kullaniciGirisBolumu;
 @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
 public WebElement signinGiris;
 @FindBy(xpath = "//input[@name='password']")
 public WebElement password;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement signinButton;
 @FindBy(xpath = "//span[.='Password']")
 public  WebElement passwordButonu;
 @FindBy(xpath = "//input[@name='currentPassword']")
 public  WebElement currentPassword;
 @FindBy(xpath = "//input[@name='newPassword']")
 public  WebElement newPassword;
 @FindBy(xpath = "//input[@name='confirmPassword']")
 public  WebElement confirmPassword;
 @FindBy(xpath = "//div[@class='invalid-feedback']")
 public  WebElement notConfirmationText;
 @FindBy(xpath = "//span[.='Sign out']")
 public  WebElement signoutButonu;
 @FindBy(xpath = "//*[@id='strengthBar']")
 public  WebElement ikinciBar;
 @FindBy(xpath = "//*[@id='strengthBar']")
 public  WebElement besinciBar;
 @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
 public  WebElement birinciBar;
 @FindBy(xpath = "//*[@id='strengthBar']")
 public  WebElement dorduncuBar;
 @FindBy(xpath = "//button[@type='submit']")
 public  WebElement saveButonu;
 @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
 public  WebElement passwordChangedText;



































































 //US-009 (811-910)
 @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
 public WebElement girisIkonu;
 @FindBy(xpath = "//*[text()='Sign in']")
 public WebElement IlksignIn;
 @FindBy(xpath = "//*[@id='username']")
 public WebElement username09;
 @FindBy(xpath = "//*[@id='password']")
 public WebElement password09;
 @FindBy(xpath = "//*[@type='submit']")
 public WebElement ikinciSignIn;
 @FindBy(xpath = "//*[text()='MY PAGES']")
 public WebElement myPagesButton09;

 @FindBy(xpath = "(//*[text()='Search Patient'])[1]")
 public WebElement searchPatientButton;

 @FindBy(xpath = "(//*[text()='Search Patient'])[1]")
 public List<WebElement> patientsList;

 @FindBy(xpath = "(//*[text()='Edit'])[1]")
 public WebElement editButton;

 @FindBy(xpath = "//*[@id='patient-firstName']")
 public WebElement userNameEdit;
 @FindBy(xpath = "//*[@id='patient-gender']")
 public WebElement genderEdit;
 @FindBy(xpath = "//*[@id='patient-bloodGroup']")
 public WebElement bloodGroupEdit;
 @FindBy(xpath = "//*[@class='form-control']")
 public WebElement ssnSearchBox;
 @FindBy(xpath = "//*[@class='btn btn-info btn-sm']")
 public WebElement wiewButton;
 @FindBy(xpath = "//*[@class='jh-entity-details']")
 public WebElement wiewDetails;
 @FindBy(xpath = "(//*[@focusable='false'])[9]")
 public WebElement saveButton09;
 @FindBy(xpath = "//*[@id='patient-country']")
 public WebElement countrySearchBox;
 @FindBy(xpath = " //*[contains(text(),'A Patient is updated with identifier 309175')]")
 public WebElement cikanMesaj;
 @FindBy(xpath = " //*[text()='145-58-5806']")
 public WebElement ssnIleAramaSonucu;
 @FindBy(xpath = "//input[@name='id']")
 public WebElement hastaBilgileriGuncellemeIdTextBoxElementi;
 @FindBy(xpath = "//input[@name='firstName']")
 public WebElement hastaBilgileriGuncellemeFirstNameTextBoxElementi;
 @FindBy(xpath = "//input[@name='lastName']")
 public WebElement hastaBilgileriGuncellemeLastNameTextBoxElementi;
 @FindBy(xpath = "//input[@name='birthDate']")
 public WebElement hastaBilgileriGuncellemeBirthDateTextBoxElementi;
 @FindBy(xpath = "//input[@name='email']")
 public WebElement hastaBilgileriGuncellemeEmailTextBoxElementi;
 @FindBy(xpath = "//input[@name='phone']")
 public WebElement hastaBilgileriGuncellemePhoneTextBoxElementi;
 @FindBy(xpath = "//select[@name='gender']")
 public WebElement hastaBilgileriGuncellemeGenderSelectMenuElementi;
 @FindBy(xpath = "//select[@name='bloodGroup']")
 public WebElement hastaBilgileriGuncellemeBloodGroupSelectMenuElementi;
 @FindBy(xpath = "//input[@name='adress']")
 public WebElement hastaBilgileriGuncellemeAdressTextBoxElementi;
 @FindBy(xpath = "//textarea[@name='description']")
 public WebElement hastaBilgileriGuncellemeDescriptionTextBoxElementi;
 @FindBy(xpath = "//select[@name='user.id']")
 public WebElement hastaBilgileriGuncellemeUserSelectMenuElementi;
 @FindBy(xpath = "//select[@name='country.id']")
 public WebElement hastaBilgileriGuncellemeCountrySelectMenuElementi;
 @FindBy(xpath = "//select[@name='cstate.id']")
 public WebElement hastaBilgileriGuncellemeStateSelectMenuElementi;
 @FindBy(xpath = "//button[@type='submit']")
 public WebElement hastaBilgileriGuncellemeSaveButonuElementi;
 @FindBy(xpath = "//*[@class=\"btn btn-info btn-sm\"]")
 public WebElement wiewButtonUs22;



























//US-010 (911-1010)
@FindBy(xpath = "//*[@id='account-menu']")
public WebElement ilkButon;
 @FindBy(xpath = "//*[@class='btn btn-primary']")
 public WebElement signinButtonKayit;
 @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
 public WebElement myPages;
 @FindBy(xpath = "//*[text()='My Appointments']")
 public WebElement myAppointments;
 @FindBy(xpath = "//*[@class='table-responsive']")
 public WebElement hastaListesi;
 @FindBy(xpath = "//*[@id='fromDate']")
 public WebElement zamanFrom;
 @FindBy(xpath = "//*[@id='toDate']")
 public WebElement zamanTo;
 @FindBy(xpath = "//*[text()='Start DateTime']")
 public WebElement startDateTime;
 @FindBy(xpath = "//*[text()='End DateTime']")
 public WebElement endDateTime;
 @FindBy(xpath = "//*[text()='Status']")
 public WebElement status;
 @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
 public WebElement editButonu;













































































 //US-011 (1011-1110)
@FindBy (xpath = "//*[text()='Create or Edit an Appointment']")
public WebElement createEditAppointmentText;

 @FindBy (xpath = "//*[@name='id']")
 public WebElement idTextBox;

 @FindBy (xpath = "//*[@name='startDate']")
 public WebElement startDateTimeTextBox;

 @FindBy (xpath = "//*[@name='endDate']")
 public WebElement endDateTimeTextBox;

 @FindBy (css = "#appointment-status")
 public List<WebElement> statusDropDown;

 @FindBy (css = "#appointment-status")
 public WebElement statusDropDown1;

 @FindBy (xpath = "//*[@name='physician.id']")
 public WebElement physicianDropDown;

 @FindBy(xpath = "//*[@id='appointment-anamnesis']")
 public WebElement anamnesisTextBox;

 @FindBy(xpath = "//*[@id='appointment-treatment']")
 public WebElement treatmentTextBox;

 @FindBy(xpath = "//*[@id='appointment-diagnosis']")
 public WebElement diagnosisTextBox;

 @FindBy(xpath = "//*[@id='appointment-prescription']")
 public WebElement prescriptionTextBox;

 @FindBy(xpath = "//*[@id='appointment-description']")
 public WebElement descriptionTextBox;
 @FindBy(xpath = "//thead//tr//th")
 public WebElement id;
 @FindBy(xpath = "//*[text()='Patient']")
 public WebElement patient;
 @FindBy(xpath = "//*[text()='Physician']")
 public WebElement physician;
 @FindBy(xpath = "(//*[text()='This field is required.'])[1]")
 public WebElement anamnesisTextBoxDisplayed;
 @FindBy(xpath = "(//*[text()='This field is required.'])[2]")
 public WebElement treatmentTextBoxDisplayed;
 @FindBy(xpath = "(//*[text()='This field is required.'])[3]")
 public WebElement diagnosisTextBoxDisplayed;

 @FindBy(xpath = "//*[text()='PENDING']")
 public WebElement pendingtext;

 @FindBy(xpath = "//*[text()='COMPLETED']")
 public WebElement completedtext;

 @FindBy(xpath = "//*[text()='CANCELLED']")
 public WebElement cancelledtext;

 @FindBy(xpath = "//*[text()='UNAPPROVED']")
 public WebElement unapprovedtext;








































 //US-012 (1111-1210)



































































































//US-013 (1211-1310)



































































































//US-014 (1311-1410)



































































































//US-015 (1411-1510)



































































































//US-016 (1511-1610)



































































































//US-017 (1611-1710)



































































































//US-018 (1711-1810)



































































































//US-019 (1811-1910)



































































































//US-020 (1911-2010)



































































































//US-021 (2011-2110)



































































































//US-022 (2111-2210)



































































































//US-023 (2211-2310)



































































































//US-024 (2311-2410)



































































































//US-025 (2411-2510)



































































































//US-026 (2511-2610)



































































































//US-027 (2611-2710)



































































































//US-028 (2711-2810)













































































































}
