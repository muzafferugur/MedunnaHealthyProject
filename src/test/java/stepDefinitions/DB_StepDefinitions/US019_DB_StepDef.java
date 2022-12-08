package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.*;
import utilities.*;
import java.util.*;
import static org.testng.AssertJUnit.*;

public class US019_DB_StepDef {
    @Given("AdminHe connection kurar")
    public void adminheConnectionKurar() {
        DatabaseUtility.createConnection();
    }

    List<Object> actualData;

    @Then("AdminHe kayitli kisileri olusturur {string} ve {string}")
    public void adminheKayitliKisileriOlustururVe(String query02, String colunmName02) {
        actualData = DatabaseUtility.getColumnData(query02, colunmName02);
    }

    @And("AdminHe bilgilerini dogrular")
    public void adminheBilgileriniDogrular() {
        assertTrue(actualData.toString().contains("320148"));
    }
}

