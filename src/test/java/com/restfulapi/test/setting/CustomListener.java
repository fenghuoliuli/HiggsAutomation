package com.restfulapi.test.setting;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;



public class CustomListener extends TestListenerAdapter{
    private int m_count = 0;
	@Override
	public void onTestStart(ITestResult tr) {
		log("Test Started....");
		
	}
    @Override
    public void onTestFailure(ITestResult tr) {
        log(tr.getName()+ "--FAILED\n");
        System.out.println(".....");
    }
	 
    @Override
    public void onTestSkipped(ITestResult tr) {
        log(tr.getName()+ "--SKIPPED\n");
        System.out.println(".....");
    }
	 
    @Override
    public void onTestSuccess(ITestResult tr) {
        log(tr.getName()+ "--SUCCESS\n");
        System.out.println(".....");
    }
	 
    private void log(String string) {
        System.out.print(string);
        if (++m_count % 40 == 0) {
	    System.out.println("");
        }
    }


}
