package com.caller;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.gj.AssertTest;
import com.gj.TestSuite;

public class TestSuiteRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestSuite.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
} 
