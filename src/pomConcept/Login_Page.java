package pomConcept;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 
	public class Login_Page {
	public  static WebDriver driver;
	@FindBy(id="email_create")
	private WebElement email;
	@FindBy(xpath="//i[@class='icon-user left']")
	private WebElement signin_Btn;

	public Login_Page(WebDriver driver2) {
	Login_Page.driver=driver2;
	PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

		
		
	}



