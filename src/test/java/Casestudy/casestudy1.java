package Casestudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class casestudy1 {
	WebDriver driver;
	

	


	
	@Given("^Browser should be installed$")
	public void browser_should_be_installed() throws Throwable {
		
	  
	}
	@When("^user enters the URL$")
	public void user_enters_the_URL() throws Throwable {
		driver = Utility_Class.startBrowser( "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Then("^web application should open$")
	public void web_application_should_open() throws Throwable {
	   
	}
	@Given("^The web application should be open$")
	public void the_web_application_should_be_open() throws Throwable {
		  driver.findElement(By.partialLinkText("SignUp")).click();
	}
@When("^The user enters User Name \"([^\"]*)\"$")
	public void the_user_enters_User_Name(String arg1) throws Throwable {
		 driver.findElement(By.id("userName")).sendKeys(arg1); 
	}

	@When("^User enters valid First Name as \"([^\"]*)\"$")
	public void user_enters_valid_First_Name_as(String arg1) throws Throwable {
		 driver.findElement(By.id("firstName")).sendKeys(arg1);
	}

	@When("^Last Name as \"([^\"]*)\"$")
	public void last_Name_as(String arg1) throws Throwable {
		 driver.findElement(By.id("lastName")).sendKeys(arg1);
	}

	@When("^Password as \"([^\"]*)\"$")
	public void password_as(String arg1) throws Throwable {
		 driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@When("^Confirm Password as \"([^\"]*)\"$")
	public void confirm_Password_as(String arg1) throws Throwable {
		 driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}
	@When("^Gender as Female$")
	public void gender_as_Female() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
	@When("^E-Mail as \"([^\"]*)\"$")
	public void e_Mail_as(String arg1) throws Throwable {
		 driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^Mobile Number as \"([^\"]*)\"$")
	public void mobile_Number_as(String arg1) throws Throwable {
		 driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^DOB as \"([^\"]*)\"$")
	public void dob_as(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^Address as \"([^\"]*)\"$")
	public void address_as(String arg1) throws Throwable {
		  driver.findElement(By.name("address")).sendKeys(arg1);	
	}
	
	@When("^Security question as What is your Pet Name\\?$")
	public void security_question_as_What_is_your_Pet_Name() throws Throwable {
		 Select a=new Select(driver.findElement(By.id("securityQuestion")));
		  a.selectByIndex(2);
	}

	@When("^Answer \"([^\"]*)\"$")
	public void answer(String arg1) throws Throwable {
		 driver.findElement(By.id("answer")).sendKeys(arg1);
	}

	@Then("^Registered successfully$")
	public void registered_successfully() throws Throwable {
		 WebDriverWait wait= new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
	   driver.findElement(By.name("Submit")).click();
	  driver.close();
	}
	
	@Given("^the user must be registered$")
	public void the_user_must_be_registered() throws Throwable {
		//driver = Utility_Class.startBrowser( "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 WebDriverWait wait= new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("SignIn")));
	    driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("^the user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
	}
	   
	
	@Then("^Login to the home page$")
	public void login_to_the_home_page() throws Throwable {
		 WebDriverWait wait= new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.close();
	}
	@Given("^The user logins with his respective credentials$")
	public void the_user_logins_with_his_respective_credentials() throws Throwable {
		 WebDriverWait wait= new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("SignIn")));
		  driver.findElement(By.partialLinkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("Password123");
	    WebDriverWait wait1= new WebDriverWait(driver, 50);
		 wait1.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("^user types the required product$")
	public void user_types_the_required_product() throws Throwable {
		String a="head";
		driver.findElement(By.name("products")).sendKeys(a);
		// WebDriverWait wait= new WebDriverWait(driver, 50);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Headphone']")));
		//driver.findElement(By.xpath("//input[@value='Headphone']")).click();
		 //Select t=new Select(driver.findElement(By.xpath("//input[@value='Headphone']")));
		  //t.selectByVisibleText("Headphone");
	}

	@When("^clicks find details$")
	public void clicks_find_details() throws Throwable {
		 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	
	@Then("^the detais of the product should be displayed$")
	public void the_detais_of_the_product_should_be_displayed() throws Throwable {
	  /*if(driver.getCurrentUrl().equalsIgnoreCase("http://10.232.237.143:443/TestMeApp/findProduct.htm"))
	  {
		  System.out.println("pass");
	  }
	  else
		  System.out.println("fail");*/
		Assert.assertEquals(driver.getTitle(), "Search");
	}


	@Given("^the user should be registered in TestMe App$")
	public void the_user_should_be_registered_in_TestMe_App() throws Throwable {
		driver.findElement(By.partialLinkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).sendKeys("Password123");
	    WebDriverWait wait= new WebDriverWait(driver, 50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Login")));
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("^user searches for a product$")
	public void user_searches_for_a_product() throws Throwable {
		driver.findElement(By.name("products")).sendKeys("Headphone");
		 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

		@Then("^the cart option is not displayed$")
	public void the_cart_option_is_not_displayed() throws Throwable {
			System.out.println("testme app does not proceed to payment");
			 driver.findElement(By.partialLinkText("Cart")).click();
			 driver.findElement(By.partialLinkText("Checkout")).click();
	}


}
