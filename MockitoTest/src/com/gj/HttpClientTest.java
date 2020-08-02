package com.gj;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HttpClientTest {

	@Mock private ConfigurationService configurationService;
    @Mock private CloseableHttpClient client;
    @Mock private CloseableHttpResponse response;
    @Mock private HttpEntity entity;
	
	private HttpService httpService;
	
	@Before
	public void setUp() {
		httpService=new HttpService(configurationService,client);
	}
	
	@Test
	public void checkEntityUtils() throws Exception{
		when(configurationService.getCustomersUrl()).thenReturn("crap://test");
        when(client.execute(any(HttpUriRequest.class))).thenReturn(response);
        when(response.getEntity()).thenReturn(entity);
        
        InputStream stream = new ByteArrayInputStream("hello".getBytes());
        when(entity.getContent()).thenReturn(stream);
        String json = httpService.read();
        assertEquals("hello",json);
        //assertThat(json.get("hello")).isEqualTo("world");
	}
	
}
