package com.gj.guice;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.inject.AbstractModule;

public class DummyModule extends AbstractModule {

	@Override
	protected void configure() {
		 bind(CloseableHttpClient.class)
	      .to(DefaultHttpClient.class);

	}

}
