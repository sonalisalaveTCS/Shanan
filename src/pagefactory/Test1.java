package pagefactory;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	Sheet sh;
	WebDriver driver;
	Loginpage l;
	HomePage h;

	@BeforeClass
	public void openBrowser()throws Throwable{
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Documents\\sonali.xlsx");
		sh= WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demo.actitime.com/login.do");
	l=new Loginpage(driver);
	h=new HomePage(driver);
	}
	@BeforeMethod
	public void openApp() {
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		l.enterUN("admin");
		String passward=sh.getRow(0).getCell(1).getStringCellValue();
		l.enterPSW("manager");
		l.clickLogInBtn();
	}
	@Test
	public void verifyText() {
		Reporter.log("Running VerifyText",true);
		String expT=sh.getRow(0).getCell(2).getStringCellValue();
		String actT=h.verifyText();
		//Assert.assertEquals(expT,actT);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from app",true);
	}
	@AfterClass 
	public void closeBrowser() {
		Reporter.log("close the browser",true);
		
	

}
}