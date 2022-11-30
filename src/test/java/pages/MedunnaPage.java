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
 public WebElement phone07;

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
 public WebElement myPages10;
 @FindBy(xpath = "//*[text()='My Appointments']")
 public WebElement myAppointments10;
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
@FindBy(id = "account-menu") public WebElement accountIcon;
 @FindBy(id = "login-item") public WebElement signInButton;
 @FindBy (xpath = "//input[@name='password']")  public WebElement passwordBox;
 @FindBy (xpath = "//button[@type='submit']")  public WebElement signInButton22;
 @FindBy(xpath = "//div//li[7]")  public WebElement itemTitlesDropdown;
 @FindBy (xpath = "(//a[@class='dropdown-item'])[3]") public WebElement physicianOption;
 @FindBy(xpath = "//td") public List<WebElement> physiciansTable;
 @FindBy (xpath = "//*[text()='Create a new Physician']") public WebElement createANewPhysicianButton;
 @FindBy (xpath = "//input[@id='searchSSN']") public WebElement useSearchBox;
 @FindBy(xpath = "//input[@id='useSSNSearch']") public WebElement useSearchCheckBox;
 @FindBy(xpath = "//*[text()='Search User']") public WebElement searchUserButton;
 @FindBy (xpath = "//div[@class='Toastify__toast-body']") public WebElement ssnAlertMessage;
 @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]") public WebElement physicianEditButton;
 @FindBy(xpath = "//input[@id='physician-firstName']") public WebElement physicianFirstnameBox;
 @FindBy(xpath = "//input[@id='physician-lastName']") public WebElement physicianLastnameBox;
 @FindBy(xpath = "//input[@id='physician1-birthDate']")  public WebElement physicianBirthDateBox;
 @FindBy(xpath = "//input[@id='physician-phone']") public WebElement physicianPhoneBox;
 @FindBy(xpath = "//input[@id='physician-adress']") public WebElement physicianAdressBox;
 @FindBy(xpath = "//select[@id='physician-gender']") public WebElement genderDdm;
 @FindBy(xpath = "//*[@id=\"physician-speciality\"]") public WebElement specialityDdm;
 @FindBy(xpath = "//select[@id='physician-bloodGroup']") public WebElement physicianBloodGroupBox;
 @FindBy(xpath = "//input[@id='physician-description']") public WebElement physicianDescriptionBox;
 @FindBy(xpath = "//input[@id='physician-examFee']") public WebElement examFeeBox;
 @FindBy(xpath = "//select[@id='physician-country']") public WebElement physicianCountryDdm;
 @FindBy(xpath = "//select[@id='physician-cstate']") public WebElement physicianStateCityDdm;
 @FindBy (xpath = "//*[text()='Save']") public WebElement createPhysicianSaveButton;
 @FindBy(xpath = "//*[@id=\"file_image\"]") public WebElement imageButton;
 @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[2]/div/form/div[12]/div/div/div[2]/button/svg/path") public WebElement clearButton;
 @FindBy(xpath = "//select[@id='physician-user']") public WebElement userDdm;
 @FindBy(xpath = "//*[@id='staff-cstate']") public WebElement staffStateBox;
 //@FindBy(xpath = "//*[@id='save-entity']") public WebElement saveButton;
 @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")  public WebElement staffViewButton;
 @FindBy (xpath = "(//*[text()='Delete'])[1]") public WebElement staffDeleteButton;
 @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[3]/button[1]") public WebElement deleteAlert;
 @FindBy(xpath = "(//div//a)[103]") public WebElement Delete;
 @FindBy(xpath = "(//div[@class='table-responsive'])[2]") public WebElement TableResponsive;
 @FindBy(xpath = "(//*[@class='btn btn-danger btn-sm'])[20]") public WebElement birinciSayfaDelete;


































































































