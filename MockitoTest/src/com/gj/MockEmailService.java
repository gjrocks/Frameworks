package com.gj;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockEmailService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Mock
	EmailImpl mockService;
	
	
@Test(expected=ValidationException.class)
	public void testEmail() throws Exception {
		String g = null;
		Mockito.when(mockService.sendEmail(Mockito.anyString(), Mockito.any(String.class), Mockito.any(String.class))).thenReturn(true);
		// Mockito.when(mockService.sendEmail("", "", g)).thenThrow(new
		// Exception("yede"));

		// Mockito.doReturn(true).when(mockService).sendEmail("", "", "");
		MockCallerService s = new MockCallerService();
		s.setEmailer(mockService);
		Assert.assertFalse(s.doCommunicate(null, "b", ""));
		Assert.assertFalse(s.doCommunicate("", "", g));

		s.doCommunicate("a@a.com", "b@b.com", "");
		//it is imp to do some behaviour testing, to check if the mock method was called or not. This does not test result of the method, just call recording verification
		
		verify(mockService,atLeastOnce()).sendEmail(Mockito.anyString(), Mockito.any(String.class), Mockito.any(String.class));
         
	}

@Test
public void testEmail2() throws Exception {
	String g = null;
	Mockito.when(mockService.sendEmail(Mockito.anyString(), Mockito.any(String.class), Mockito.any(String.class))).thenReturn(true);
	MockCallerService s = new MockCallerService();
	s.setEmailer(mockService);
	Assert.assertTrue(s.doCommunicate("w@w.com", "b@b.com", "ganesh"));

}

@Test
public void testSpy(){
	
	//@Spy or the spy() method can be used to wrap a real object. 
	//Every call, unless specified otherwise, is delegated to the object.
	//so using spy u should use  doReturn..when doThrow..when
	
	List<String> names=new ArrayList<>();
	
	List<String> spynames=spy(names);
	//no use of doreturn or dothrow, so calls are delegated to actual list, 
	//it will fail with regular indexoutofbound
   
	//assertEquals("ganesh",spynames.get(0));
	
	doReturn("ganesh").when(spynames).get(0);
	
	assertEquals("ganesh",spynames.get(0));
	
	
}



}
