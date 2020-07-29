package com.gj.multilevel;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public abstract class TestMocks {

	@InjectMocks
	Config cn;
	
	@Mock
	SubConfig subConfig;
	
	
	
	@Before
	public void setup() {
	System.out.println("here");
	}
	
	
	
}
