package com.MirzaAwalEcommer.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionsRegn {
	static WebDriver driver;
	@Given("^The user enters the URL of the Mercury Tours$")
	public void the_user_enters_the_URL_of_the_Mercury_Tours() throws Throwable {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");    
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	}

	@Given("^The User navigates to the Registration page of Mercury Tours$")
	public void the_User_navigates_to_the_Registration_page_of_Mercury_Tours() throws Throwable {
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	String RegistrationPageActualTitle = driver.getTitle();
	String RegistrationPageExpectedTitle = ("Register: Mercury Tours");
	Assert.assertEquals(RegistrationPageExpectedTitle, RegistrationPageActualTitle);
//  System.out.println(RegistrationPageActualTitle);
	}

	@When("^The User enters the correct Contact Information, Mailing Information and User Information, and then click on Submit button$")
	public void the_User_enters_the_correct_Contact_Information_Mailing_Information_and_User_Information_and_then_click_on_Submit_button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Lokman");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hakim");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9545234211");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mirza4321@yahoo.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("3244 NW 16 St");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Tamarac");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Florida");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("33321");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tuvomir");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mirza3512");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("mirza3512");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}
	
	@Then("^The User successfully registers to Mercury Tours$")
	public void the_User_successfully_registers_to_Mercury_Tours() throws Throwable {
		String AfterRegistrationPageActualTitle = driver.getTitle();
		String AfterRegistrationPageExpectedTitle = ("Register: Mercury Tours");
		Assert.assertEquals(AfterRegistrationPageExpectedTitle, AfterRegistrationPageActualTitle);
  //	System.out.println(AfterRegistrationPageActualTitle);    
	}

}
