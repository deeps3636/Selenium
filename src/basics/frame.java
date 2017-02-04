package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println(driver.getPageSource());
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345");
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
