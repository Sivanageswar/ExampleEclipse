package sauceDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	
	WebDriver driver;
	
  @Test(dataProvider = "loginData")
  public void verifyLogin(String username, String password) throws Exception 
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }

  @AfterMethod
  public void afterMethod() throws Exception 
  {
	 Thread.sleep(3000);
	  driver.quit();
  }
  
  
  @DataProvider
  public Object[][] loginData() {
	  Object [][] data = new Object[6][2];
	  
	  data[0][0] = "standard_user";
	  data[0][1] = "secret_sauce";
	  
	  data[1][0] = "locked_out_user";
	  data[1][1] = "secret_sauce";
	  
	  data[2][0] = "problem_user";
	  data[2][1] = "secret_sauce";

	  data[3][0] = "performance_glitch_user";
	  data[3][1] = "secret_sauce";
	  
	  data[4][0] = "error_user";
	  data[4][1] = "secret_sauce";
	  
	  data[5][0] = "visual_user";
	  data[5][1] = "secret_sauce";

	return data;
	  
  }

}
