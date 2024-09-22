package com.example.demo.service;

import com.example.demo.model.Tips;

import java.util.List;
import java.util.Optional;

public interface TipsService {
    List<Tips> getAll();
    Optional<Tips> getById(Long id);
    Tips save(Tips tip);
    void deleteAll();
    void deleteById(Long id);
}
