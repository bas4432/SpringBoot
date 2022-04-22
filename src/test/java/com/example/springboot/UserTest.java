package com.example.springboot;

import com.example.springboot.Entity.Member;
import com.example.springboot.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest extends ApplicationTests{
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void create(){

        Member member = new Member();

        member.setId(4l);
        member.setName("ㅉㅉㅉ");

        Member newmem = memberRepository.save(member);
    }

}
