package rest_api_testing;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


public class ResponseBodyClass {
	
	@Test
	public void deser() {
	
		Response response=given().baseUri("http://64.227.160.186:8080").header("Content-Type","application/json").body("{\"username\":\"amazon\",\"password\": \"Amazon1@\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