//US-019 (1811-1910)
@FindBy(xpath = "//*[@id='entity-menu']/div/a[2]") public WebElement staffButton;
 @FindBy(xpath = "//span[normalize-space()='Create a new Staff']") public WebElement createStaff;
 @FindBy(xpath = "//input[@id='useSSNSearch']")  public WebElement useSearch;
 @FindBy(xpath = "//input[@id='searchSSN']") public WebElement staffSSNBox;
 @FindBy(xpath = "//*[@id='staff-firstName']") public WebElement staffFirstnameBox;
 @FindBy(xpath = "//*[@id='staff-lastName']") public WebElement staffLastnameBox;
 @FindBy(xpath = "//*[@id='staff-birthDate']") public WebElement staffBirthDateBox;
 @FindBy(xpath = "//*[@id='staff-phone']") public WebElement staffPhoneBox;
 @FindBy(xpath = "//*[@id='staff-gender']") public WebElement staffGender;
 @FindBy(xpath = "//*[@id='staff-bloodGroup']") public WebElement staffBloodGroupBox;
 @FindBy(xpath = "//*[@id='staff-adress']") public WebElement staffAddressBox;
 @FindBy(xpath = "//*[@id='staff-description']") public WebElement staffDescriptionBox;
 @FindBy(xpath = "//*[@id='staff-country']") public WebElement staffCountryBox;
 @FindBy(xpath = "//*[@id='staff-user']") public WebElement staffUserBox;
 @FindBy(xpath = "(//*[text()='Staff'])[2]")  public WebElement staffTitle;
 @FindBy(xpath = "//h2/b") public WebElement staffId;
 @FindBy(xpath = "//dt[1]") public WebElement staffSsn;
 @FindBy(xpath = "//dt[2]") public WebElement staffFirstname;
 @FindBy(xpath = "//dt[3]") public WebElement staffLastname;
 @FindBy(xpath = "//dt[4]") public WebElement staffBirthdate;
 @FindBy(xpath = "//dt[5]") public WebElement staffPhone;
 @FindBy(xpath = "//dt[6]") public WebElement staffGender2;
 @FindBy(xpath = "//dt[7]") public WebElement staffBlood;
 @FindBy(xpath = "//dt[8]") public WebElement staffAddress;
 @FindBy(xpath = "//dt[9]") public WebElement staffDescription;
 @FindBy(xpath = "//dt[10]") public WebElement staffCreatedate;
 @FindBy(xpath = "//dt[11]") public WebElement staffUser;
 @FindBy(xpath = "//dt[12]") public WebElement staffCountry;
 @FindBy(xpath = "//dt[13]") public WebElement staffState;
 @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[3]") public WebElement staffEditButton;
 @FindBy(xpath = "//input[@id='staff-firstName']") public WebElement staffFirstNameBox;
 @FindBy(xpath = "//input[@id='staff-lastName']") public WebElement staffLastNameBox;
 @FindBy(xpath = "//*[text()='2']") public WebElement staffPage2;
 @FindBy(xpath = " (//*[@class='btn btn-danger btn-sm'])[14]") public WebElement staffDeleteButton2;
 @FindBy(xpath = "//*[@id='jhi-confirm-delete-staff']") public WebElement staffDeleteConfirmButton;




























//US-020 (1911-2010)
@FindBy(xpath="//*[@id='admin-menu']")  public WebElement administrationButton;
 @FindBy(xpath="//span[text()='User management']") public WebElement userManagementButton;
 @FindBy(xpath="(//span[text()='View'])[2]") public WebElement userViewButton;
 @FindBy(xpath="//span[text()='First name']") public WebElement userFirstNameElement;
 @FindBy(xpath="//span[text()='Last name']") public WebElement userLastNameElement;
 @FindBy(xpath="//span[text()='Email']") public WebElement userEmailElement;
 @FindBy(xpath="(//*[@class='btn btn-primary btn-sm'])[4]") public WebElement userEditButton;
 @FindBy(xpath="//*[@type='checkbox']") public WebElement activatedCheckBox;
 @FindBy(xpath="//option[@value='ROLE_ADMIN']") public WebElement profilesRoleAdmin;
 @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success toastify-toast']") public WebElement rolKabulYaziElementi;
 @FindBy(xpath="//span[text()='Save']") public WebElement userSaveButton;
 @FindBy(xpath="//option[@value='ROLE_USER']") public WebElement profilesRoleUser;
 @FindBy(xpath="//option[@value='ROLE_PATIENT']") public WebElement profilesRolePatient;
 @FindBy(xpath="//option[@value='ROLE_STAFF']") public WebElement profilesRoleStaff;
 @FindBy(xpath="//option[@value='ROLE_PHYSICIAN']") public WebElement profilesRolePhysician;
 @FindBy(xpath="(//span[text()='Delete'])[13]") public WebElement userDeleteButton;


































































































//US-021 (2011-2110)



































































































//US-022 (2111-2210)



































































































//US-023 (2211-2310)



































































































