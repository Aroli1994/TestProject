package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

//data table with Maps: for parameterization of test cases 

public class DealStepWithMapDefinition {

	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.crmpro.com/");
		//Thread.sleep(5000);
	}

	@When("^title of the login page$")
	public void title_of_the_login_page() {
		String title = driver.getTitle();
		System.out.println("Login page title is:" + title);
		String expectedTitile = "CRMPRO - CRM software for customer relationship management, sales, and support.";
		Assert.assertEquals(expectedTitile, title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			driver.findElement(By.name("username")).sendKeys(data.get("Username"));
			driver.findElement(By.name("password")).sendKeys(data.get("Password"));
		}
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		// loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginBtn);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home page title is: " + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		action.moveToElement(contact).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("^user enters deal details$")
	public void user_enters_contact_details(DataTable dealData) {
		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.id("title")).sendKeys(data.get("Title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("Amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("Probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("Commission"));
			String xpath_preceding_sibling = "//input[@type='submit' and @value='Save and Create Another']/preceding-sibling::input[@type='submit' and @value='Save']";
			driver.findElement(By.xpath(xpath_preceding_sibling)).click();
			
			//move to new deal page
			Actions action = new Actions(driver);
			WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
			action.moveToElement(contact).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
