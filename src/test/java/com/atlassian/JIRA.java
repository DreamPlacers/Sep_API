package com.atlassian;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class JIRA {
	
//	static SessionFilter session;
	public static void main(String[] args) {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		String token = "";
		
		String response = given().headers("Authorization",  "Bearer "+token).headers("content-type", "application/json").pathParam("petId", "123145").
		when().post("/pet/{petId}").
		then().assertThat().statusCode(200).body("id", equalTo(987654321)).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath json = new JsonPath(response);
		int id = json.get("id");
		System.out.println(id);
		Assert.assertEquals(id,987654321);
		int categoryId = json.get("category.id");
		Assert.assertEquals(categoryId,1234567890);
		String tagId = json.get("tags[0].name");
		Assert.assertEquals(tagId,"123456789");

		
				
	}
	

//	@Test(priority = 1)
//	public void authentication() {
//		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Sep_API\\src\\test\\resources\\Cred.property");
//		Properties prop = new Properties();
//		try {
//		FileInputStream file = new FileInputStream(f);
//		prop.load(file);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		Serialisation se = new Serialisation();
//		RestAssured.baseURI = "http://localhost:8080/";
//		session = new SessionFilter();
//		String username = prop.getProperty("username");
//		String password = prop.getProperty("password");
//		String response = given().headers("content-type","application/json").body("{ \"username\": \""+username+"\", \"password\": \""+password+"\" }").filter(session).
//		when().post("/rest/auth/1/session").
//		then().log().all().assertThat().statusCode(200).extract().response().asString();
//		JsonPath js = new JsonPath(response);
//		String sessionName  = js.get("session.name");
//		String sessionValue  = js.get("session.value");
//		se.setName(sessionName);
//		se.setValue(sessionValue);
//		
//	}
//	@Test(priority = 2)
//	public void createIssue() {
//		given().headers("content-type", "application/json").body("").filter(session).
//		when().post("rest/api/2/issue").
//		then().log().all().assertThat().statusCode(201);
//	}
}
