package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
}
