package Testcov;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listernes1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc exce started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc succesfully ececuted");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc failed to exce");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
	}

}
