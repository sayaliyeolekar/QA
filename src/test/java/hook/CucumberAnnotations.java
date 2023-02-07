package hook;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;

public class CucumberAnnotations 
{
    @Before
	public void before()
	{
    	RestAssured.baseURI="https://dev96180.service-now.com/api/now/table/incident";
    	
    	RestAssured.authentication=RestAssured.basic("admin", "4a^VWw%Ud7Ly");
		
	}
	
    
	
    @After
	public void After(Scenario sc)
	{
    	System.out.println(sc.getName()+"............"+sc.getStatus());
		
	}
}
