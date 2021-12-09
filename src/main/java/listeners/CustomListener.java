package listeners;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class CustomListener  implements ITestListener{

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
		System.out.println("pass");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("failed..");

	}

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
		System.out.println("test started");

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		System.out.println("test completed");

	}

//	@AfterMethod //AfterMethod annotation - This method executes after every test execution
//	public void screenShot(ITestResult result){
//	//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
//		if(ITestResult.FAILURE==result.getStatus()){
//			try{
//				TakesScreenshot driver = null;
//				// To create reference of TakesScreenshot
//				TakesScreenshot screenshot=(TakesScreenshot)driver;
//				// Call method to capture screenshot
//				File src=screenshot.getScreenshotAs(OutputType.FILE);
//				// Copy files to specific location 
//				// result.getName() will return name of test case so that screenshot name will be same as test case name
//				FileUtils.copyFile(src, new File("C:\\Users\\ACER\\eclipse-workspace\\Pom\\screenshots"+result.getName()+".png"));
//				System.out.println("Successfully captured a screenshot");
//			}catch (Exception e){
//				System.out.println("Exception while taking screenshot "+e.getMessage());
//			} 
//	}
//	}
//	


	 }
