package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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



































































































//US-006 (511-610)



































































































//US-007 (611-710)



































































































//US-008 (711-810)



































































































//US-009 (811-910)



































































































//US-010 (911-1010)



































































































//US-011 (1011-1110)



































































































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
