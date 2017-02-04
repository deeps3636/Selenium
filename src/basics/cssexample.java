package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F://Automation//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id ='username']")).sendKeys("username");
		driver.findElement(By.cssSelector("[id=password]")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
