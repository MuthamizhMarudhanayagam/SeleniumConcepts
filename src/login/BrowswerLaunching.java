package login;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrowswerLaunching {
	public static void main(String[] args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver","I:\\SeleniumConcepts\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().deleteAllCookies(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	WebElement sign_in = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
	sign_in.click();
	WebElement create_email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	create_email.sendKeys("muthamizh11@gmail.com");

	WebElement create_Btn = driver.findElement(By.xpath("//i[@class='icon-user left']"));
	create_Btn.click();

	Thread.sleep(4000);
	WebElement gender = driver.findElement(By.id("id_gender1"));
	boolean checking = gender.isEnabled();
	System.out.println(checking);
	gender.click();

	WebElement pfirst_Name = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
	pfirst_Name.sendKeys("muthamizh");

	WebElement plast_name = driver.findElement(By.xpath("(//input[@data-validate='isName'])[2]"));
	plast_name.sendKeys("sakthi");

	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("123456");

	WebElement day = driver.findElement(By.id("days"));
	Select d = new Select(day);
	d.selectByIndex(14);

	WebElement mon = driver.findElement(By.id("months"));
	Select m = new Select(mon);
	m.selectByIndex(6);

	WebElement ye = driver.findElement(By.id("years"));
	Select yea = new Select(ye);
	yea.selectByIndex(26);

	WebElement company = driver.findElement(By.xpath("//*[@id=\"company\"]"));
	company.sendKeys("YAMAHA");

	WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
	address.sendKeys("No:12, ram nagar,");

	WebElement cityname = driver.findElement(By.name("city"));
	cityname.sendKeys("dindukal");

	WebElement state = driver.findElement(By.id("id_state"));
	Select st = new Select(state);
	st.selectByIndex(3);

	WebElement zipcode = driver.findElement(By.name("postcode"));
	zipcode.sendKeys("00000");

	WebElement phonenum = driver.findElement(By.name("phone_mobile"));
	phonenum.sendKeys("9994496614");

	WebElement add = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
	add.sendKeys("No:19, Reshu nagar,");

	WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
	register.click();
	
	Thread.sleep(3000);
	WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
	Actions a = new Actions(driver);
	a.moveToElement(dress).build().perform();
	
	WebElement causul = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a"));
	causul.click();
	
	Thread.sleep(2000);
	WebElement quickview = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	quickview.click();
	
	driver.switchTo().frame(0);
	
	WebElement count = driver.findElement(By.xpath("//input[@name='qty']"));
	count.clear();
	count.sendKeys("2");
	
	WebElement size = driver.findElement(By.id("group_1"));
	Select se = new Select(size);
	se.selectByIndex(1);
	
	WebElement addcart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	addcart.click();
	
	Thread.sleep(2000);
	WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/i"));
	proceed.click();
	
	WebElement proceed1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span/i"));
	proceed1.click();
	
	Thread.sleep(2000);
	WebElement proceed2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span/i"));
	proceed2.click();
	
	WebElement checkBox = driver.findElement(By.id("cgv"));
	boolean c_Box = checkBox.isEnabled();
	System.out.println(c_Box);
	checkBox.click();
	
	WebElement ship_proceed = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span/i"));
	ship_proceed.click();
	
	WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
	pay.click();
	
	WebElement confirm_order = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span/i"));
	confirm_order.click();
	
	WebElement text_screen = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", text_screen);
	
	TakesScreenshot shot = (TakesScreenshot)driver;
	File source = shot.getScreenshotAs(OutputType.FILE);
	File destination =new File("I:\\SeleniumConcepts\\Sceenshot\\snap.png");
	FileUtils.copyFile(source, destination);
	
	Thread.sleep(2000);
	WebElement sign_out = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	sign_out.click();
		
	


}
}
