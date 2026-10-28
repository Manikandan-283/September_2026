package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task1_21092026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();		
		driver.get("https://testautomationpractice.blogspot.com/p/playwrightpractice.html");
		
		Actions work = new Actions(driver);		
		//mouse hover		
		WebElement pointme = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement laptops1 = driver.findElement(By.xpath("//a[text()='Laptops']"));
		
		work.moveToElement(pointme).perform();
		work.moveToElement(laptops1).click().perform();		
		//double click		
		WebElement note = driver.findElement(By.xpath("//button[text()='Copy Text'                                  ]"));
		work.doubleClick(note).perform();			
		//right click			
		WebElement note1 = driver.findElement(By.xpath("//input[@name='shipping']"));		
		work.contextClick(note1).perform();			
	    // drag and drop
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));		
		work.dragAndDrop(drag, drop).perform();		
		// range slider		
		WebElement min = driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		WebElement max = driver.findElement(By.xpath("//span[@style='left: 60%;']"));
		
		System.out.println(min.getLocation());
		System.out.println(max.getLocation());
		
		work.dragAndDropBy(min, 100, 0).perform();
		work.dragAndDropBy(min, -100, 0).perform();
}

}