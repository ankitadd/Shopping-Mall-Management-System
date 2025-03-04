package com.app.service;

import java.util.List;

import com.app.entity.Mall;

public interface MallService {
    
    List<Mall> findAll();

    Mall findById(long id);

    Mall save(Mall mall);

    void deleteById(long id);
}
