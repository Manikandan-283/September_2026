package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_19092026 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();		
		
		WebElement india = driver.findElement(By.linkText("Gmail"));//a		
		System.out.println(india.getLocation());		
		System.out.println(india.getCssValue("font-size"));		
		if (india.isDisplayed()) {			
			System.out.println("test pass");	
		}
		else System.out.println("test fail");		
		System.out.println(india.getSize());
		
		System.out.println(india.getDomAttribute("href")); //attribute
		
		System.out.println(india.getText()); // visible text
		
		System.out.println(india.getTagName()); //tagname
		
		WebElement one = india.findElement(By.xpath("//textarea[@aria-label='Search']"));			
		one.sendKeys("selenium");	
		Thread.sleep(2000);		
		one.clear();
	
}
	

}
	

