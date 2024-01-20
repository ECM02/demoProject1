package demoProject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.*;
import org.testng.annotations.*;

public class TestClass1 {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\barit\\Desktop\\Selenium\\chromedriver.exe");
		 ChromeOptions opt=new ChromeOptions();
		 opt.setBinary("C:\\Users\\barit\\Desktop\\Selenium\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().fullscreen();
	}
	@Test
	public void Test1()
	{
		driver.navigate().to("http://www.AutomationTalks.com");
		System.out.println("Test1 title : "+driver.getTitle());
	}
	@Test
	public void Test2()
	{
		driver.navigate().to("http://www.AutomationTalks.com");
		System.out.println("Test2 title : "+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.navigate().to("http://www.AutomationTalks.com");
		System.out.println("Test3 title : "+driver.getTitle());
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
