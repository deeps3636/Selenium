package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_login_post_logout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F://Automation//geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("deepsandroid@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("androidferrari");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		//driver.findElement(By.xpath("//*[@id='logoutMenu']/a/div")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		//driver.findElement(By.id("userNavigationLabel")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.linkText("Log Out")).click();
		
		//driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]")).click();
	}

}
