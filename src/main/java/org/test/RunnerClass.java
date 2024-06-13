package org.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
	@Test
	public void tc() {
		Result c = JUnitCore.runClasses(B.class, TestClass.class, A.class);
		System.out.println("Total test case run count : " + c.getRunCount());
		System.out.println("Total test case run time : " + c.getRunTime());
		System.out.println("Total Failure : " + c.getFailureCount());
		System.out.println("Total ignore count : " + c.getIgnoreCount());
		
		List<Failure> list = c.getFailures();
		for (Failure f : list) {
			System.out.println(f);
			
		}

	}

}
