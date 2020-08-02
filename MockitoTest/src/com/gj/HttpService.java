package com.gj;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpService {

	 private  ConfigurationService configurationService;
	    private CloseableHttpClient client;
	    public HttpService(ConfigurationService configurationService, CloseableHttpClient client) {
	        this.configurationService = configurationService;
	        this.client = client;
	    }
	    public String read() throws IOException {
	        String url = configurationService.getCustomersUrl();
	        HttpGet get = new HttpGet(url);
	        try (CloseableHttpResponse response = client.execute(get)) {
	            HttpEntity entity = response.getEntity();
	            String result = EntityUtils.toString(entity);
	            return result;
	        }
	    }
	
}
