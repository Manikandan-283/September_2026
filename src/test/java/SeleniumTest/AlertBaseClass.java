package SeleniumTest;

	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;

	import Utility.BaseClass;
		
		public class AlertBaseClass extends BaseClass {
			
		public static void main(String[] args) throws IOException {	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
						
						String path = "https://letcode.in/alert";
						String alert = AlertBaseClass.excelread(path, "Alert", 0, 1);
						
						
						System.out.println(alert);
					
				//simple alert - alert 1
						
					driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
					//switch
					Alert new1 = driver.switchTo().alert();												//alert			
					System.out.println(new1.getText());
					new1.accept();
				
						
						
						
						
						
						
						
						
						
			}

		private static String excelread(String path, String string, int i, int j) {
			// TODO Auto-generated method stub
			return null;
		}

	}
	
	
	
	


