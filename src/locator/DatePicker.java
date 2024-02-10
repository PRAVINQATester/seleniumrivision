package locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\c\\pravin sof\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				String url = driver.getCurrentUrl();
				driver.getTitle();
				System.out.println(url);
}
}