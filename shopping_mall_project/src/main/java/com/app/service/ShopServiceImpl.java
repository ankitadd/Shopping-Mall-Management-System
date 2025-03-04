package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ShopRepository;
import com.app.entity.Shop;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;
    
    @Override
    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

    @Override
    public Shop findById(int id) {
        Shop shop = null;
        Optional<Shop> result = shopRepository.findById(id);
        if (result.isPresent()) {
            shop = result.get();
        }
        return shop;
    }

    @Override
    public Shop save(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public void deleteById(int id) {
        shopRepository.deleteById(id);
    }
}
