package pomConcept;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class Address {

	 

		public static WebDriver driver;
		@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i")
		private WebElement address_proceed;
		
		public Address(WebDriver driver2) {
			Address.driver = driver2;
			PageFactory.initElements(driver, this);
		}
		public static WebDriver getDriver() {
			return driver;
		}
		public WebElement getAddress_proceed() {
			return address_proceed;
		}
		
		
		
		
	


}
