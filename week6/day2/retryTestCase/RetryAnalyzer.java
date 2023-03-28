package retryTestCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryAnalyzer implements IRetryAnalyzer,IAnnotationTransformer{

	
	int count=0;
	int retry=1;
	public boolean retry(ITestResult result) {
		
		
		if(count<retry) {
			count++;
			return true;
		}
		return false;
	}
	
	
	public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		   
		annotation.setRetryAnalyzer(retryTestCase.RetryAnalyzer.class);
		  }

}
