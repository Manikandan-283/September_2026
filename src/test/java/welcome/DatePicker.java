package welcome;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement datapicker = driver.findElement(By.xpath("//input[@id='datepicker']"));		
		datapicker.click();		
		//driver.switchTo().frame(0);		
		String mon = "september" , yr = "2027" , date = "28" ;		
		while(true) {		
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();		
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();		
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));		
		if (month.equalsIgnoreCase(mon) && year.equalsIgnoreCase(yr)) {
			break;
		}
		else {			
			next.click();
		}		
	}	
		List<WebElement> elements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		
		for (WebElement name : elements) {
			
			String text = name.getText();			
			
			if (text.equalsIgnoreCase(date)) {
				
				name.click();
				break;
			}
		}
		
		
	}
	
	
}
