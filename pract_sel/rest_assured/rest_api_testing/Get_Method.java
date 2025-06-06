package rest_api_testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Get_Method {
	
	@Test
	public void getmethod() {
		
		// https://reqres.in/api/users/2
		
		RestAssured.baseURI ="https://reqres.in/api/users";
		
		RequestSpecification http=RestAssured.given();
		
		Response response = http.request(Method.GET,"/2");
		
		String responseObject= response.getBody().asString();
		System.out.println("My response is : \n" +responseObject);
		int statuscode =response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		String statusline =response.getStatusLine();
		System.out.println("My status line : \n" +statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
		
	}

}
