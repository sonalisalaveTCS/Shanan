package test_ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser {
@Parameters	("browsername")
	
	@Test
	public void TC(String browsername) {//Parameterized method
		WebDriver driver=null;//runtime polymorphism
if(browsername.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
	
}
else if
(browsername.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.32.0-win32 (1)\\geckodriver.exe");
	driver=new FirefoxDriver();
	
}
driver.get("https://www.amazon.in/");
		
	}

}
