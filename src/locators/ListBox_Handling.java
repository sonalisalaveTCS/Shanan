package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(1000);{
			driver.findElement(By.xpath("//a[@class='_97w5']")).click();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sonali");
			
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Salave");{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7507132159");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456@123456");
				WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
				Select s =new Select(day);
				s.selectByVisibleText("8");
				WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
				Select s1=new Select(month);
				s1.selectByVisibleText("Aug");
				Thread.sleep(1000);
				WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
				Select s2=new Select(year);
				Thread.sleep(1000);
				s2.selectByVisibleText("1990");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//label[text()='Female']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
			}
		}
	}
}
				
				
				
				
					
						
				
			
				
		
	
			
			
		
		
		