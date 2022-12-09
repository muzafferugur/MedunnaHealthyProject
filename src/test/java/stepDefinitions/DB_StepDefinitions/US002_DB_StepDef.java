package stepDefinitions.DB_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.closeConnection;
import static utilities.DatabaseUtility.createConnection;

public class US002_DB_StepDef {
    Map<String,Object> actualMap;
    @Given("bo user connects to the database")
    public void boUserConnectsToTheDatabase() {
        createConnection();
    }
    @Then("bo user gets user data from db")
    public void boUserGetsUserDataFromDb() {
        String query = "select * from public.jhi_user where email='asdf1234567@gmail.com'";
        actualMap =new HashMap<>(DatabaseUtility.getRowMap(query));
        System.out.println("actualMap = " + actualMap);
    }
    @And("bo user validates user using {string} with db")
    public void boUserValidatesUserUsingWithDb(String email) {
        Map<String,Object> expectedMap = new HashMap<>();
        email="asdf1234567@gmail.com";
        expectedMap.put("email",email);
        assertEquals(expectedMap.get("email"),actualMap.get("email"));
    }

    @Then("bo user closes to database connection")
    public void boUserClosesToDatabaseConnection() {
        closeConnection();
    }

}



