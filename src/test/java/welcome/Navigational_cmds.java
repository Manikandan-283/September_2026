package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_cmds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			
			driver.navigate().to("https://www.selenium.dev");
		
		driver.findElement(By.xpath("//span[text()'Downloads']")).click();
		
		driver.navigate().back();
		
		
		
	}

}
