package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.MallRepository;
import com.app.entity.Mall;

@Service
public class MallServiceImpl implements MallService {

    @Autowired
    private MallRepository mallRepository;
    
    @Override
    public List<Mall> findAll() {
        return mallRepository.findAll();
    }

    @Override
    public Mall findById(long id) {
        Mall mall = null;
        Optional<Mall> result = mallRepository.findById(id);
        if (result.isPresent()) {
            mall = result.get();
        }
        return mall;
    }

    @Override
    public Mall save(Mall mall) {
        return mallRepository.save(mall);
    }

    @Override
    public void deleteById(long id) {
        mallRepository.deleteById(id);
    }
}
