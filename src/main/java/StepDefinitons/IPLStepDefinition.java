package StepDefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IPLStepDefinition {

	public WebDriver driver;
	
	@Given("^User open the browser$")
	public void user_open_the_browser() throws Exception {
	    
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}

	@When("^User is on homepage$")
	public void user_is_on_homepage() throws Exception {
	 
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(3000);	
		System.out.println("The title is ========>" +driver.getTitle());
		System.out.println("The URL is   ========>" +driver.getCurrentUrl());
	}

	@Then("^User clicks on IPL link$")
	public void user_clicks_on_IPL_link() throws Exception {
	 
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Series"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Indian Premier League 2019"))).click().perform();
		System.out.println("The title is ============> " +driver.getTitle());
		System.out.println("The URL is   ============> " +driver.getCurrentUrl());

	}

	@Then("^User clicks points table$")
	public void user_clicks_points_table() throws Exception {
		
		driver.findElement(By.xpath("//a[@title='Points Table']")).click();
		Thread.sleep(2000);
		System.out.println("The title is ============> " +driver.getTitle());
		System.out.println("The URL is   ============> " +driver.getCurrentUrl());
	}

	@Then("^User User clicks a team$")
	public void user_User_clicks_a_team() throws Exception {
		
		WebElement rr=driver.findElement(By.xpath("//a[contains(text(),'Rajasthan Royals')]"));
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", rr);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Royal Challengers Bangalore")).click();
		System.out.println("The title is ============> " +driver.getTitle());
		System.out.println("The URL is   ============> " +driver.getCurrentUrl());
		Thread.sleep(2000);
	    
	}

	@Then("^click on logo and navigate to homepage$")
	public void click_on_logo_and_navigate_to_homepage() throws Exception {
		
		driver.findElement(By.xpath("//img[@title='Cricbuzz Logo']")).click();
		System.out.println("The title is ============> " +driver.getTitle());
		System.out.println("The URL is   ============> " +driver.getCurrentUrl());
		Thread.sleep(2000);
	    
	}
	
	@Then("^User close the browser$")
	public void user_close_the_browser() throws Exception {
	    
		driver.quit();
	}


	
	
}

	
	