package Casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility_Class {
	static WebDriver driver;
	
	public static WebDriver startBrowser(String url)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.05.01\\Desktop\\chromedriver_win32\\chromedriver.exe");
 	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
	}
}
