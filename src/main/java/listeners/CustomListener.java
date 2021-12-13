package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class CustomListener  implements ITestListener{

    private static final String TakesScreenshot = null;
	WebDriver driver; 

	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		System.out.println("test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println(" Test passed ");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("failed..");
		
	}
	
//	 @Override
//	    public void onTestFailure(ITestResult result) {
//	    	System.out.println("***** Error "+result.getName()+" test has failed *****");
//	    	String methodName=result.getName().toString().trim();
//	        ITestContext context = result.getTestContext();
//	       WebDriver driver = (WebDriver)context.getAttribute("driver");
//	    	try {
//				takeScreenShot(methodName, driver);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	    }
//	    
//	    public void takeScreenShot(String methodName, WebDriver driver) throws IOException {
//
//	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//	         //The below method will save the screen shot in d drive with test method name 
//	            try {
//					String filePath = "C:\\Users\\ACER\\eclipse-workspace\\Pom\\screenshots";
//					FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
//					System.out.println("***Placed screen shot in "+filePath+" ***");
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//	            
//	            
//	    }
//	    
//	    
	


	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		System.out.println("test skipped");

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		System.out.println("test suite begun ");

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		System.out.println("test suite completed ");

	}


//	


	 }
