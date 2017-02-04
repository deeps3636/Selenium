package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_urls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		//Just a comment to check github
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com/");
		//System.out.println(driver.getPageSource());
		int a=driver.findElements(By.tagName("a")).size();
		System.out.println(a);
		/*
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345");*/
		//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul
		Thread.sleep(3000);
		WebElement Secondframe=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		//driver.switchTo().frame(Secondframe);
	
		
		int b=Secondframe.findElements(By.tagName("a")).size();
		System.out.println(b);
		
		Thread.sleep(3000);
		
		String before=null;
		String after=null;
		
		for(int i=0;i<b;i++)
		{
			System.out.println(Secondframe.findElements(By.tagName("a")).get(i).getText());
			
			
			if(Secondframe.findElements(By.tagName("a")).get(i).getText().contains("Developers"))
			{
				System.out.println(driver.getTitle());
				before=driver.getTitle();
				Secondframe.findElements(By.tagName("a")).get(i).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				after=driver.getTitle();
				break;
			}		
			System.out.println("Inside for loop");
		}
		
		Thread.sleep(3000);
		
		if(before!=after)
		{
			if(driver.getPageSource().contains("Powerful APIs Designed For Your Business"))
			{
			System.out.println("PASS");
			}
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		driver.quit();
	}

}
