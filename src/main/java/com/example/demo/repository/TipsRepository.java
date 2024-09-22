package com.example.demo.repository;

import com.example.demo.model.Tips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipsRepository extends JpaRepository<Tips, Long> {
}
