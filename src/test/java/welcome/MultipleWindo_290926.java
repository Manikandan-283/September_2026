package welcome;

import java.lang.management.OperatingSystemMXBean;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindo_290926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement window = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		
		window.sendKeys("Java");
		
		window.sendKeys(Keys.ENTER);
		
		List<WebElement> world1 = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
		
		for (WebElement name : world1) {
			
			name.click();
				
		}
		
		System.out.println(driver.getTitle());
		
		Set<String> single = driver.getWindowHandles();
		
		for(String name : single) {
		
		driver.switchTo().window(name);
		
		System.out.println(driver.getTitle());
		
		
		}
		
		
		
		
		
		
		

	}

}
