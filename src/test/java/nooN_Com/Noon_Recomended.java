package nooN_Com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Noon_Recomended {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Actions action = new Actions(driver);
		driver.get("https://www.noon.com/uae-en/");
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
        //WebElement elementToScroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-26c8c6bb-22 iyjrnN']")));

        // Use JavaScript to scroll the page to the element
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", "//div[@class='sc-26c8c6bb-22 iyjrnN']");
//
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='sc-26c8c6bb-22 iyjrnN']")));
		
		List<WebElement> RecomendedMobiles = driver.findElements(By.xpath("//div[@class='sc-26c8c6bb-22 iyjrnN']"));
		for (int i = 0; i < RecomendedMobiles.size(); i++) {
			System.out.println(RecomendedMobiles.get(i).getText());
			
			WebElement navigation = driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next') and contains(@class, 'custom-navigation') and contains(@class, 'swiper-nav-componentArea-4')]"));
			navigation.click();
//			if (navigation.isDisplayed()) {
//				navigation.click();
//				break;
//			}else {
//				System.out.println("No Navigation Icon Displayed Here After");
//			}

		}
		
	}

}
