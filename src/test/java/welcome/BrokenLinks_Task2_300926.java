package welcome;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinks_Task2_300926 {
		public static void brokenlinkChecker(String link) throws IOException{
				URL url = new URL (link);
		
		HttpURLConnection httpurl = (HttpURLConnection)url.getContent();
		
		httpurl.connect();
		
		int responseCode = httpurl.getResponseCode();
		
		if (responseCode>400) {
			
			System.out.println("Broken link");
		}		
		else {
					System.out.println("valid link");
			}
	}		
	public static void main(String[] args) throws IOException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> anchor = driver.findElements(By.tagName("a"));
		
		for (WebElement world : anchor) {
			
			@Nullable
			String link = world.getDomAttribute("href");
			
			if (link.contains("https")) {
				
			BrokenLinks_Task2_300926.brokenlinkChecker(link);			
			}						
		}					
		System.out.println("Completed");
		
		

	}

}
