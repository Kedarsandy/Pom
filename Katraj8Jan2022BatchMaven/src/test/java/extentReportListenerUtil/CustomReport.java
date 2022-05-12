package extentReportListenerUtil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReport {

	public static ExtentReports extents;

	public static ExtentReports extentReportGenerator() {
		String path = System.getProperty("user.dir") + "\\reports\\ProjectReport8Jan2022.html";
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(path);
		extentHtmlReporter.config().setReportName("Regression Suit");
		extentHtmlReporter.config().setDocumentTitle("8Jan 2022 batch Extent Report");
		extentHtmlReporter.config().setTheme(Theme.DARK);
		extentHtmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy,hh:mm a '('zzz')' ");

		extents = new ExtentReports();
		extents.setSystemInfo("OS", "Windows");
		extents.setSystemInfo("Browser", "Chrome");
		extents.setSystemInfo("Velocity", "8Jan2022 Katraj Batch Report");
		extents.attachReporter(extentHtmlReporter);
		return extents;
	}
}
