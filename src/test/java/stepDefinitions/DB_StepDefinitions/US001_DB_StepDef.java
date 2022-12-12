package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class US001_DB_StepDef {
    List<Object> actualData;
    @Given("kullanci connection kurar")
    public void kullanci_connection_kurar() {
        DatabaseUtility.createConnection();
        //createConnection(ConfigReader.getProperty("database_url"), ConfigReader.getProperty("database_username"), ConfigReader.getProperty("database_password"));

    }
    @Given("Kullanici tum yeni kayitli bilgileri ceker {string} ve {string}")
    public void kullanici_tum_yeni_kayitli_bilgileri_ceker_ve(String query, String columnName) {
        actualData=DatabaseUtility.getColumnData(query, columnName);

    }
    @Then("Kullanici kullanici bilgilerini dogrular")
    public void kullanici_kullanici_bilgilerini_dogrular() {
        assertTrue("data match etmedi",actualData.contains("513-13-3652"));

    }


}
