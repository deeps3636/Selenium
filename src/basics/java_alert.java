package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
		
		
		//driver.switchTo().alert().dismiss(); // cancel no etc
		//driver.switchTo().alert().sendKeys("testing"); // pass values in java alert if any text field is available
		
		System.out.println(driver.switchTo().alert().getText()); // it gives the text displayed in java alert
		
		driver.switchTo().alert().accept(); //accept means Ok or Done (positive )
		
		Thread.sleep(3000);
		driver.quit();
		
		

}
	
}