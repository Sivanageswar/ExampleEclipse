import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class Noon_com {
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebElement searchmobiles = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='mobiles']")));
		//driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//span[text()='mobiles']")).click();

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.noon.com/uae-en/");
		WebElement searchbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchBar']")));
		searchbox.sendKeys("mobiles");
		Thread.sleep(2000);
		searchbox.sendKeys(Keys.ENTER);
//		List<WebElement> mobile_elements = driver.findElements(By.xpath("//div[@class='sc-61baf88b-7 dRkNeo grid']"));
//		Thread.sleep(3000);
//		for (WebElement mobile : mobile_elements) {
//			System.out.println(mobile.getText());
//			System.out.println("************************************************************************************************");
//			WebElement mobileName =  mobile.findElement(By.xpath("//div[@data-qa='product-name']"));
//			String mName = mobileName.getText();
//			WebElement mobilePrice = mobile.findElement(By.xpath("//strong[@class=\"amount\"]"));
//			String mPrice = mobilePrice.getText();
//			System.out.println("Product Name is: "+mName);
//			System.out.println("Product Price is: "+mPrice);
//		}
		
		List<WebElement> mobile_elements_All= driver.findElements(By.xpath("//div[@class='sc-61baf88b-7 dRkNeo grid']"));
		Thread.sleep(3000);
		for (int i = 0; i < mobile_elements_All.size(); i++) {
			System.out.println(mobile_elements_All.get(i).getText());
		}
		System.out.println("*******************************************************************************************************");
		List<WebElement> mobileName = driver.findElements(By.xpath("//div[@data-qa='product-name']"));
		List<WebElement> mobilePrice = driver.findElements(By.xpath("//strong[@class='amount']"));
		for (int i = 0; i < mobileName.size(); i++) {
			System.out.println("Mobile Name is -" +mobileName.get(i).getText());
			System.out.println("Mobile Price is - "+mobilePrice.get(i).getText());
		}
	
		}

	}
	
	


