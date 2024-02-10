package popuphandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alartpopup {
  

//a pop up which cannot be inspected and without handling cannot the 
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\c\\pravin sof\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver. get ("https://online.hrtchp.com/oprs-web/guest/home.do?h=1"); 

				WebElement alertbutton= driver.findElement(By.xpath("//*[@id=\"toPlaceName\"]"));
				alertbutton.click();
				String text =driver.switchTo().alert().getText();
				System.out.println(text);
				
				driver.switchTo().alert().accept();
}
}