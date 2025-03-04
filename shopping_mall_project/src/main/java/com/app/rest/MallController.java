package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Mall;
import com.app.service.MallService;

@RestController
@RequestMapping("/api/malls")
public class MallController {

    @Autowired
    private MallService mallService;

    @PostMapping
    public ResponseEntity<Mall> addMall(@RequestBody Mall mall) {
        Mall savedMall = mallService.save(mall);
        return new ResponseEntity<>(savedMall, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Mall> findAll() {
        return mallService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mall> getMall(@PathVariable long id) {
        Mall mall = mallService.findById(id);
        if (mall != null) {
            return new ResponseEntity<>(mall, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mall> updateMall(@PathVariable long id, @RequestBody Mall mall) {
        mall.setId(id);
        Mall updatedMall = mallService.save(mall);
        return new ResponseEntity<>(updatedMall, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMall(@PathVariable long id) {
        mallService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
