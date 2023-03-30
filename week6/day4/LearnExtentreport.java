package baseclass;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentreport {

	public static void main(String[] args) throws IOException {
	
	   //Step:1 Create folder for the report //empty file
		ExtentHtmlReporter reporter =new ExtentHtmlReporter("./record/report.html");
 
		//to have the history of report
		reporter.setAppendExisting(true);
     	//Step:2 To capture the report and log in the file
		ExtentReports extent=new ExtentReports();
		
		//step :3 attaching the file		
		extent.attachReporter(reporter);
		
     	// step:4 add the testcases
		ExtentTest createTest = extent.createTest("CreateLead Testcase","TC with Mandaortory fields");
		createTest.assignAuthor("Buvi");
		createTest.assignCategory("Regression Test");
		
		
		createTest.pass("Testcase is successfully executed",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/desktop.png").build());
		
		createTest.fail("Testcase is failed",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/desktop.png").build());
		
		
		//mandatory step to generate the report
		extent.flush();
	}

}
