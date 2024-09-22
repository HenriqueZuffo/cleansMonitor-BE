package com.example.demo.service;

import com.example.demo.model.Tips;
import com.example.demo.repository.TipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipsServiceImpl implements TipsService{
    @Autowired
    private TipsRepository tipsRepository;

    @Override
    public List<Tips> getAll() {
        return tipsRepository.findAll();
    }

    @Override
    public Optional<Tips> getById(Long id) {
        return tipsRepository.findById(id);
    }

    @Override
    public Tips save(Tips tip) {
        return tipsRepository.save(tip);
    }

    @Override
    public void deleteAll() {
        tipsRepository.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        tipsRepository.deleteById(id);
    }
}
