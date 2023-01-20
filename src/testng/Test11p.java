package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test11p {
	@Test
	public void test(){
		Reporter.log("hi rutvika",true);
		
		
			
		}
	@Test
	public void test1() {
		Reporter.log("test case2",true);
		Assert.fail();
	}

}
