package com.example.springboot.Service;

import com.example.springboot.Entity.Sanha;
import com.example.springboot.Entity.TopAndDown;
import com.example.springboot.Entity.Yanolja;
import com.example.springboot.dto.CompanyDto;
import com.example.springboot.repository.SanhaRepository;
import com.example.springboot.repository.YanoljaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class HotelService {

    private final YanoljaRepository yanoljaRepository;
    private final SanhaRepository sanhaRepository;

    public HotelService(SanhaRepository sanhaRepository, YanoljaRepository yanoljaRepository) {
        this.sanhaRepository = sanhaRepository;
        this.yanoljaRepository = yanoljaRepository;
    }

    @Transactional
    public Yanolja insert(CompanyDto companyDto)  {

        Sanha sanha = new Sanha(companyDto.sanhaname, companyDto.topAndDown);

        Yanolja yanolja = new Yanolja(companyDto.yanoljaName, sanha);
        return yanoljaRepository.save(yanolja);
    }

    @Transactional(readOnly = true)
    public String get(Long id) {

        Sanha sanha = sanhaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("resource not found")
        );

        return sanha.getId() + "+" + sanha.getYanolja().getName();
    }

    @Transactional
    public void update (Long id){

        Sanha sanha = sanhaRepository.findById(id).orElseThrow(
                () -> new RuntimeException("resource not found")
        );

        sanha.setName("Sanhatest");
        sanha.setTopAndDown(TopAndDown.DOWN);
    }

    @Transactional
    public void delete(Long id){

        yanoljaRepository.deleteById(id);
    }



}
