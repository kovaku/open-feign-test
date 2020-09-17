package org.github.kovaku.openfeign.controller;

import org.github.kovaku.openfeign.service.PostmanEchoClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    private final PostmanEchoClient echoClient;

    public EchoController(PostmanEchoClient echoClient) {
        this.echoClient = echoClient;
    }

    @PostMapping(value = "/post", produces = "application/json")
    public String callEcho(@RequestBody EchoRequestBody body) {
        return echoClient.echo(body.getParam());
    }
}
