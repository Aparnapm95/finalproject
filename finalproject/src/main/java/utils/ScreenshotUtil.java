package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	 public static String captureScreenshot(WebDriver driver, String testName) {
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String dest = "screenshots/" + testName + ".png";
	        try {
	            Files.createDirectories(new File("screenshots").toPath());
	            Files.copy(src.toPath(), new File(dest).toPath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return dest;
	    }
}
