package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Store {

    int id;
    String storeName;

    public Store() {
    }

    public Store(int id, String store) {
        this.id = id;
        this.storeName = store;
    }

    public String toString() {
        return "id :: "+this.id+"storename :: "+this.storeName;
    }
}
