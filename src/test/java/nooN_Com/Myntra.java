package nooN_Com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		List<WebElement> productBrands = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<WebElement> productName = driver.findElements(By.xpath("//h4[@class='product-product']"));
		List<WebElement> productPrice = driver.findElements(By.xpath("//div[@class='product-price']"));
		
		for (int i = 0; i < productBrands.size(); i++) {
			System.out.println("Product Brand Name is -"+productBrands.get(i).getText());
			System.out.println("Product Name is -"+productName.get(i).getText());
			System.out.println("Product Price is -"+productPrice.get(i).getText());
		}
       
//        driver.findElement(By.xpath("//li[text()='Next']")).click();
		try {
        WebElement elementToScroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='pagination-next']")));

        // Use JavaScript to scroll the page to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);

        // Optionally, wait a moment for the element to be fully in view
        Thread.sleep(1000); // Adjust time as needed

        // Click the element after ensuring it is in view
        WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='pagination-next']")));
        js.executeScript("arguments[0].click();", elementToClick);

//        elementToClick.click();
    } catch (Exception e) {
        // Handle exceptions (e.g., element not found, interaction issues)
        e.printStackTrace();
    } finally {
        // Close the WebDriver
        //driver.quit();
    }



		
		
	}

}
