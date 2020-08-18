package co.setu.api.automation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import co.setu.api.automation.resources.ResourcesToCreateJiraTicket;
import co.setu.utils.Utilities;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class CreateJiraTicket extends Utilities {
	private String key;
	private String sheetName = "CreateJiraTicket";
	private static final Logger LOGGER = Logger.getLogger("HttpClientProgram.class");

	@Test(dataProvider = "PositiveData", priority = 1, invocationCount = 100, threadPoolSize = 100)
	public void createATicket(String summary, String description, String reporter, String priority) throws IOException {

		if (priority.equals("") || reporter.equals("")) {
			LOGGER.log(Level.INFO, "API does not appreciate NULL values in any of the fields");
		} else {
			RestAssured.baseURI = getGlobalValue("baseURI");			

			String res = given().auth().preemptive().basic(getGlobalValue("userName"), getGlobalValue("password"))
					.contentType(ContentType.JSON).body(ResourcesToCreateJiraTicket.setInputDataToCreateJiraAPI(summary,
							description, reporter, priority))
					.when().post(getGlobalValue("resources")).then().assertThat().statusCode(201)
					.body("key", containsString("TEST-"))
					.body("self", containsString(getGlobalValue("baseURI")))
					.extract().response().asString();

			JsonPath js = new JsonPath(res);
			//js.prettyPeek();
			key = js.get("key");
			
			int Id_fetched_from_post= Integer.parseInt(js.getString("id"));
			int Id_fetched_from_get= getIssueId(key);
			if(Id_fetched_from_post==Id_fetched_from_get) {
				LOGGER.log(Level.INFO, "The defect is raised in JIRA with id "+Id_fetched_from_post);
			}					

		}
	}

	@DataProvider(name = "PositiveData")
	public Iterator<Object[]> dataInput() throws IOException {
		ArrayList<Object[]> data;
		data = extractDataFromCreateJiraSheet(sheetName);
		return data.iterator();
	}

	public int getIssueId(String key) throws IOException {
		RestAssured.baseURI = getGlobalValue("baseURI");
		
		String res = given().auth().preemptive().basic(getGlobalValue("userName"), getGlobalValue("password"))
				.contentType(ContentType.JSON)
				.when().get(getGlobalValue("resources")+key).then()
				.extract().response().asString();
		JsonPath js = new JsonPath(res);
	
		return Integer.parseInt(js.get("id"));
				
	}}