package test_ngsam;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void TC1() {
		Reporter.log("running tc1",true);
	}
		
		@Test
		public void TC2() {
			Reporter.log("running tc2",true);
		}
		
	@Test
	public void TC3() {
		Reporter.log("running tc3",true);
	}

}
