package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.AppointmentPojo;

import pojos.PatientPojo;

import pojos.PhysicianPojo;
import pojos.UserPojo;
import utilities.*;

import static baseUrl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication2.generateToken;

public class US010Api_StepDef {
    static Response response;
    static AppointmentPojo actualData;
    static AppointmentPojo expectedData;
    static UserPojo user;
    static PatientPojo patient;
    static PhysicianPojo physician;
    static String token;
    @Given("US010_ Doktor Medunna Url i id ile  ayarlar")
    public void usDoktorMedunnaUrlIIdIleAyarlar() {
        String patientEndPoint = ConfigReader.getProperty("US10EndPoint");//
     token = Authentication2.generateToken();
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type`",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).spec(spec).when().get(patientEndPoint);
        response.prettyPrint();

    }



    @Then("US010_ Doctor GET request yapar ve  response alir")
    public void usDoctorGETRequestYaparVeResponseAlir() {
        user = new UserPojo("anonymousUser","2022-11-17T17:13:47.315549Z",307531,"hastack","hastack",
                "hastack","hastack@gmail.com",true,"en",null,null,"456-15-7598");

        patient= new PatientPojo("hastack","2022-11-17T17:16:16.704215Z",307383,"hastack",
                "hastack",null,"485-456-1236",null,null,null,"hastack@gmail.com",
                null,user,null,null,null);

        physician = new PhysicianPojo("batch81","2022-11-17T20:43:48.080497Z",306338,"doktor kayaa",
                "kaya","1992-11-16T22:00:00Z","7596832569","MALE","Apositive","",
                "",user,"ALLERGY_IMMUNOLOGY",null,null,500.00,"","");

        expectedData= new AppointmentPojo("hastack","2022-12-07T09:08:23.448331Z",381002,
                "2022-12-15T00:00:00Z","2022-12-15T01:00:00Z","PENDING",null,
                null,null,null,null,physician,patient,null);

    }

    @And("US010_ Doctor json datayi deserialize  yaparak javaya dondurur")
    public void usDoctorJsonDatayiDeserializeYaparakJavayaDondurur() {

        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), AppointmentPojo.class);
    }

    @And("US010_ Doctor randevulari api  ile dogrular")
    public void usDoctorRandevulariApiIleDogrular() {
        assertEquals(200,response.getStatusCode());
     //   assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
     //   assertEquals(user.getFirstName(),actualData.getPatient().getUser().getFirstName( ));
     //   assertEquals(expectedData.getStartDate(),actualData.getStartDate());
    }
}
