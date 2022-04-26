package com.example.springboot.repository;

import com.example.springboot.Entity.Sanha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanhaRepository extends JpaRepository <Sanha, Long> {

}
