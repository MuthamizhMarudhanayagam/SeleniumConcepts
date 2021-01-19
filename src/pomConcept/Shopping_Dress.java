package pomConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Dress {
	
	public static WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement check_Box;
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span/i")
	private WebElement adress_proceed;
	
	public Shopping_Dress(WebDriver driver2) {
		Shopping_Dress.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheck_Box() {
		return check_Box;
	}

	public WebElement getAdress_proceed() {
		return adress_proceed;
	}
	
	
	
	
	

}



