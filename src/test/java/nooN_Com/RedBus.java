package nooN_Com;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		WebElement from = driver.findElement(By.xpath("//input[@id=\"src\"]"));
		from.sendKeys("vijayawada");
		Thread.sleep(3000);
		from.sendKeys(Keys.ENTER);
		WebElement To = driver.findElement(By.xpath("//input[@id=\"dest\"]"));
		To.sendKeys("Hyderabad");
		Thread.sleep(3000);
		To.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
		String holidaysCount = driver.findElement(By.xpath("//div[@class='holiday_count']")).getText();
		System.out.println("Holidays count in August: "+holidaysCount);
		
		List<WebElement> calender = driver.findElements(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']"));
		
		List<WebElement> weekends = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
		System.out.println("Number of weekends in August: "+weekends.size());
		

		
		String month = "null";
		while (!month.contains("Apr 2025")) { 
			WebElement navigation = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']"));
			navigation.click();
			WebElement monthElement = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]"));
			month = monthElement.getText();
//			System.out.println("Current Month is: "+month);
		}
		WebElement novHolidays = driver.findElement(By.xpath("//div[@class='holiday_count']"));
		System.out.println("Holidays count in April 2025: "+novHolidays.getText());
		List<WebElement> novWeekends = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
		System.out.println("Number of weekends in April 2025: "+novWeekends.size());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
