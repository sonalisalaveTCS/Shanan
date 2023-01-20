package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class minimize {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open browser
		driver.get("https://www.foundit.in/");
	//	driver.manage().window().maximize();
		Thread.sleep(15000);
		driver.manage().window().minimize();
		
	}

}
