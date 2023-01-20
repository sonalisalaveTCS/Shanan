package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void Test() {
		Reporter.log("hi test caste1",true);
	
	}
	@Test
	public void test2() {
		Reporter.log("hi test case2",true);
		Assert.fail();
		
	}
	@Test
	public void test3() {
		Reporter.log("hi test case3",true);
		
	}
	@Test
	public void test4() {
		Reporter.log("hi test case4",true);
	}
	@Test
	public void test5() {
		Reporter.log("hi test case5",true);
		Assert.fail();
	}
	
	
	

	
	

}
