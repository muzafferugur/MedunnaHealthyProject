package stepDefinitions.DB_StepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DatabaseUtility;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class US018_DB_StepDef {

    List<Object> actualData;
    //Integer expectedData = 362322;
    //String query = "select * from physician";
    @Given("AdminHus baglanti kurar")
    public void admin_hus_baglanti_kurar() {
        DatabaseUtility.createConnection();

    }
    @Then("AdminHus kayitli doktor bilgilerini getirir {string} ve {string}")
    public void adminhusKayitliDoktorBilgileriniGetirirVe(String query, String columnName) {
        actualData = DatabaseUtility.getColumnData(query, columnName );
        System.out.println(DatabaseUtility.getColumnNames(query));
        System.out.println(actualData);
    }

    @Then("AdminHus olusturdugu doktor bilgilerini dogrular")
    public void admin_hus_olusturdugu_doktor_bilgilerini_dogrular() {

        assertTrue(actualData.toString().contains("393825"));
    }
}









