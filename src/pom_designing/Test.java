package pom_designing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		Loginpage I =new Loginpage(driver);
	I.enterun();
	I.enterpwd();
	I.clickloginbtn();
	Home_page h=new Home_page(driver);
	h.verifyText();
	
	
	
		
		
	}

	
		

	}

	
		
	
	

