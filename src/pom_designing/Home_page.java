package pom_designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
public Home_page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void verifyText() {
	String expT="EnterTime-Track";
			
	String actT=text.getText();
	if(actT.equals(expT)){
	
	
		System.out.println("tc is pass");
		
	}
		 else
		 {
			System.out.println("tc is fail");
	}
}


}




