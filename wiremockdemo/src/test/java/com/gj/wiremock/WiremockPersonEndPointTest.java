package com.gj.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

@SpringBootTest
class WiremockPersonEndPointTest {

	private WireMockServer server=null;
	private CloseableHttpClient httpClient = HttpClients.createDefault();
	private static ObjectMapper mapper = new ObjectMapper();
	
	@BeforeEach
	public void   setup() throws IOException {
		
		WireMockConfiguration config=options().port(9000).containerThreads(10).stubCorsEnabled(true);
		server=new WireMockServer(config);
		
		//server.configureFor("localhost", 9001);
		Resource stateFile = new ClassPathResource("person.json");
	 	String personData=getString(stateFile.getInputStream());
	 	
	 	JsonNode node=mapper.readTree(stateFile.getInputStream());
		//following does not work
		//com.github.tomakehurst.wiremock.client.WireMock.configureFor("localhost",9000);
		server.stubFor(
				 get("/person/1234").withHeader(HttpHeaders.CONTENT_TYPE.toString(), equalTo(MediaType.APPLICATION_JSON_VALUE))
				 .willReturn(aResponse()
						     .withStatus(200)
						     .withHeader(HttpHeaders.CONTENT_TYPE.toString(), MediaType.APPLICATION_JSON_VALUE)
						     .withJsonBody(node)
						     //.withBody("Hello!!!")
						    )
					);
		server.start();
	}
	
	@Test
	public void dependent_PersonService_get() throws Exception {
		configureFor("localhost", 9000); //needed for the verify
		assertThat(server).isNotNull();
		assertThat(server.getOptions().portNumber()).isNotNull().isEqualTo(9000);
		HttpGet getReq=new HttpGet("http://localhost:9000/person/1234");
		getReq.addHeader(HttpHeaders.CONTENT_TYPE.toString(), MediaType.APPLICATION_JSON_VALUE);
		HttpResponse resp=httpClient.execute(getReq);
		verify(1,getRequestedFor(urlEqualTo("/person/1234")).withHeader(HttpHeaders.CONTENT_TYPE.toString(), equalTo(MediaType.APPLICATION_JSON_VALUE)));
		assertThat(resp).isNotNull();
		assertThat(resp.getStatusLine().getStatusCode()).isEqualTo(200);
		
		String message=convertResponseToString(resp);
		assertThat(message).isNotNull().contains("ganesh");
		
	}
	
	private static String convertResponseToString(HttpResponse response) throws IOException {
        InputStream responseStream = response.getEntity().getContent();
        Scanner scanner = new Scanner(responseStream, "UTF-8");
        String stringResponse = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return stringResponse;
    }
   private static String getString(InputStream inStream) {
	   Scanner sc = new Scanner(inStream);
	      //Reading line by line from scanner to StringBuffer
	      StringBuffer sb = new StringBuffer();
	      while(sc.hasNext()){
	         sb.append(sc.nextLine());
	      }
	      return sb.toString();
   }
	
	@AfterEach
	public void cleanUp() {
		server.stop();
	}
}
