package pomConcept;


	
	import java.io.File;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class BaseClass {

		private static String True = "True";
		private static String False = "False";
		public static WebDriver driver;
		
		
		public static void actioNs(WebElement element) {

			try {
				Actions a = new Actions(driver);
				a.moveToElement(element).build().perform();
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
		public static WebDriver getDriver(String Browser) {

			try {
				if (Browser.equalsIgnoreCase("chrome")) {

					System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
					driver = new ChromeDriver();

				} else if (Browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", System.getProperty("\\Driver\\chromedriver.exe"));
					driver = new InternetExplorerDriver();

				} else if (Browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver",
							System.getProperty("user.dir") + ("\\Driver\\geckoDriver.exe"));
					driver = new FirefoxDriver();

				} else if (Browser.equalsIgnoreCase("Edge")) {
					System.setProperty("webdriver.edge.driver",
							System.getProperty("user.dir") + ("\\Driver\\EdgeDriver.exe"));

				}
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return driver;
		}

		public static void clickOnElement(WebElement element) {

			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void getUrl(String Url) {
			try {
				driver.get(Url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void inputvalueElement(WebElement element, String value) {

			try {
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void sleep(int seconds) throws Throwable {
			try {
				Thread.sleep(seconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		public static void quit_Allwindow() {

			try {
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void close() {
			try {
				driver.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void pageLoad(int seconds) {

			try {
				driver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static String radioButton(WebElement element) {

			try {
				element.isEnabled();
				element.click();
				return True;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return False;

		}

		public static void screen_Shot(String Location) throws Throwable {

			try {
				TakesScreenshot shot = (TakesScreenshot) driver;
				File source = shot.getScreenshotAs(OutputType.FILE);
				File destination = new File(Location);
				FileUtils.copyFile(source, destination);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void dropDown(WebElement element, String Type, String Value) {
			try {
				Select s = new Select(element);

				if (Type.equalsIgnoreCase("by index")) {
					int index = Integer.parseInt(Value);
					s.selectByIndex(index);
				} else if (Type.equalsIgnoreCase("by value")) {
					s.selectByValue(Value);

				} else if (Type.equalsIgnoreCase("by visible")) {
					s.selectByVisibleText(Value);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void frame(WebElement element, String Type, String Value) {

			try {
				if (Type.equalsIgnoreCase("element")) {
					driver.switchTo().frame(Value);

				} else if (Type.equalsIgnoreCase("By index")) {
					int index = Integer.parseInt(Value);
					driver.switchTo().frame(index);

				} else if (Type.equalsIgnoreCase("id")) {
					driver.switchTo().frame(Value);

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void navigate(String does) {

			try {
				if (does.equalsIgnoreCase("back")) {
					driver.navigate().back();
				} else if (does.equalsIgnoreCase("forward")) {
					driver.navigate().forward();
				} else if (does.equalsIgnoreCase("refresh")) {
					driver.navigate().refresh();

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		public static void base_Alert(String ok_Or_Cancel) {
			
			try {
				Alert d = driver.switchTo().alert();
				if (ok_Or_Cancel.equalsIgnoreCase("ok")) {
					System.out.println(d.getText());
					d.accept();
					
				}else if (ok_Or_Cancel.equalsIgnoreCase("cancel")) {
					System.out.println(d.getText());
					d.dismiss();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}
		
	}



