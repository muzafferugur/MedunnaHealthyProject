package stepDefinitions.API_StepDefinitions;

import com.google.gson.Gson;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.PostRegister;
import pojos.TestItemsPojo;
import utilities.Object_Mapper;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;
import static utilities.Authentication.generateToken;

public class US001_Api_StepDef {
    Response response;
    PostRegister expectedData;
    PostRegister actualData;
    @Given("Kullanici Post islemi yaparak user olustur")
    public void kullanici_post_islemi_yaparak_user_olustur() {
        String endPoint="https://medunna.com/api/register";
       // expectedData=new PostRegister("iay6@hotmail.com","ibrayd6","ayd6","921606","2255049aA+","333-22-8406");
        expectedData=new PostRegister("iay15@hotmail.com","ibrayd15","ayd15","921615","2255049aA+","333-22-8415");
        response= given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).when().body(expectedData).post(endPoint);
        response.prettyPrint();
        actualData = Object_Mapper.convertJsonToJava(response.asString(),PostRegister.class);
        //actualData=response.as(PostRegister.class);
    }
    @When("Kullanici Status kodun {int}  oldugunu dogrular")
    public void kullanici_status_kodun_oldugunu_dogrular(int statusCode) {
        //assertEquals(statusCode,response.getStatusCode());
    }
    @Then("Kullanici olusturdugu user dogrular")
    public void kullanici_olusturdugu_user_dogrular() {
        expectedData=new PostRegister("iay15@hotmail.com","ibrayd15","ayd15","921615","2255049aA+","333-22-8415");
        System.out.println("expectedData = " + expectedData);

        System.out.println("actualData = " + actualData);

       assertEquals(expectedData.getEmail(),actualData.getEmail());
       assertEquals(expectedData.getFirstName(),actualData.getFirstName());
       assertEquals(expectedData.getLastName(),actualData.getLastName());
       assertEquals(expectedData.getLogin(),actualData.getLogin());
       //assertEquals(expectedData.getPassword(),actualData.getPassword());
       assertEquals(expectedData.getSsn(),actualData.getSsn());

       //Gson gson = new Gson();

       //PostRegister actualData = gson.fromJson(response.asString(), PostRegister.class);
       //assertEquals(expectedData.getEmail(),actualData.getEmail());
       //assertEquals(expectedData.getFirstName(),actualData.getFirstName());
       //assertEquals(expectedData.getLastName(),actualData.getLastName());
       //assertEquals(expectedData.getLogin(),actualData.getLogin());
       //assertEquals(expectedData.getPassword(),actualData.getPassword());
       //assertEquals(expectedData.getSsn(),actualData.getSsn());
       //System.out.println("actualData = " + actualData);

    }
}
