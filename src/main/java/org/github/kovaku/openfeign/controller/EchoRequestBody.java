package org.github.kovaku.openfeign.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EchoRequestBody {
    @JsonProperty("param")
    private String param;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
