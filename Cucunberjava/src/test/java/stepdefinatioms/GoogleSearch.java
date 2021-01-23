package stepdefinatioms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {
	WebDriver driver=null;


	@Given("browseris open")
	public void browseris_open() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("browseris open");
		System.setProperty("webdriver.chrome.driver","/home/rahul/Desktop");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(200);
		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("hits enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(200);


		
		
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("user is navigated to search result");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	
	}

		
	}



