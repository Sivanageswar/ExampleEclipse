package dataDrivenSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;


public class DataDrivenSearchFunctionality {
	
	WebDriver driver;
	boolean status;
	
	@Test(dataProvider = "Test Data",dataProviderClass = ExcelDataProvider.class)
	public void Test(String product) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys(product);
		searchbar.submit();
		
		try {
			status = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText().contains(product);
			Assert.assertTrue(status);
		} catch (Exception e) {
			System.out.println("No Results Found");
		}
		
		driver.close();
	}

}

