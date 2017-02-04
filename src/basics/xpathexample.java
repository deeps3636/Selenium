package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F://Automation//geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		/*driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("html/body/header/div[2]/div/nav/ul/li[2]/a")).click();
		*/
		
		
		//driver.get("http://www.facebook.com/");
		/*driver.findElement(By.id("email")).sendKeys("testing");
		driver.findElement(By.name("pass")).sendKeys("12345");*/
		//driver.findElement(By.xpath("//input[@id='u_0_l']")).click();
		
		
		/*driver.get("http://www.facebook.com/");
		//driver.findElement(By.linkText("Forgotten account?")).click();	
		driver.findElement(By.partialLinkText("Forgotten")).click();*/
		
		/*driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("pass");*/
		
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='reg_form_box']/div[1]/div/div[1]/div/div/input")).sendKeys("Testing firstname");
		
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		
		
		
		
		
		
		;
		
		

		//driver.quit();

	}

}
