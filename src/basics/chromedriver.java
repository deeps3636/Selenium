package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//F:\Automation\chromedriver_win32
		/*System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.close();
*/		
		System.setProperty("webdriver.ie.driver","F:\\Automation\\IEDriverServer_x64_3.0.0\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver1.get("https://www.facebook.com");
		
	
		
		
		
		
		
		

	}

}
