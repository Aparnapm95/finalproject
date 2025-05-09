package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	 private static ExtentReports extent;

	    public static ExtentReports getReportInstance() {
	        if (extent == null) {
	            ExtentSparkReporter reporter = new ExtentSparkReporter("reports/AdactinTestReport.html");
	            reporter.config().setReportName("Adactin Hotel Automation Report");
	            reporter.config().setDocumentTitle("Test Report");

	            extent = new ExtentReports();
	            extent.attachReporter(reporter);
	            extent.setSystemInfo("Project", "Adactin Hotel Automation");
	            extent.setSystemInfo("Tester", "Your Name");
	        }
	        return extent;
	    }
}
