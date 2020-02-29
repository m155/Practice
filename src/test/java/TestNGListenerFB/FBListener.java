package TestNGListenerFB;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Browsers;

public class FBListener extends Browsers implements ITestListener {

	@Override
	public void onTestSuccess (ITestResult result) {
		try {
			screenshots("C:\\Users\\Anis\\eclipse-workspace\\FuntionalGroup\\ScreenShots\\Passed\\");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestFailure (ITestResult result) {
		try {
			screenshots("C:\\Users\\Anis\\eclipse-workspace\\FuntionalGroup\\ScreenShots\\Failed\\");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
