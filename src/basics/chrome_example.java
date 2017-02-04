package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_example {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//input[@id='u_0_1']")).sendKeys("Deeps");
		
		driver.findElement(By.xpath("//input[@id='u_0_6']")).sendKeys("Deeps@gmsil.com");
		driver.findElement(By.id("u_0_9")).sendKeys("595456484");
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
		
				
		

	}

}
