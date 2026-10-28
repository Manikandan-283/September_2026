package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class September_07_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver openbox= new ChromeDriver();
		openbox.get("https://www.facebook.com/");
		
		WebElement searchbox = openbox.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		
		searchbox.sendKeys("manikandan@gmail.com");
		
		
		WebElement searchtype = openbox.findElement(By.name("pass"));
		
		searchtype.sendKeys("Mani$125#123$");
		
		
		
        WebElement search = openbox.findElement(By.xpath("//textarea[@aria-label='Search']"));
		
		search.sendKeys("selenium");
		
		search.sendKeys(Keys.ENTER);
		
		
	}
	
	
	

}
