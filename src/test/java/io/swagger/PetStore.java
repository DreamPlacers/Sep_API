package io.swagger;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.*;

public class PetStore {
	
	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:8080";
//		given - headers and parameters
//		when - http method and end point
//		then - status code
//		given().log().all().headers("content/type", "application/json").queryParam("status", "available").
//		when().get("/pet/findByStatus").
//		then().log().all().assertThat().statusCode(200);
		
//		given().log().all().header("content/type", "application/json").body("{\r\n"
//				+ "  \"id\": 101012,\r\n"
//				+ "  \"category\": {\r\n"
//				+ "    \"id\": 12,\r\n"
//				+ "    \"name\": \"Stray\"\r\n"
//				+ "  },\r\n"
//				+ "  \"name\": \"Bee\",\r\n"
//				+ "  \"photoUrls\": [\r\n"
//				+ "    \"string\"\r\n"
//				+ "  ],\r\n"
//				+ "  \"tags\": [\r\n"
//				+ "    {\r\n"
//				+ "      \"id\": 1,\r\n"
//				+ "      \"name\": \"Dog\"\r\n"
//				+ "    }\r\n"
//				+ "  ],\r\n"
//				+ "  \"status\": \"available\"\r\n"
//				+ "}\r\n"
//				+ "").
//		when().post("/pet").
//		then().log().all().assertThat().statusCode(200);
		
		given().log().all().headers("Content-Type", "application/json").body("{\r\n"
				+ "    \"id\": 101010,\r\n"
				+ "    \"category\": {\r\n"
				+ "        \"id\": 12,\r\n"
				+ "        \"name\": \"Stray\"\r\n"
				+ "    },\r\n"
				+ "    \"name\": \"Hive\",\r\n"
				+ "    \"photoUrls\": [\r\n"
				+ "        \"string\"\r\n"
				+ "    ],\r\n"
				+ "    \"tags\": [\r\n"
				+ "        {\r\n"
				+ "            \"id\": 1,\r\n"
				+ "            \"name\": \"Cat\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"status\": \"available\"\r\n"
				+ "}").
		when().put("/pet").
		then().log().all().assertThat().statusCode(200);
		
		given().log().all().headers("Content-Type", "application/json").pathParam("petId",101010).
		when().get("/pet/{petId}").
		then().log().all().assertThat().statusCode(200);
		
	}

}
