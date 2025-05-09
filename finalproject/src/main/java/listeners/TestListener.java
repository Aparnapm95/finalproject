package listeners;



import base.BaseClass;
import utils.ExtentManager;

import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        String timestamp = String.valueOf(new Date().getTime());
        String screenshotPath = "screenshots/" + testName + "_" + timestamp + ".png";

        TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File(screenshotPath);

        try {
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot saved at: " + screenshotPath);
            ExtentManager.getTest().log(Status.FAIL, "Test Failed. Screenshot attached.");
            ExtentManager.getTest().addScreenCaptureFromPath(screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Optional: Implement other methods if needed
    @Override public void onTestStart(ITestResult result) {}
    @Override public void onTestSuccess(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
}
