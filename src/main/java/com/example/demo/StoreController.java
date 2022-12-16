package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoreController {

    private final StoreImpl impl;

    public StoreController(StoreImpl impl) {
        this.impl = impl;
    }

    @GetMapping("/get")
    public List<Store> get() {
       return impl.getStores();
    }

    @GetMapping("/s3")
    public String gets3() {
        return "Uploaded From S3";
    }
}
