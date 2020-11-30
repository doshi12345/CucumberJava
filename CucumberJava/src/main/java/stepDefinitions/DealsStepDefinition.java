package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepDefinition {
	
	WebDriver driver;
	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
		     //Open the Broser and Enter URL to reach Login page
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratik\\Desktop\\Selenium\\chromedriver.exe");	
			 driver = new ChromeDriver();
			 driver.get("https://ui.freecrm.com/");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
	 }
	
	
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 assertEquals("Cogmento CRM", title);
	// Assert.assertEquals("Cogmento CRM", title);
	 }
	
	 //DataTable method
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials){
		List<List<String>> data = credentials.raw();
		 driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	 }
	 
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_Login_button() {
		 driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
//		 WebElement loginBtn = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", loginBtn);
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 assertEquals("Cogmento CRM", title);
	 
	 }
	 
	
	@Then("^user moves to new deal page$")
	 public void user_moves_to_new_deal_page() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		Thread.sleep(1000);
		
		
		}
	
	 //DataTable method	 
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
	 }
	 
	 @Then("^user clicks on Save button$")
		public void user_clicks_on_Save_button()  {
			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		}
	 
	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
}

}
