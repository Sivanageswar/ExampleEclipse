package pageObjectModelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;

public class RegistrationPage 
{
	
	WebDriver driver;
	
	By RegLink = By.linkText("REGISTER");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By Phone = By.name("phone");
	By Email = By.name("userName");
	By Address = By.name("address1");
	By City = By.name("city");
	By State = By.name("state");
	By PostalCode = By.name("postalCode");
	By Country = By.name("country");
	By 	UserName = By.id("email");
	By Password = By.name("password");
	By ConfirmPassword = By.name("confirmPassword");
	By Submit = By.name("submit");
	
	
	public RegistrationPage(WebDriver d) {
		//this.driver = driver;
		driver = d;
	}
	
	public void clickRegLink() 
	{
		driver.findElement(RegLink).click();
	}
	
	public void setFirstName(String fname) 
	{
		driver.findElement(FirstName).sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void setPhone(String phone)
	{
		driver.findElement(Phone).sendKeys(phone);
	}
	
	public void setEmail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	public void setAddress(String address)
	{
		driver.findElement(Address).sendKeys(address);
	}
	
	
	public void setCity(String city)
	{
		driver.findElement(City).sendKeys(city);
	}
	
	public void setState(String state)
	{
		driver.findElement(State).sendKeys(state);
	}
	
	public void setPostalCode(String postalcode)
	{
		driver.findElement(PostalCode).sendKeys(postalcode);
	}
	
	
	public void setcountry(String country)
	{
		driver.findElement(Country).sendKeys(country);
	}
	
	public void setUserName(String username)
	{
		driver.findElement(UserName).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public void setConformPassword(String confirmpassword)
	{
		driver.findElement(Password).sendKeys(confirmpassword);
	}

	
	public void clickSubmit()
	{
		driver.findElement(Submit).click();
	}

}
