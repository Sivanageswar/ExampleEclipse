package nooN_Com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.meesho.com/dresses-kids/pl/3jg?page=2");
		//driver.findElement(By.xpath("//span[text()='Kids - Frocks & Dresses']")).click();
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class=\"NewProductCardstyled__ProductHeaderWrapper-sc-6y2tys-30 gspQJ\"]"));
		Thread.sleep(3000);
		List<WebElement> productPrice = driver.findElements(By.xpath("//h5[@class='sc-eDvSVe dwCrSh']"));
		for (int i = 0; i < productName.size(); i++) {
			System.out.println(productName.get(i).getText());
			System.out.println(productPrice.get(i).getText());
		}
	}

}
