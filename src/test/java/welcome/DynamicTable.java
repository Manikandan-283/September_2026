package welcome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> rows = driver.findElements(By.xpath("/table[@id='taskTable']/tbody/tr"));
		
		//row=[tr,tr,tr,tr]
		//tr- td,td,td,td,td
		
		String cpuvalue = null;
		
		for (WebElement row : rows) {
			
			List<WebElement> td = row.findElements(By.tagName("td"));
			
		//	td=[td,td,td,td,td]
			
			String browsername = td.get(0).getText();
			
			if (browsername.equalsIgnoreCase("Internet Explorer")) {
				
				for (WebElement name : td) {
					
					String text = name.getText();
					
					if (text.contains("%")) {
					cpuvalue=text;					
											}											
				}							
			}
			System.out.println(cpuvalue);		
								}
		
		System.out.println(cpuvalue);
		
		
	}

}
