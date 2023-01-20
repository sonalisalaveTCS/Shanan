package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement target=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act= new Actions(driver);
		act.moveToElement(target).perform();
		act.click(target).perform();
		act.moveToElement(target).doubleClick().perform();
	
		
	}


	}


