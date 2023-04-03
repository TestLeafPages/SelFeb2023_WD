package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadIntegraWithCreateLead;

public class BaseClass extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> tldriver = new ThreadLocal<RemoteWebDriver>();
	public static ExtentReports extent;
	public static ExtentTest createTest, createNode;

	public RemoteWebDriver getDriver() {
		return tldriver.get();
	}

	public void setDriver() {
		tldriver.set(driver);
	}

	public RemoteWebDriver driver;
	public String datafile;
	public String testName,test, testDesc, author, category;

	@BeforeMethod
	public void perCondition() {
		createNode = createTest.createNode(test);
		driver = new ChromeDriver();
		setDriver();
		System.out.println(driver);
		System.out.println(Thread.currentThread().getId());
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./CustomizedReport/report.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		System.out.println("Started to generte Report");
	}

	@BeforeClass
	public void testDetails() {
		createTest = extent.createTest(testName, testDesc);
		createTest.assignAuthor(author);
		createTest.assignCategory(category);
	}

	public void reportStep(String status, String stepDesc) throws IOException {
		if (status.equalsIgnoreCase("Pass")) {
			createNode.pass(stepDesc,
					MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/shot" + takeSnap() + ".png").build());
		} else if (status.equalsIgnoreCase("Fail")) { // snapshot/shot1234.png
			createNode.fail(stepDesc,
					MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/shot" + takeSnap() + ".png").build());
			throw new RuntimeException("Method is failed");
		}
	}

	public int takeSnap() throws IOException {
		int random = (int) (Math.random() * 99999);
		File source = getDriver().getScreenshotAs(OutputType.FILE);
		File destn = new File("./snapshot/shot" + random + ".png");
		FileUtils.copyFile(source, destn);
		return random;
	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

	@DataProvider(name = "fetch")
	public String[][] fetchData() throws IOException {
		return ReadIntegraWithCreateLead.readData(datafile);
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
		System.out.println("End of report");
	}
}
