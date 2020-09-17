package org.github.kovaku.openfeign.service;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class ClientConfiguration {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
