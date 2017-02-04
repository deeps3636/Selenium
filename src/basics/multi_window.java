package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class multi_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		
		System.out.println(driver.getTitle());
		
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		

	}

}
