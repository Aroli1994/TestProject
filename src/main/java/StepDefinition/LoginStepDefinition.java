//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//	WebDriver driver;
//
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() throws InterruptedException {
//		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		
//		driver.get("https://www.crmpro.com/");
//		Thread.sleep(5000);
//	}
//
//	@When("^title of the login page$")
//	public void title_of_the_login_page() {
//		String title = driver.getTitle();
//		System.out.println("Login page title is:" + title);
//		String expectedTitile="CRMPRO - CRM software for customer relationship management, sales, and support.";
//		Assert.assertEquals(expectedTitile, title);
//	}
//
//	//Regular Expressions:-   \"([^\"]*)\"	or   \"(.*)\"
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String uname, String pwd) {
//		driver.findElement(By.name("username")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
//		//loginBtn.click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", loginBtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		String title=driver.getTitle();
//		System.out.println("Home page title is: "+title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page(){
//		driver.switchTo().frame("mainpanel");
//		Actions action=new Actions(driver);
//		WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
//		action.moveToElement(contact).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}
//
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contact_details(String firstname, String lastname, String position) {
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		String xpath_preceding_sibling="//input[@type='submit' and @value='Save and Create Another (same company)']/preceding-sibling::input[@type='submit' and @value='Save']";
//		driver.findElement(By.xpath(xpath_preceding_sibling)).click();
//	}
//	
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//
//}
