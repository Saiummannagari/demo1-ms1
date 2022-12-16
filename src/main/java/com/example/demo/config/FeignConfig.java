package com.example.demo.config;

import feign.Capability;
import feign.Retryer;
//import feign.micrometer.MicrometerCapability;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

//    @Bean
//    public Retryer capability() {
//        return new MicrometerCapability();
//    }
}
