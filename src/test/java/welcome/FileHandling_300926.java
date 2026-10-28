package welcome;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling_300926 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/p/download-files_25.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	//	WebElement upload = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		
	//	String path = new File("./filesupload/intro.txt").getAbsolutePath();
		
	//	upload.sendKeys(path);
		
		driver.findElement(By.xpath("//button[text()='Generate and Download Text File']")).click();
		
		driver.findElement(By.xpath("//a[text()='Download Text File']")).click();
		
		Thread.sleep(3000);
		
		
		File f = new File("C:\\Users\\Admin\\Downloads");
		
		File[] listFiles = f.listFiles();
		
		for (File s : listFiles) {
		
			
			if (s.getName().equalsIgnoreCase("sample.xlsx")) {
		
		System.out.println("file downloaded successfully");
		
		break;
	      }
			else {
				
				System.out.println("**");
				
			}
			
			
	   }

	}
}