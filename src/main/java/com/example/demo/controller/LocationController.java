package com.example.demo.controller;

import com.example.demo.model.Location;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/location")
@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping
    public List<Location> getAll(){
        return locationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Location> getById(@PathVariable Long id){
        return locationService.getById(id);
    }

    @PostMapping
    public Location save(@RequestBody Location location){
        return locationService.save(location);
    }

    @DeleteMapping
    public void deleteAll(){
        locationService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        locationService.deleteById(id);
    }

}
