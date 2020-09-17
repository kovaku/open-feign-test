package org.github.kovaku.openfeign;

import org.github.kovaku.openfeign.controller.EchoRequestBody;
import org.github.kovaku.openfeign.service.PostmanEchoResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OpenFeignTestApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testEcho() {
		//Given
		var echoRequestBody = new EchoRequestBody();
		echoRequestBody.setParam("first;second");

		//When
		var response = restTemplate.postForEntity("/post", echoRequestBody, PostmanEchoResponse.class);

		//Then
		//Test passes from Hoxton.SR3
		assertThat(response.getBody().getUrl(), equalTo("https://postman-echo.com/get?param=first%3Bsecond"));
	}

}
