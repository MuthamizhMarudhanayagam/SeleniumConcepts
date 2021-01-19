package pomConcept;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Summary {
		
		public Summary(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
			}
		public static WebDriver getDriver() {
			return driver;
		}
		public WebElement getSummeryproceed() {
			return summeryproceed;
		}
		public static WebDriver driver;
		@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span/i")
		private WebElement summeryproceed;

	}


