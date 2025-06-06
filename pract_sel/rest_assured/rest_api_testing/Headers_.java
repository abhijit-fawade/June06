package rest_api_testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Headers_ {

	
	@Test
	public void HeadersValidation() {
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		RequestSpecification https=RestAssured.given();
		
		Response response= https.request(Method.PATCH,"/users/2"); 
		
		String responseobject = response.getBody().asString();
		System.out.println("My response is : /n"+responseobject);
		
		Headers values=response.headers();
		
		for(Header value:values) {
			System.out.println("Key is  :  "+value.getName()+"\t\t\t"+value.getValue());
		}
	}
}
