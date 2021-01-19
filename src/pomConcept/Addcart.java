package pomConcept;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Addcart {
		public static WebDriver driver;
		@FindBy(xpath="//input[@name='qty']")
		private WebElement quentity;
		@FindBy(id="group_1")
		private WebElement size;

		@FindBy(xpath="wishlist_button")
		private WebElement wishist;
		@FindBy(xpath="//*[@id=\"product\"]/div[2]/div/div/a")
		private WebElement close_Wish;
		
		@FindBy(xpath="//*[@id=\"add_to_cart\"]/button")
		private WebElement added_Cart;	
		
		@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i")
		private WebElement address_proceed;
		
		public WebElement getAdded_Cart() {
			return added_Cart;
		}


		public static WebDriver getDriver() {
			return driver;
		}


		public WebElement getQuentity() {
			return quentity;
		}


		public WebElement getSize() {
			return size;
		}


		public WebElement getWishist() {
			return wishist;
		}


		public WebElement getClose_Wish() {
			return close_Wish;
		}


		public Addcart(WebDriver driver2) {
	Addcart.driver=driver2;
	PageFactory.initElements(driver, this);
		}


		public WebElement getAddress_proceed() {
			return address_proceed;
		}
		

	}


