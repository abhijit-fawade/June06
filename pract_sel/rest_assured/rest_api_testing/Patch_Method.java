package rest_api_testing;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Patch_Method {
	
	@Test
	public void PatchAPI() {
		
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		RequestSpecification https=RestAssured.given();
		
		JSONObject inputbody =new JSONObject();
		inputbody.put("name", "morphneus");
		inputbody.put("job", "leader"); 
		
		https.headers("Content-type","application/json");
		https.body(inputbody.toJSONString());
		
		Response response= https.request(Method.PATCH,"/users/2"); 
		
		String responseobject = response.getBody().asString();
		System.out.println("My response is : /n"+responseobject);
		
		int statuscode =response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		String statusline =response.getStatusLine();
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
		
		
		
		
	}


}
