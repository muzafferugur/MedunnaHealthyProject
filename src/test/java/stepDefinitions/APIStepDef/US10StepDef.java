package stepDefinitions.APIStepDef;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.AppointmentPojo;
import pojos.PatientPojo;
import pojos.PhysicianPojo;
import pojos.UserPojo;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US10StepDef {
    static Response response;
    static AppointmentPojo actualData;
    static AppointmentPojo expectedData;
    static UserPojo user;
    static PatientPojo patient;
    static PhysicianPojo physician;
    static String token;
    @Given("US010 Doktor Medunna Url i id ile  ayarlar")
    public void us010doktormedunnaurliidileayarlar() {
        String patientEndPoint = ConfigReader.getProperty("US10EndPoint");
        token = Authentication.generateToken();
        response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type`",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(patientEndPoint);
        response.prettyPrint();

    }

    @Then("US010 Doctor GET request yapar ve  response alir")
    public void us010_doctor_get_request_yapar_ve_response_alir() {
        user=new UserPojo("anonymousUser","2022-11-17T17:13:47.315549Z",307531,"doktorkbr","doktor","kaya",
                "drky@gmail.com",true,"en",null,null,"456-15-7598");

        patient=new PatientPojo("hastack","2022-11-17T17:16:16.704215Z",307383,"hastack","hastack",null,
                "485-456-1236",null,null,null,"hastack@gmail.com",null,user,null,null,null);

        physician=new PhysicianPojo("batch81","2022-11-17T20:17:54.049152Z",306333,"doktor ","kaya",
                "1991-11-16T22:00:00Z","4523698567","MALE","Apositive","","",user,"NUCLEAR_MEDICINE", null,null,500.00,"",null );

        expectedData= new AppointmentPojo("hastack","2022-11-28T10:14:07.244689Z",351360,"2022-11-29T00:00:00Z",
                "2022-11-29T01:00:00Z","PENDING",null,null,null,null,null,physician,patient,null);

    }

    @Then("US010 Doctor json datayi deserialize  yaparak javaya dondurur")
    public void us010_doctor_json_datayi_deserialize_yaparak_javaya_dondurur() {

        actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), AppointmentPojo.class);

    }

    @Then("US010 Doctor randevulari api  ile dogrular")
    public void us010_doctor_randevulari_api_ile_dogrular() {
        assertEquals(200,response.getStatusCode());
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getCreatedDate(),actualData.getCreatedDate());
        assertEquals(user.getLastName(),actualData.getPatient().getUser().getLastName( ));

    }
}