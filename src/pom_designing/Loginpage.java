package pom_designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath = "//input[@id='username']")private WebElement un;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement pwd;
	@FindBy(xpath = "//div[text()='Login ']")private WebElement loginbtn;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);}
		public void enterun() {
			un.sendKeys("admin");}
			public void enterpwd() {
				pwd.sendKeys("manager");}
				public void clickloginbtn() {
					loginbtn.click();
				}
			}
			
			
		
	


