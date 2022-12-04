package stepDefinitions.DB_StepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class US010_DBStepDef {
    String query="select * from public.appointment where id = 351360";
    List<Object> appointmentList;
    @Given("Dr. DataBase ile baglanti kurar")
    public void dr_data_base_ile_baglanti_kurar() {
       DatabaseUtility.createConnection();

    }
    @Given("Dr. tablodan appointment datalarini alir")
    public void dr_tablodan_appointment_datalarini_alir() {

        System.out.println(DatabaseUtility.getColumnNames(query)+ "\n");
    }
    @Then("Dr. appointment datalarindan  {string} ve {string} olanlari alir")
    public void drAppointmentDatalarindanVeOlanlariAlir(String query, String columnName) {


        appointmentList= getColumnData(query,columnName);
        System.out.println(appointmentList);

    }
    @Then("Dr database ile randevu bilgilerinin dogrulamasini yapar")
    public void dr_database_ile_randevu_bilgilerinin_dogrulamasini_yapar() {

        Assert.assertTrue(appointmentList.toString().contains("351360"));




    }



    @Then("Dr database baglantisini kapatir")
    public void dr_database_baglantisini_kapatir() {
        DatabaseUtility.closeConnection();

    }



}
