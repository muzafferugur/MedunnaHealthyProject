package stepDefinitions.DB_StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pojos.AppointmentPojo;
import pojos.PatientPojo;
import pojos.PhysicianPojo;
import pojos.UserPojo;

import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getRowMap;

public class US010_DB_StepDef {
    Map<String, Object> randevuBilgi;
    String query = "Select * from appointment where id = 302324";
    static AppointmentPojo expectedData;
    static UserPojo user;
    static PatientPojo patient;
    static PhysicianPojo physician;
    @Given("US010 Kullanici connection kurar")
    public void us010_kullanici_connection_kurar() {

         createConnection();
    }

    private void createConnection() {
    }

    @Given("US010 Kullanici hasta bilgilerini ceker")
    public void us010_kullanici_hasta_bilgilerini_ceker() {
        randevuBilgi = getRowMap(query);

        System.out.println("randevuBilgileri = " + randevuBilgi);

    }
    @Then("US010 Kullanici hasta bilgilerini dogrular")
    public void us010_kullanici_hasta_bilgilerini_dogrular() {
        user=new UserPojo("anonymousUser","2022-11-17T17:13:47.315549Z",307531,"doktorkbr","doktor","kaya",
                "drky@gmail.com",true,"en",null,null,"456-15-7598");

        patient=new PatientPojo("hastack","2022-11-17T17:16:16.704215Z",300396,"hastack","hastack",null,
                "485-456-1236",null,null,null,"hastack@gmail.com",null,user,null,null,null);

        physician=new PhysicianPojo("batch81","2022-11-17T20:17:54.049152Z",306333,"doktor ","kaya",
                "1991-11-16T22:00:00Z","4523698567","MALE","Apositive","","",user,"NUCLEAR_MEDICINE", null,null,500.00,"",null );

        expectedData= new AppointmentPojo("hastack","2022-11-28T10:14:07.244689Z",351360,"2022-11-29T00:00:00Z",
                "2022-11-29T01:00:00Z","COMPLETED",null,null,null,null,null,physician,patient,null);

        String actualPatientIDString = randevuBilgi.get("patient_id").toString();
        int actualPatientId= Integer.valueOf(actualPatientIDString);
        System.out.println("actualPatientID = " + actualPatientIDString);
        String actualStatus = randevuBilgi.get("status").toString();
        System.out.println("actualStatus = " + actualStatus);

        assertEquals(patient.getId(),actualPatientId);
        assertEquals(expectedData.getStatus(),actualStatus);


    }

    }


