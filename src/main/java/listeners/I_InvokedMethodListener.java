package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class I_InvokedMethodListener implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		System.out.println("Preparing to activate method" + method.getTestMethod().getMethodName() + " " + "of Class: "
				+ result.getTestClass());

	}

	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		System.out.println("Activated method" + method.getTestMethod().getMethodName() + " " + "of Class: "
				+ result.getTestClass());

	}

}
