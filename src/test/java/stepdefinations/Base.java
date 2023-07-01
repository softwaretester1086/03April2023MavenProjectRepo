package stepdefinations;

import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomerPage;
import pageObject.AdminPage;
import pageObject.VendorPage;

public class Base {
	
	public WebDriver driver;
	
	public AdminPage ad;
	public AddNewCustomerPage addCust;
	public VendorPage vendor;

}
