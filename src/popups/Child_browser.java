package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("I-phones",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	
		Set<String>allwindows=driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(allwindows);
		String mainid=al.get(0);
		System.out.println(mainid);
		driver.switchTo().window(al.get(1));
		String childw=al.get(1);
		System.out.println(childw);
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
	}

}
