package SeleniumTest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import Utility.BaseClass;

public class DropDown_BaseClass extends BaseClass {
	
	public static void main(String[] args) throws IOException {
			
				
				String path = "\\XLfiles\\WorkBook.xlsx";
				String colours = DropDown_BaseClass.excelread(path, "Demo", 1, 0);
				String colours1 = DropDown_BaseClass.excelread(path, "Demo", 2, 0);
				String colours2 = DropDown_BaseClass.excelread(path, "Demo", 3, 0);
				String colours3 = DropDown_BaseClass.excelread(path, "Demo", 4, 0);
				
				System.out.println(colours);
				System.out.println(colours1);
				System.out.println(colours2);
				System.out.println(colours3);
				
				WebDriver driver = DropDown_BaseClass.brosersetup("chrome","https://testautomationpractice.blogspot.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			    WebElement name = driver.findElement(By.xpath("//select[@id='colors']"));
			   
			   Select select = new Select(name);
			   
				List<WebElement> options = select.getOptions();
		
				System.out.println(options.size());
				
				for (WebElement m : options) {
					
					System.out.println(m.getText());
					
				}
				
	
	
				
		
		
		
		
		
	
	
	
}

	private static String excelread(String path, String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private static WebDriver brosersetup(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
