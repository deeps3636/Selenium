package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.amazon.in/");
		
	//moving the mouse pointer to a particular Webelement
		
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
		WebElement Hello=driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"));
		ac.moveToElement(Hello).build().perform();
		
		Thread.sleep(3000);
		
	//Emter some charecters in a text with Cpital letters
		
		WebElement sd=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		sd.click();
		Thread.sleep(3000);
		
		
		ac.keyDown(Keys.SHIFT).moveToElement(sd).sendKeys("sjdfgsugfg").build().perform();
		
		ac.contextClick().build().perform();
		
		
		Thread.sleep(3000);
		
			
		
		driver.quit();
		
		
		
		
		

	}

}
