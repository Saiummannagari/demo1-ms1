package com.example.demo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StoreImpl {

    @Autowired
    StoreClient client;

    @CircuitBreaker(name="demo")
    public List<Store> getStores() {
        System.out.println("connecting to ms :: ");
//        List<Store> stores = client.getStores();
//        for(Store s: stores) {
//            System.out.println(s.getId()+" "+s.getStoreName());
//        }
//        System.out.println("stores :: "+stores);
        return Arrays.asList(new Store(1, "Franklin"),new Store(2, "USA"));
    }

}
