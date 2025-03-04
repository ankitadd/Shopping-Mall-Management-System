package com.app.service;

import java.util.List;

import com.app.entity.Shop;

public interface ShopService {
    
    List<Shop> findAll();

    Shop findById(int id);

    Shop save(Shop shop);

    void deleteById(int id);
}
