import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqa {

	public static void main (String[]args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\c\\pravin sof\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/buttons");
		 
		 Actions act = new Actions (driver);
		 Thread.sleep(2000);
		 // right click
		 WebElement rc =driver.findElement(By.id("OwQal"));
		 act.click(rc).perform();
		  // double click
		 WebElement dc = driver.findElement(By.id(""));
		 act.doubleClick(dc).perform();
		 
		 WebElement mb = driver.findElement(By.id(""));
		 act.click().perform();
		 
		 
		 //click
		 WebElement click = driver .findElement(By.id(" "));
		 act.click(click);
		 driver.close();
	}
}