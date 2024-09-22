package com.example.demo.service;

import com.example.demo.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    List<Location> getAll();
    Optional<Location> getById(Long id);
    Location save(Location location);
    void deleteAll();
    void deleteById(Long id);
}
