package rest_api_testing;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Post_Method {

	// https://reqres.in/api/users/2

	/*	request body
	 * {
	 * 		"name":"morphneus"
	 * 		"job" :"leader"
	 *   }
	 */

		@Test
		public void PostAPI() {
			RestAssured.baseURI ="https://reqres.in/api/users";
			
			RequestSpecification https = RestAssured.given();
			
			JSONObject inputbody =new JSONObject();
			inputbody.put("name", "morphneus");
			inputbody.put("job", "leader");
			
			https.headers("Content-type","application/json");
			https.body(inputbody.toJSONString());
			
			Response response= https.request(Method.POST,"/users"); 
			
			String responseobject = response.getBody().asString();
			System.out.println("My response is : \n " +responseobject);
			
			int statuscode =response.getStatusCode();
			Assert.assertEquals(statuscode, 201);
			
			String statusline =response.getStatusLine();
			System.out.println("My status line is: \n"+statusline);
			

			
			
		}
}
