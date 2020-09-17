package org.github.kovaku.openfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "echo-client", url = "${echo.server.url}", configuration = ClientConfiguration.class)
public interface PostmanEchoClient {

    @GetMapping(path = "/get")
    String echo(@RequestParam String param);

}
