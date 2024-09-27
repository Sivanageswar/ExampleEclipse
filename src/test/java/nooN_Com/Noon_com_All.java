package nooN_Com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Noon_com_All {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.noon.com/uae-en/");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-eXsaLi ftFHwC']/div/div")));
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='sc-eXsaLi ftFHwC']/div/div"));
		Thread.sleep(2000);
		for (WebElement mobile : mobiles) {
			System.out.println(mobile.getText());
		}
		System.out.println("****************************************************************************************************");
		driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next') and contains(@class, 'custom-navigation') "
				+ "and contains(@class, 'swiper-nav-componentArea-3')]")).click();
		List<WebElement> mobiles2 = driver.findElements(By.xpath("//div[@class='sc-eXsaLi ftFHwC']"));
		for (WebElement mobile : mobiles2) {
			System.out.println(mobile.getText());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next') and contains(@class, 'custom-navigation') "
				+ "and contains(@class, 'swiper-nav-componentArea-3')]")).click();
		List<WebElement> mobiles3 = driver.findElements(By.xpath("//div[@class='sc-eXsaLi ftFHwC']"));
		for (WebElement mobile : mobiles3) {
			System.out.println(mobile.getText());
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next') and contains(@class, 'custom-navigation') "
				+ "and contains(@class, 'swiper-nav-componentArea-3')]")).click();
		List<WebElement> mobiles4 = driver.findElements(By.xpath("//div[@class='sc-eXsaLi ftFHwC']"));
		for (WebElement mobile : mobiles4) {
			System.out.println(mobile.getText());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next') and contains(@class, 'custom-navigation') "
				+ "and contains(@class, 'swiper-nav-componentArea-3')]")).click();
		List<WebElement> mobiles5 = driver.findElements(By.xpath("//div[@class='sc-eXsaLi ftFHwC']"));
		for (WebElement mobile : mobiles5) {
			System.out.println(mobile.getText());
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next') and contains(@class, 'custom-navigation') "
				+ "and contains(@class, 'swiper-nav-componentArea-3')]")).click();
		List<WebElement> mobiles6 = driver.findElements(By.xpath("//div[@class='sc-eXsaLi ftFHwC']"));
		for (WebElement mobile : mobiles6) {
			System.out.println(mobile.getText());
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next') and contains(@class, 'custom-navigation') "
				+ "and contains(@class, 'swiper-nav-componentArea-3')]")).click();
		List<WebElement> mobiles7 = driver.findElements(By.xpath("//div[@class='sc-eXsaLi ftFHwC']"));
		for (WebElement mobile : mobiles7) {
			System.out.println(mobile.getText());
		}
		System.out.println("#####################################################################################################");
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
	
}
