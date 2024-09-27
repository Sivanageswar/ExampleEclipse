package pageObjectModelPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
  @Test
  public void verifyFlightReg() {
	  
	WebDriver driver = (WebDriver) new ChromeDriver();
	
	RegistrationPage RGpage = new RegistrationPage(driver);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	RGpage.clickRegLink();
	RGpage.setFirstName("Vikram");
	RGpage.setLastName("Chakravarthy");
	RGpage.setPhone("9494757050");
	RGpage.setEmail("vikramchakravarthy@gmail.com");
	RGpage.setAddress("Labbipet, Vijayawada");
	RGpage.setCity("Vijayawada");
	RGpage.setState("AndhraPradesh");
	RGpage.setPostalCode("520010");
	RGpage.setcountry("India");
	RGpage.setUserName("VikramChakravarthy");
	RGpage.setPassword("Vikram@0006");
	RGpage.setConformPassword("Vikram@0006");
	RGpage.clickSubmit();
	
	
	//validation
	if (driver.getPageSource().contains("Thank you for registering")) 
	{
		System.out.println("Succsessfully Registered");
	}else 
	{
		System.out.println("Failed TO Register");
	}
  }
}
