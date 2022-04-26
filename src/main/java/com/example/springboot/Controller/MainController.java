package com.example.springboot.Controller;


import com.example.springboot.Entity.Yanolja;
import com.example.springboot.Service.HotelService;
import com.example.springboot.dto.CompanyDto;

import com.example.springboot.repository.SanhaRepository;
import com.example.springboot.repository.YanoljaRepository;
import org.springframework.web.bind.annotation.*;

@RestController

public class MainController {


    private final HotelService hotelService;

    public MainController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping ( "/company/get/{id}")
    public String get(@PathVariable ("id") Long id ){

        return hotelService.get(id);
    }

    @PostMapping("/company/join")
    public Yanolja insert(@RequestBody CompanyDto companyDto) {

        return hotelService.insert(companyDto);
    }

    @PutMapping("/company/update/{id}")
    public void update(@PathVariable Long id) {

        hotelService.update(id);
    }

    @DeleteMapping("/company/delete/{id}")
    public void delete(@PathVariable Long id) {

        hotelService.delete(id);
    }










}
