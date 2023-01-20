package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.findElement(By.id("username")).sendKeys("pwd");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		String expT="actiTIME-Enter Time Track";
		String actT=driver.getTitle();
		if(expT.equals(actT)) {
			System.out.println(" TC is pass");
			
		}
		else {
			System.out.println("TC is fail");
		}
		
		
	}

}
