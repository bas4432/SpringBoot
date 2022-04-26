package com.example.springboot.repository;

import com.example.springboot.Entity.Yanolja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YanoljaRepository extends JpaRepository <Yanolja, Long> {

}
