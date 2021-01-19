package pomConcept;

import org.openqa.selenium.WebDriver;


public class Shopping_online extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = getDriver("chrome");
		getUrl("http://automationpractice.com/index.php");
		Home_Page home = new Home_Page(driver);
		clickOnElement(home.getSignin_Btn());
		Login_Page login = new Login_Page(driver);
		inputvalueElement(login.getEmail(), "sridivya2527900@gmail.com");
		clickOnElement(login.getSignin_Btn());
		Personnal_Info per = new Personnal_Info(driver);
		sleep(3000);
		radioButton(per.getMr_Mrs());
		inputvalueElement(per.getPfirst_Name(), "Mohan");
		inputvalueElement(per.getPlast_Name(), "raj");
		inputvalueElement(per.getPassword(), "Sri@143");
		dropDown(per.getDay(), "by value", "26");
		dropDown(per.getMonth(), "by value", "7");
		dropDown(per.getYears(), "by visible", "1997  ");
		inputvalueElement(per.getCompany(), "YAMAHA");
		inputvalueElement(per.getAddress(), "No:19,Rathana Nagar");
		inputvalueElement(per.getCity(), "chennai");
		dropDown(per.getState(), "by value", "3");
		inputvalueElement(per.getZipcode(), "00000");
		inputvalueElement(per.getPhonenum(), "9884579207");
		sleep(1000);
		// per.getAnaddress().clear();
		inputvalueElement(per.getAnaddress(), "No:19,Rathana Nagar");
		clickOnElement(per.getRegister());
		Selecting_Tshirt sele = new Selecting_Tshirt(driver);
		sleep(2000);
		actioNs(sele.getDress());
		clickOnElement(sele.getCasual_Dress());
		clickOnElement(sele.getQuick_View());
		sleep(2000);
		
		Addcart add = new Addcart(driver);
		add.getQuentity().clear();
		inputvalueElement(add.getQuentity(), "2");
		dropDown(add.getSize(), "By index", "1");
		clickOnElement(add.getWishist());
		actioNs(add.getClose_Wish());
		clickOnElement(add.getAdded_Cart());
//		sleep(5000);
//		clickOnElement(add.getAddress_proceed());

	}
}
