package com.example.demo.config;

import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DemoErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 403) {
//            System.out.println("retrying");
//            throw new RetryableException(response.status(),
//                    "Internal service error",
//                    response.request().httpMethod(),
//                    null,
//                    response.request());
            return new ArithmeticException("exception");
        } else {
            return new RuntimeException("error");
        }
    }
}
