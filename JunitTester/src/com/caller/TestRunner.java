package com.caller;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.gj.AssertTest;
import com.gj.TestAssert2;
import com.gj.TestExceptions;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestExceptions.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
} 
