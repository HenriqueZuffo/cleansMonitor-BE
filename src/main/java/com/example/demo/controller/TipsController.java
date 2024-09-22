package com.example.demo.controller;

import com.example.demo.model.Tips;
import com.example.demo.service.TipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/tips")
@RestController
public class TipsController {
    @Autowired
    private TipsService tipsService;

    @GetMapping
    public List<Tips> getAll(){
        return tipsService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Tips> getById(@PathVariable Long id){
        return tipsService.getById(id);
    }

    @PostMapping
    public Tips save(@RequestBody Tips tip){
        return tipsService.save(tip);
    }

    @DeleteMapping
    public void deleteAll(){
        tipsService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        tipsService.deleteById(id);
    }
}
