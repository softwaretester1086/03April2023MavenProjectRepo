package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
// common for every page object class	
	public WebDriver ldriver;
	// below is parameterized constructor
	public AdminPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
//	public static void main(String[] args) {
//		
//		WebDriver driver=new ChromeDriver();
//		
//		WebElement textEmail=driver.findElement(By.xpath("//input[@id='Email']")).click();
//		
//	}
	// In Maven, we actually add our webelement first with the help of @FindBy as below
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement btnLogin;
	
	//For every webelement we can create a separate user define method
	
	public void setUsername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
		
	}

}
