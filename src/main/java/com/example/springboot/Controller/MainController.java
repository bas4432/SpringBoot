package com.example.springboot.Controller;


import com.example.springboot.Entity.Member;
import com.example.springboot.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {


    private MemberRepository memberRepository;

    @GetMapping ( "/company/id")
    public String first(@RequestBody Member member){

        member.setId(1l);
        member.setName("박진우");

        Member member2 = new Member();
        member2.setId(2L);
        member2.setName("정인욱");
        System.out.println("여기");

        Member member1 = memberRepository.save(member);
        Member member3 = memberRepository.save(member2);


        return member1.getName() + " + " + member3.getName();
        //feat
    }





}
