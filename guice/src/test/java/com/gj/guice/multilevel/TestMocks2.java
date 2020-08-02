package com.gj.guice.multilevel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

/*@RunWith(MockitoJUnitRunner.class)*/
public class TestMocks2 extends TestMocks{

	
	@InjectMocks
	Service service;
	
	@Before
	public void setup() {
		super.setup();
		service.setConfig(cn);
		Mockito.when(subConfig.getUrl()).thenReturn("ganesh");
	}
	
	
	@Test
	public void test() {
	assertNotNull(service);
	assertNotNull(service.getConfig());
	assertNotNull(service.getConfig().getSubConfig());
	assertEquals("testganesh",service.send("test"));
	}
}
