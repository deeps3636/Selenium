package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		
		
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			
		
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute(arg0);
			
			System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			String str_radio=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if(str_radio.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();;
			}
			
			
			
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
