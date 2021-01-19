package login;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicXpath {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/men-shirts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	List<WebElement> all_prizes = driver.findElements(
			By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]"));
	List<Integer> prize_list = new ArrayList<Integer>();
	for (WebElement prizes : all_prizes) { 
		String prize = prizes.getText().replace("Rs. ",  "");
		int values = Integer.parseInt(prize);
		System.out.println(values);
		prize_list.add(values);
	}
	int size = prize_list.size();
	System.out.println("size:" + size);
	System.out.println("maximum value:" + Collections.max(prize_list));
}

}



