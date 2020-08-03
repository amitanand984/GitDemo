package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
WebDriver driver;
	public void InitializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\amit\\eclipse-workspace\\workspace\\E2EProject\\src\\main\\java\\Academy\\data.properties");
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		if(browserName=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName=="Firefox")
		{
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName=="Chrome")
		{
			System.setProperty("webdriver.ie.driver","C:\\IEdriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TIMEOUT.SECONDS)
			
			
		
	}
	
}
