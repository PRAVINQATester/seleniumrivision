package facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class FB {

	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver","E:\\c\\pravin sof\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//..............................................................................................		 
		
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver. get ("https://www.facebook.com/signup");
	//...................................................................................	
		
	//	isDisplayed
		
		//boolean logo = driver.findElement (By.xpath(null)).isDisplayed(); 
		//
//................................................................................................
		 // is ENABLED
		
		boolean Alreadyanaccount = driver.findElement(By.xpath("//*[@id=\"reg_form_box\"]/div[12]/a ")).isEnabled();
		
		if (Alreadyanaccount== true)
		{
			System.out.println("the link alredy have acount is enable");
		}
		else
		{
			System.out.println(" the already have an account is not enable");
		}
//...............................................................................................
		//is selected
		
boolean selected = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Custom']]")).isSelected();
		
		if (selected== true)
		{
			System.out.println("the custum button is selected");
		}
		else
		{
			System.out.println(" the custom button is not selected");
		}
		
//...........................................................................................	
		// find title website
		System.out.println("the current page title is :" + driver.getTitle() );
	
		String ET ="Sign up for Facebook | Facebook";
		String at= driver.getTitle();
		
		if (at.equals(ET))
		{
			System.out.println("THE tEST CASES IS pASS");
			
		}
		else 
		{
			System.out.println("the test cases is fail");
			
		}
	//.........................................................................................
		// find website URL 
		
		System.out.println("the current page title is :" + driver.getCurrentUrl() );
		
		String Et ="https://www.facebook.com/signup";
		String At = driver.getCurrentUrl();
		
		if (At.equals(Et))
		{
			System.out.println(" the current url pass");
		}
		else
		{
			System.out.println("the currrent url is fail");
		}
	//..............................................................................................	
		// facebook sign up page
		
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Pravin");
		
	 WebElement Sirname =  driver.findElement(By.name("lastname"));
	 Sirname.sendKeys("Pubmatic india");
		
		 WebElement MN = driver.findElement(By.name("reg_email__"));
		 MN.sendKeys("9921609436");
		 
		 WebElement Pass = driver.findElement(By.name("reg_passwd__"));
			Pass .sendKeys("Pravin@123");
			
		WebElement date = driver.findElement(By.id("day"));
			date.sendKeys("14");
			
		 WebElement month = driver.findElement(By.id("month"));
				month.sendKeys("MAY");
				
		 WebElement year = driver.findElement(By.id("year"));
					year.sendKeys("1996");
				
//....................................................................................................
		// facebook Radio Button femail, mail
					
		WebElement rb = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[preceding-sibling::label[text()='Male']]"));
	                       rb.click();
//.........................................................................................                      
	                       
	                    
}
	

	
	}

	
		
	
