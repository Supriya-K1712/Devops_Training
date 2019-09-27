package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefs {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Downloads\\deeee\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    }

	@When("user provides the correct credentials")
	public void user_provides_the_correct_credentials() {
		driver.findElement(By.name("userName")).sendKeys("Lalitha"); 
		driver.findElement(By.name("password")).sendKeys("Password123"); 
	}

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
		driver.findElement(By.name("Login")).click();
		String title=driver.getTitle();
		Assert.assertEquals("Home",title );
		driver.close();
	   
	}
}
