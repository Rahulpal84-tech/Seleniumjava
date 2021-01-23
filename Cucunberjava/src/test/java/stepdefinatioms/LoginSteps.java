package stepdefinatioms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("browseris open");
		System.setProperty("webdriver.chrome.driver","/home/rahul/Desktop");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
	}
	@And("is on login page")
	public void is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("user on 1");
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("name")).sendKeys("Raghav");
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(2000);


	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
		

	}

	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);

		driver.close();
		driver.quit();


		
	}


}
