package stepDefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginsteps {
WebDriver driver=new FirefoxDriver();
Properties prop = new Properties();

	@Given("^user launches the application$")
	public void user_launches_the_application() throws Throwable {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@When("^user selects LogIn button$")
	public void user_selects_LogIn_button() throws Throwable {
		if(driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).isDisplayed()) {
			System.out.println("element is visible");

		}
		else {
			System.out.println("element is not visible");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}
	@Then("^Login page should be displayed$")
	public void login_page_should_be_displayed() {
		String actualTitle="Login - My Store";
		if(driver.getTitle()==actualTitle) {
			System.out.println("Actua title is present");
		}
		else {
			System.out.println("title is not present");
		}
	}
	
	@When("^user fills valid email id and pwassword$")
	public void user_fills_valid_email_and_pwd() {
		driver.findElement(By.id("email")).sendKeys("test654@test.com");
		driver.findElement(By.id("passwd")).sendKeys("admin123#");
		
	}
	@When("^user selects SIgn in button$")
	public void user_select_signIn_button() {
	driver.findElement(By.id("SubmitLogin")).click();;
	}
	
	
	@Then("^HomePage should be displayed$")
	public void home_page_should_be_displayed() {
		String actualTitle="My account - My Store";
		if(driver.getTitle()==actualTitle) {
			System.out.println("Actua title is present");
		}
		else {
			System.out.println("title is not present");
		}
	}
	}

