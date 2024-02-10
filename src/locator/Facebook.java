package locator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","E:\\c\\pravin sof\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver. get ("https://www.facebook.com/");
		
		
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File Source = ss.getScreenshotAs(OutputType.FILE);
		File Folder = new File ("E:\\c\\pravin sof\\TakeScreenshot\\facebook.png");
		FileUtils.copyFile(Source, Folder);
		
	}}
 
