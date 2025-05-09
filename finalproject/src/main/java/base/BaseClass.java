package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import utils.ConfigReader;

public class BaseClass {
	 public static WebDriver driver;
	 
	 @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get(ConfigReader.getProperty("url"));
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
}
