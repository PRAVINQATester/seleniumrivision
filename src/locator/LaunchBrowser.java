package locator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchBrowser {
public static void main (String[]args) throws IOException {
	System.setProperty("webdriver.chrome.driver","E:\\c\\pravin sof\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 
 driver. manage().window().maximize();
 driver.get("https://www.javatpoint.com/selenium-interview-questions");
	 
 Actions action = new Actions(driver);  
 WebElement element = driver.findElement(By.id("a[href='javascript-interview-questions']"));  
 action.moveToElement(element).perform();  
 
 TakesScreenshot ss= (TakesScreenshot)driver;
 File source = ss.getScreenshotAs(OutputType.FILE);
 File folder = new File("E:\\c\\pravin sof\\screenshot\\web.png");
 FileUtils.copyFile(source,folder);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
}