package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testtp {


@Test
public void test() {
	Reporter.log("test 1 is pass",true);
	
}



@Test
public void test1() {
	Reporter.log("test case2 pass",true);
}
}