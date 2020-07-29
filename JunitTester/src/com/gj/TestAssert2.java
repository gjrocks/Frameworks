package com.gj;

import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

//@Ignore
public class TestAssert2 {
	//@Ignore
	@Test(timeout=10)
	public void test2() {
		long j=0;
		for(Long i=0l;i<12000978770l;i++){
			j++;
			
		}
		System.out.println("ganesh");
		//fail("ganesh");
	}
}
