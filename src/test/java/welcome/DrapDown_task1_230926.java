package welcome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrapDown_task1_230926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
        WebElement value = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		
		value.sendKeys("mobile");
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@value='mobile under 10000']"));
		
		for(WebElement india : elements) {
			
			String text = india.getText();
			
		if (text.equalsIgnoreCase("mobile under 10000"));
		
		System.out.println(text);
		india.click();
			
		}
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
