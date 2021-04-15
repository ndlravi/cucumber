package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class steps {
WebDriver driver;
	
	@Given("^Open chrome and go to home page of the applicaiton$")
	public void open_chrome_and_go_to_home_page_of_the_applicaiton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVINedarapalle\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	    
	}
	
	
	@When("^Enter Name$")
public void enter_Name()   {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
}

@When("^Enter Passeord$")
public void enter_Passeord()  {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
}

@When("^Click on Submit button$")
public void click_on_Submit_button()  {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("btnLogin")).click(); 
}

@Then("^Login should be Successfully$")
public void login_should_be_Successfully()  {
    // Write code here that turns the phrase above into concrete actions
    String name = driver.findElement(By.id("welcome")).getText();
    String Actualdata = "Welcome Dillep";
    Assert.assertEquals(name, Actualdata);
    System.out.println("Login Successfully");
}
}