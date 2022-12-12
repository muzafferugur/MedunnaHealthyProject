package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.*;
import utilities.*;
import java.util.*;

import static org.testng.AssertJUnit.assertTrue;

public class US017_DB_StepDef {
    @Given("YE Admin connection kurar")
    public void admin_hercai_connection_kurar() {
        DatabaseUtility.createConnection();

    }

    List<Object> actualData;
    @Then("YE Admin kayitli kisileri olusturur {string} ve {string}")
    public void admin_hercai_kayitli_kisileri_olusturur_ve(String query, String columnName) {
        actualData=DatabaseUtility.getColumnData(query,columnName);

    }
    @Then("YE Admin bilgilerini dogrular")
    public void admin_hercai_bilgilerini_dogrular() {
        assertTrue(actualData.toString().contains("376845"));
        System.out.println(actualData);

    }
}
