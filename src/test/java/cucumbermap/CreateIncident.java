package cucumbermap;

import java.io.File;

import org.hamcrest.Matchers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateIncident 
{
  private Response response;
	
	
	@Given("setup endpoint")
	public void setup_endpoint() 
	{
	    
		RestAssured.baseURI="https://dev96180.service-now.com/api/now/table/incident";
	}

	@Given("setupn Authentication with valid credentials")
	public void setupn_Authentication_with_valid_credentials() 
	{
	    
		RestAssured.authentication=RestAssured.basic("admin", "4a^VWw%Ud7Ly");
	}

	@When("send the post request")
	public void send_the_post_request() 
	{
	   
		response = RestAssured
	            .given()
	            .contentType(ContentType.JSON)
	            .post();
		System.out.println(response.getStatusCode());
		response.prettyPrint();
	}

	@Then("verify the status code as 201")
	public void verify_the_status_code_as() 
	{
		
				
			response.then().assertThat().statusCode(201).extract().response();	
				
	    
	}


    @Then("verify response body")
	public void verify_response_body() 
	{
		
			response.then().assertThat().body("result.made_sla", Matchers.containsString("true")).extract().response();	
	
				
				
				
				
	    
	}


    /*@When("send the post request with (.*)")
    public void input(String fileName) 
    {
        File file = new File("./Data/"+fileName);
    	
    	response = RestAssured
	            .given()
	            .contentType(ContentType.JSON)
	            .body(fileName)
	            .post();
		System.out.println(response.getStatusCode());
		response.prettyPrint();
    }

   */


	
	
	
	
	
	
	
	
	
	
}
