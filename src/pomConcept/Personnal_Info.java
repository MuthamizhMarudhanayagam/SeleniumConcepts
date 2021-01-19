package pomConcept;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Personnal_Info {

		public WebDriver driver;

		@FindBy(id = "id_gender1")
		private WebElement Mr_Mrs;
		@FindBy(xpath = "//input[@name='customer_firstname']")
		private WebElement pfirst_Name;
		@FindBy(xpath = "(//input[@data-validate='isName'])[2]")
		private WebElement plast_Name;
		@FindBy(xpath = "//input[@type='password']")
		private WebElement password;
		@FindBy(id = "days")
		private WebElement day;
		@FindBy(id = "months")
		private WebElement month;
		@FindBy(id ="years")
		private WebElement years;
		@FindBy(xpath="//*[@id=\"company\"]")
		private WebElement company;
		@FindBy(xpath= "//*[@id=\"address1\"]")
		private WebElement address;
		@FindBy(name="city")
		private WebElement city;
		@FindBy(name="id_state")
		private WebElement state;
		@FindBy(name="postcode")
		private WebElement zipcode;
		@FindBy(name="phone_mobile")
		private WebElement phonenum;
		@FindBy(xpath="//*[@id=\"alias\"]")
		private WebElement anaddress;
		@FindBy(xpath="//span[text()='Register']")
		private WebElement register;
	public Personnal_Info(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getMr_Mrs() {
		return Mr_Mrs;
	}
	public WebElement getPfirst_Name() {
		return pfirst_Name;
	}
	public WebElement getPlast_Name() {
		return plast_Name;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYears() {
		return years;
	}

	public WebElement getCompany() {
		return company;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getPhonenum() {
		return phonenum;
	}
	public WebElement getAnaddress() {
		return anaddress;
	}
	public WebElement getRegister() {
		return register;
	}

	}



