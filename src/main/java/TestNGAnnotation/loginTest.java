package TestNGAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	static WebDriver driver;
	@BeforeSuite
	public static void driver()
	{
		//WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
	@Test (priority=1)
	public void openUrl()
	{
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	public void firstName()
	{
		driver.findElement(By.name("name")).sendKeys("Haridhanya");
	}
	@Test(priority=3)
	public void email()
	{
		driver.findElement(By.id("email")).sendKeys("aa@gmail.com");
	}
	@Test(priority=4)
	public void gender()
	{	
		driver.findElement(By.xpath("//*[text()='Female']")).click();
		
	}
	
	@Test(priority=5)
	public void phone()
	{	
		driver.findElement(By.id("mobile")).sendKeys("********");
		
	}
	@Test(priority=6)
	public void dob()
	{	
		driver.findElement(By.id("dob")).sendKeys("16-06-1998");
		
	}
	@Test(priority=7)
	public void subjects()
	{	
		driver.findElement(By.id("subjects")).sendKeys("English");
		
	}
	@Test(priority=8)
	public void hobby()
	{	
		driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
		
	}
	@AfterSuite
	public void close()
	{	
		driver.close();;
		
	}


	
	
}
