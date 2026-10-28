package welcome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Always {

	public static void main(String[] args) {
	
	//always
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.id("ti6dpd"));
		
		searchbox.sendKeys("welcome");
		
		WebElement opensearch = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		
		searchbox.sendKeys("id");
		
		
		
		
		
		
		
		
		
		
}
}