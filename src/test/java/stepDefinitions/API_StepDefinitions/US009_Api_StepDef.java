package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.US_009DataPojo;
import pojos.US_009UserPojo;
import utilities.Object_Mapper;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US009_Api_StepDef {
    Response response;

    @Given("SG Kullanici {int} id numarali hastanin tum bilgilerine GET request gonderir")
    public void kullanici_id_numarali_hastanin_tum_bilgilerine_get_request_gonderir(int id) {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/patients/309176");
        response.prettyPrint();
    }

    @Then("SG Kullanici status kodunun {int} oldugunu gorur")
    public void kullanici_status_kodunun_oldugunu_gorur(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.statusCode());
    }

    @Then("SG Kullanici bilgilerin dogrulandigini kontrol eder")
    public void kullanici_bilgilerin_dogrulandigini_kontrol_eder() {
        US_009UserPojo expUser = new US_009UserPojo("anonymousUser", "2022-11-18T12:20:34.071897Z", 309760, "hastasamet", "Hasta", "Samet", "hastasamet@gmail.com", true, "en", null, null, "145-58-5806");
        US_009DataPojo expData = new US_009DataPojo("hastasamet", "2022-11-18T13:56:32.512131Z", 309176, "Hasta", "Samet", null, "4874984964", null, null, null, "hastasamet@gmail.com", null, expUser, null, null, null, null);

        US_009DataPojo actualData = Object_Mapper.convertJsonToJava(response.asString(), US_009DataPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(expData.getCreatedBy(), actualData.getCreatedBy());
        assertEquals(expData.getCreatedDate(), actualData.getCreatedDate());
        assertEquals(expData.getId(), actualData.getId());
        assertEquals(expData.getLastName(), actualData.getLastName());
        assertEquals(expData.getBirthDate(), actualData.getBirthDate());
        assertEquals(expData.getPhone(), actualData.getPhone());
        assertEquals(expData.getGender(), actualData.getGender());
        assertEquals(expData.getBloodGroup(), actualData.getBloodGroup());
        assertEquals(expData.getAdress(), actualData.getAdress());
        assertEquals(expData.getEmail(), actualData.getEmail());
        assertEquals(expData.getDescription(), actualData.getDescription());
        assertEquals(expUser.getCreatedBy(), actualData.getUser().getCreatedBy());
        assertEquals(expUser.getCreatedDate(), actualData.getUser().getCreatedDate());
        assertEquals(expUser.getId(), actualData.getUser().getId());
        assertEquals(expUser.getLogin(), actualData.getUser().getLogin());
        assertEquals(expUser.getFirstName(), actualData.getUser().getFirstName());
        assertEquals(expUser.getLastName(), actualData.getUser().getLastName());
        assertEquals(expUser.getEmail(), actualData.getUser().getEmail());
        assertEquals(expUser.getActivated(), actualData.getUser().getActivated());
        assertEquals(expUser.getLangKey(), actualData.getUser().getLangKey());
        assertEquals(expUser.getImageUrl(), actualData.getUser().getImageUrl());
        assertEquals(expUser.getResetDate(), actualData.getUser().getResetDate());
        assertEquals(expUser.getSsn(), actualData.getUser().getSsn());

    }

}
