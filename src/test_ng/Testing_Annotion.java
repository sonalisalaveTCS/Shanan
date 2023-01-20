package test_ng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_Annotion {


@BeforeClass
public void openBrowser() {
	Reporter.log("open browser",true);
	
}
@BeforeMethod
public void oginto() {
	Reporter.log("login to app",true);
}
	
	@Test
public void  verifyText() {
	Reporter.log("running  actual test case",true);
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("logout fromapp",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("cose browser",true);
	}
}
	

