package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute_and_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String expectedT="actiTIME - Login";
		String actualT=driver.getTitle();
		System.out.println(actualT);
		if(expectedT.equals(actualT)) {
			System.out.println("tc pass,user navigate to home page");
			
		}
		else {System.out.println("tc is fail");
		
		
		}
		
	}

}