//US-024 (2311-2410)













 // son eklenenler 24. US için
 @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']") public WebElement myPages;
 @FindBy(xpath = "(//*[@class='bx bx-chevron-right'])[6]") public WebElement makeAnAppointment;
 @FindBy(xpath = "//h2") public WebElement makeAnAppointmentHead;
 @FindBy(xpath = "(//*[text()='My Appointments'])[1]") public WebElement myAppointments;
 @FindBy(xpath = "(//*[@href='/patient-appointment'])[2]") public WebElement myAppointment;
 @FindBy(xpath = "(//*[@href='/patient-appointment'])[2]") public WebElement firstName;
 @FindBy(xpath = "//*[@name='phone']") public WebElement phone;
 @FindBy(xpath = "//*[@id='register-submit']") public WebElement sendRequest;
 @FindBy(xpath = "//*[@style='pointer-events: none;']") public WebElement onay;
 @FindBy(xpath = "(//*[@class='svg-inline--fa fa-pencil-alt fa-w-16 '])[1]") public WebElement showTests;
 @FindBy(xpath = "(//*[@class='btn btn-warning btn-sm'])[1]") public WebElement showinvoice;
 @FindBy(xpath = "//*[@style='font-size: 45px;']") public WebElement invoice;
 @FindBy(xpath = "//*[@style='font-size: 45px;']") public WebElement fatura;
 @FindBy(xpath = "//tbody//tr[1]//td[7]") public WebElement viewTest;
 @FindBy(xpath = "//*[@class='jh-card card']") public WebElement testResult;
 @FindBy(xpath = "//*[text()='onuray']") public WebElement hastaPage;


































































































//US-025 (2411-2510)



































































































//US-026 (2511-2610)
@FindBy(xpath = "//*[@id=\"header-tabs\"]/li[6]/a") public WebElement contactButton;
 @FindBy(xpath = "//*[@id=\"message\"]") public WebElement contactMessageBox;
 @FindBy(xpath = "//*[@id=\"register-submit\"]") public WebElement contactSendButton;
 @FindBy(xpath = "//*[@id=\"name\"]") public WebElement contactNameBox;
 @FindBy(xpath = "//*[@id=\"email\"]") public WebElement contactEmailBox;
 @FindBy(xpath = "//*[@id=\"subject\"]") public WebElement contactSubject;





























































































//US-027 (2611-2710)
@FindBy(xpath = "//*[@id=\"account-menu\"]/a") public WebElement accountGirisButton27;
 @FindBy(xpath = "//*[@id=\"login-item\"]/span") public WebElement accountSignInGirisButton27;
 @FindBy(xpath = "//*[@id=\"username\"]") public WebElement accountUserNameBox27;
 @FindBy(xpath = "//*[@id=\"password\"]") public WebElement accountPasswordBox27;
 @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span") public WebElement account2SignInButton27;
 @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span") public WebElement ItemTitleButton27;
 @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[9]/span") public WebElement messageButton27;
 @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[5]/span") public WebElement messageGor;
 @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[2]/span") public WebElement messageNameGor;
 @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[3]/span") public WebElement messageEmailGor;
 @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span") public WebElement createMessageButton;
 @FindBy(xpath = "//*[@id=\"c-message-name\"]") public WebElement createMessageNameBox;
 @FindBy(xpath = "//*[@id=\"c-message-email\"]") public WebElement createMessageEmailBox;
 @FindBy(xpath = "//*[@id=\"c-message-subject\"]") public WebElement createMessageSubjectBox;
 @FindBy(xpath = "//*[@id=\"c-message-message\"]") public WebElement createMessageBox;
 @FindBy(xpath = "//*[@id=\"save-entity\"]") public WebElement createMessageSaveButton;
 @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[6]/div/a[2]") public WebElement messageEditButton;
 @FindBy(xpath = "//*[@id=\"c-message-message\"]") public WebElement messageEditMessageBox;
 @FindBy(xpath = "//*[@id=\"save-entity\"]") public WebElement messageEditSaveButton;
 @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]") public WebElement messageEditSaveOk;
 @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[31]/td[6]/div/a[3]") public WebElement messageDeleteButton;
 @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[31]/td[6]/div/a[3]") public WebElement messageDeleteOk;













































































 //US-028 (2711-2810)
 @FindBy(xpath = "//*[text()='Items&Titles']")
 public WebElement itemTitelsButton;


 @FindBy(xpath = "(//*[text()='Country'])[1]")
 public WebElement countryButton;

 @FindBy(xpath = "//*[text()='Create a new Country']")
 public WebElement createNewCountry;


 @FindBy(xpath = "//*[@id='country-name']")
 public WebElement nameTextBox;

 @FindBy(xpath = "//input[@name='createdDate']")
 public WebElement createdDateTextBox;

 @FindBy(xpath = "//*[text()='Save']")
 public WebElement countrySaveButton;

 @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
 public WebElement countryIsCreated;

 @FindBy(xpath = "(//*[@href=\"/country/350943\"])[1]")
 public WebElement countryName;

 @FindBy(xpath = "//*[@href=\"/country/350943/delete\"]")
 public WebElement samoliClick;

 @FindBy(xpath = "(//*[text()='Delete'])[1636]")
 public WebElement deleteClick;

 @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
 public WebElement basariliIleSilindi;


 @FindBy(xpath = "(//*[@href=\"/country/350944\"])[2]")
 public WebElement samoliBul;

 @FindBy(xpath = "//*[@href=\"/country/350944/delete\"]")
 public WebElement deleteButton;












































































































}
