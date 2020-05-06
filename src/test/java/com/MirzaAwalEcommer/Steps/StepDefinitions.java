package com.MirzaAwalEcommer.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions{
	static WebDriver driver;
	@Given("^User enters the URL of the Mercury tours of the application$")
	public void user_enters_the_URL_of_the_Mercury_tours_of_the_application() throws Throwable{
	System.setProperty("webdriver.gecko.driver", ".//src//test//resources//Drivers//geckodriver.exe");    
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	}	


	@Given("^User navigates to the login page$")
	public void user_navigates_to_the_login_page() throws Throwable {
		String loginPageActualTitle= driver.getTitle();
		String loginPageExpectedTitle= ("Welcome: Mercury Tours");
		Assert.assertEquals(loginPageActualTitle, loginPageExpectedTitle);
		System.out.println(loginPageActualTitle);
		
	}

	@When("^User enter the valid UserName and valid password and then clicks on login button$")
	public void user_enter_the_valid_UserName_and_valid_password_and_then_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mirza3512");    
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shuvomir");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
	}

	@Then("^user successfully login into the application$")
	public void user_successfully_login_into_the_application() throws Throwable {
		String afterloginPageActualTitle= driver.getTitle();
		String afterloginPageExpectedTitle= "Find a Flight: Mercury Tours:";
		Assert.assertEquals(afterloginPageActualTitle, afterloginPageExpectedTitle);
	  System.out.println(afterloginPageActualTitle);
	 // System.out.printlafterloginPageExpectedTitlen("Successfully login into the Application");
		
	}
	
}
