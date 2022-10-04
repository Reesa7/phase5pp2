package TestNg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration_Automation {
  
	String driverPath="C:\\Users\\reesa\\AppData\\Local\\Temp\\Temp1_chromedriver_win32.zip\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().window().maximize();
	  driver.get("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.id("user_full_name")).sendKeys("kusum");
		
		driver.findElement(By.id("user_email_login")).sendKeys("kusum49271@gmail.com");
		
		driver.findElement(By.id("user_password")).sendKeys("Kusum@123");
		
		driver.findElement(By.id("tnc_checkbox")).click();
		
		driver.findElement(By.name("commit")).click();
		
		driver.findElement(By.name("commit")).click();
			
		
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\reesa\\AppData\\Local\\Temp\\Temp1_chromedriver_win32.zip\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
  
  }
	
	
}