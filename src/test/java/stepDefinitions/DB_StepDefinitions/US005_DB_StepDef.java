package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.*;
import utilities.DatabaseUtility;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class US005_DB_StepDef {
    List<Object> actualData;
    @Given("kullanci baglanti kurar")
    public void kullanci_baglanti_kurar() {
        DatabaseUtility.createConnection();
    }
    @Given("Kullanici kayitli bilgileri ceker {string} ve {string}")
    public void kullanici_kayitli_bilgileri_ceker_ve(String query, String columnName) {
        actualData=DatabaseUtility.getColumnData(query, columnName);
        System.out.println(DatabaseUtility.getColumnNames(query));
        //System.out.println(actualData);
    }
    @Then("Kullanici bilgilerini dogrular")
    public void kullanici_bilgilerini_dogrular() {
        assertTrue("data match etmedi",actualData.toString().contains("348056"));
    }

}
