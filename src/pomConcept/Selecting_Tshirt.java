package pomConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecting_Tshirt {
	
		

		public WebDriver driver;

		@FindBy(xpath = "(//a[@title='Dresses'])[2]")
		private WebElement dress;
		@FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
		private WebElement casual_Dress;
		@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
		private WebElement quick_View;
		@FindBy(xpath="//iframe[@class='fancybox-iframe']")
		private WebElement frame;
		
		public WebElement getFrame() {
			return frame;
		}
		
		public WebElement getQuick_View() {
			return quick_View;
		}

		public Selecting_Tshirt(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getCasual_Dress() {
			return casual_Dress;
		}

		public WebElement getDress() {
			return dress;
		}

		

	}


