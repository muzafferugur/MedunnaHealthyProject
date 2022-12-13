package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class US009_DB_StepDef {
    List<Object> actualData;
    @Given("SG Kullanici baglanti kurar")
    public void sg_kullanici_baglanti_kurar() {
        DatabaseUtility.createConnection();

    }

    @Then("SG Hasta bilgilerinin dogrulugunu {string} ve {string} kontrol eder")
    public void sg_hasta_bilgilerinin_dogrulugunu_ve_kontrol_eder(String query, String columnName) {
        actualData=DatabaseUtility.getColumnData(query, columnName);
        System.out.println(DatabaseUtility.getColumnNames(query));
        assertTrue("data match etmedi",actualData.toString().contains("309176"));

    }

}
