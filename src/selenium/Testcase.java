package selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String expT="Googles";
				String actT=driver.getTitle();
				System.out.println(actT);
				if(expT.equals(actT)) {
					System.out.println("tc pass");
				}
				else 
				{
					System.out.println("tc fail");
				}
		
		
		
			
		
		}
		
		
		
	

}
