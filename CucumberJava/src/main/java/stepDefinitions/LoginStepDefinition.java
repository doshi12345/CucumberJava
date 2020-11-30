//package stepDefinitions;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//import org.junit.Test;
//
//import static org.testng.Assert.assertEquals;
//
//public class LoginStepDefinition{
//
//	 WebDriver driver;
//
//	
//	 @Given("^user is already on Login Page$")
//	 public void user_already_on_login_page(){
//		     //Open the Broser and Enter URL to reach Login page
//			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratik\\Desktop\\Selenium\\chromedriver.exe");	
//			 driver = new ChromeDriver();
//			 driver.get("https://ui.freecrm.com/");
//			 driver.manage().window().maximize();
//			 driver.manage().deleteAllCookies();
//	 }
//	
//	
//	 @When("^title of login page is Free CRM$")
//	 public void title_of_login_page_is_free_CRM(){
//	 String title = driver.getTitle();
//	 System.out.println(title);
//	 assertEquals("Cogmento CRM", title);
//	// Assert.assertEquals("Cogmento CRM", title);
//	 }
//	
//	 
//	//Hard Coded value entered method
//	 @Then("^user enters username and password$")
//	 public void user_enters_username_and_password(){
//		    driver.findElement(By.name("email")).sendKeys("piano4060@gmail.com");
//			driver.findElement(By.name("password")).sendKeys("Test@12345");
//	 }
//	 
//	
//	 //For Data Driven Apprach for both Without keyword and With keyword, same method below will be used for both
//	//Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
// 
// 	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
// 	 public void user_enters_username_and_password(String username, String password){
// 	 driver.findElement(By.name("email")).sendKeys(username);
// 	 driver.findElement(By.name("password")).sendKeys(password);
// 	 }
//	
// 	 
// 	 
// 	 
//	 @Then("^user clicks on login button$")
//	 public void user_clicks_on_Login_button() {
//		 driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
////		 WebElement loginBtn = driver.findElement(By.xpath("//div[contains(text(), 'Login')]"));
////		 JavascriptExecutor js = (JavascriptExecutor)driver;
////		 js.executeScript("arguments[0].click();", loginBtn);
//	 }
//	
//	
//	 @Then("^user is on home page$")
//	 public void user_is_on_hopme_page(){
//	 String title = driver.getTitle();
//	 System.out.println("Home Page title ::"+ title);
//	 assertEquals("Cogmento CRM", title);
//	 
//	 }
//	 
//
//	 
//		@Given("^user clicks on Contacts link$")
//		public void user_clicks_on_Contacts_link() throws InterruptedException {
//			
//			Thread.sleep(2000);
//			 //driver.switchTo().frame(2);
//			
////			 WebElement loginBtn = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
////			 JavascriptExecutor js = (JavascriptExecutor)driver;
////			 js.executeScript("arguments[0].click();", loginBtn);
//			driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//		}
//
//		@Then("^user clicks on New Contact button$")
//		public void user_clicks_on_New_Contact_button() throws InterruptedException  {
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
//			Thread.sleep(2000);
//		}
//
//		//Hard Coded value entered method
//		@Then("^user enters firstname and lastname$")
//		public void user_enters_firstname_and_lastname() throws InterruptedException  {
//			driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys("Hardik");
//			driver.findElement(By.xpath("//input[@name = 'last_name']")).sendKeys("Doshi");
//			Thread.sleep(2000);
//		}
//
//		@Then("^user clicks on Save button$")
//		public void user_clicks_on_Save_button()  {
//			driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//		}
//		
//		
//		//Hard coded value entered method
//		@Then("^verify if contact added$")
//		public void verify_if_contact_added() throws InterruptedException  {
//			Thread.sleep(2000);
//			boolean b = driver.findElement(By.xpath("//div[text() = 'Hardik Doshi']")).isDisplayed();
//			assertEquals(b, true);
//		}
//			
//		@Then("^Close the browser$")
//			 public void close_the_browser(){
//				 driver.quit();
//		}
//		
//		@Then("^user enters new contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//		 public void user_enters_firstname_lastname_position(String firstname, String lastname, String position) throws InterruptedException{
//			driver.findElement(By.xpath("//input[@name = 'first_name']")).sendKeys(firstname);
//			driver.findElement(By.xpath("//input[@name = 'last_name']")).sendKeys(lastname);
//			driver.findElement(By.xpath("//input[@name = 'position']")).sendKeys(position);
//			Thread.sleep(2000);
//		 }
//		
//		@Then ("^verify if \"(.*)\" added$")
//		public void verify_if_contact_added(String contactname) throws InterruptedException  {
//			Thread.sleep(2000);
//			boolean b = driver.findElement(By.xpath("//div[text() = '"+contactname+"']")).isDisplayed();
//			assertEquals(b, true);
//		}
//	
//	 
////	 @Then("^user moves to Contacts page$")
////	 public void user_moves_to_new_contact_page() {
////		//driver.switchTo().frame("mainpanel");
////		Actions action = new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
////		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
////		
////		}
//
//
//	
//	
//		
//
//}
