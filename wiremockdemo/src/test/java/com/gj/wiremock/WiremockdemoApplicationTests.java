package com.gj.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

@SpringBootTest
class WiremockdemoApplicationTests {

	private WireMockServer server=null;
	private CloseableHttpClient httpClient = HttpClients.createDefault();
	@BeforeEach
	public void   setup() {
		
		WireMockConfiguration config=options().port(9000).containerThreads(10).stubCorsEnabled(true);
		server=new WireMockServer(config);
		
		//server.configureFor("localhost", 9001);
		
		//following does not work
		//com.github.tomakehurst.wiremock.client.WireMock.configureFor("localhost",9000);
		server.stubFor(get("/greet").willReturn(aResponse().withStatus(200).withBody("Hello!!!")));
		server.start();
	}
	
	@Test
	public void dependent_PersonService_get() throws Exception {
		assertThat(server).isNotNull();
		assertThat(server.getOptions().portNumber()).isNotNull().isEqualTo(9000);
		HttpGet getReq=new HttpGet("http://localhost:9000/greet");
		HttpResponse resp=httpClient.execute(getReq);
		assertThat(resp).isNotNull();
		assertThat(resp.getStatusLine().getStatusCode()).isEqualTo(200);
		
		String message=convertResponseToString(resp);
		assertThat(message).isNotNull().contains("Hello");
		
	}
	
	private static String convertResponseToString(HttpResponse response) throws IOException {
        InputStream responseStream = response.getEntity().getContent();
        Scanner scanner = new Scanner(responseStream, "UTF-8");
        String stringResponse = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return stringResponse;
    }
	@AfterEach
	public void cleanUp() {
		server.stop();
	}
}
