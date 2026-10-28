package SeleniumTest;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Task7 {
	
private static @Nullable String currentUrl;

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		
		
     	WebElement m = driver.findElement(By.xpath("//input[@type='text']"));
		
		m.sendKeys("Manikandan");
	
		
		WebElement n = driver.findElement(By.xpath("//input[@name='my-password']"));
	
		n.sendKeys("Password@254563");
	
		
	    WebElement k = driver.findElement(By.xpath("//button[text()='submit']"));
	    
		k.click();
		
		
		 String url2 = driver.getCurrentUrl();
		 
		 System.out.println("Current URL : " + url2);
		
	 //  for (WebElement url : url2) {
		   
		   
	  // }
		
	//	if (currentUrl.contains("Manikandan")) {
		
		//	System.out.println("Test Pass");
		//}	
			
				
	
		}
  }

		

