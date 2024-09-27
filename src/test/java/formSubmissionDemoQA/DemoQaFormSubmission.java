package formSubmissionDemoQA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoQaFormSubmission {
	WebDriver driver;
	WebDriverWait wait;
	
	@Test(dataProvider = "StudentDetails",dataProviderClass = DataProviders.class)
	public void FormSubmission(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13) throws Exception {
		System.out.println(arg0);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(arg0);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(arg2);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, 500)");

		List<WebElement> genderElements = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));

		for (int i = 0; i < genderElements.size(); i++) {
			String text = genderElements.get(i).getText();
			if (text.equalsIgnoreCase(arg3)) {
				genderElements.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys(arg4);
		
		WebElement subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		subject.sendKeys(arg5);
		subject.sendKeys(Keys.ENTER);
		
		List<WebElement> hobbiesElements  = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
		for (int i = 0; i < hobbiesElements.size(); i++) {
			String hobbies = hobbiesElements.get(i).getText();
			if (hobbies.equalsIgnoreCase(arg6)) {
				hobbiesElements.get(i).click();
			}
		}
		driver.findElement(By.id("uploadPicture")).sendKeys(arg7);		
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys(arg8);

        js.executeScript("window.scrollTo(0, 1000)");
		driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		List<WebElement> stateElements = driver.findElements(By.xpath("//div[@tabindex='-1']"));
		
		for (int i = 0; i < stateElements.size(); i++) {
			String state = stateElements.get(i).getText();
			System.out.println(state);
			if (stateElements.get(i).getText().equalsIgnoreCase(arg9)) {
				stateElements.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'Select City')]")).click();
		Thread.sleep(5000);
		List<WebElement> cityElements = driver.findElements(By.xpath("//div[@tabindex='-1']"));
		for (int i = 0; i < cityElements.size(); i++) {
			String city = cityElements.get(i).getText();
			System.out.println(city);
			if (city.equalsIgnoreCase(arg10)) {
				Thread.sleep(3000);
				cityElements.get(i).click();
				break;
			}
		}
		
		js.executeScript("window.scrollBy(0, -500)");  // First Page Up
		js.executeScript("window.scrollBy(0, 200)");  // Page Down

		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText(arg11);
		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText(arg12);
		
		Thread.sleep(5000);
		List<WebElement> day = driver.findElements(By.xpath("div[@tabindex='-1']"));
		for (int i = 0; i < day.size(); i++) {
			if (day.get(i).getText().equals(arg13)) {
				Thread.sleep(5000);
				day.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("submit")).click();
	
	}
}
