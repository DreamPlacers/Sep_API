package io.swagger;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FrameWork {
	 
	static String tagName;
	@Test(priority = 1)
	public void getPetByStatus() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		given().log().all().headers("content/type", "application/json").queryParam("status", "available").
		when().get("/pet/findByStatus").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Test(priority = 2)
	public void getPetById() {
		given().log().all().headers("Content-Type", "application/json").pathParam("petId",101013).
		when().get("/pet/{petId}").
		then().log().all().assertThat().statusCode(200).body("id", equalTo(101012));
	}
	
	@Test(priority = 3)
	public void createNewPet() {
		given().log().all().header("Content-Type", "application/json").body("{\r\n"
				+ "  \"id\": 101015,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 12,\r\n"
				+ "    \"name\": \"Stray\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"Bee\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 1,\r\n"
				+ "      \"name\": \"Dog\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}\r\n"
				+ "").
		when().post("/pet").
		then().log().all().assertThat().statusCode(200);
	}
	
	@Test(priority = 4)
	public void updatePet() {
		given().log().all().header("content-type", "application/json").body("{\r\n"
				+ "  \"id\": 101013,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 12,\r\n"
				+ "    \"name\": \"Stray\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"Bee\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 1,\r\n"
				+ "      \"name\": \"Cat\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}\r\n"
				+ "").
		when().post("/pet").
		then().log().all().assertThat().statusCode(200);
	}

}
