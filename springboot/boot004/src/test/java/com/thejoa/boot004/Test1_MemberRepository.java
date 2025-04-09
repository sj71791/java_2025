package com.thejoa.boot004;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot004.member.Member;
import com.thejoa.boot004.member.MemberRepository;

@SpringBootTest
class Test1_MemberRepository {
	@Autowired MemberRepository memberRepository;
	
	//insert, update - save
	//select - findAll, findById
	//delete - delete
	
	@Disabled @Test void insert() {
		Member member=new Member();
		member.setEmail("first@gmail.com");
		member.setPassword("1111");
		member.setUsername("first");
		memberRepository.save(member);
	}
	@Disabled @Test void findAll() {
		List<Member> list=memberRepository.findAll();
		System.out.println(list);
	}
	@Disabled @Test void findId() {
		System.out.println(memberRepository.findById(1L).get());
	}
	@Disabled @Test void findUsername() {
		System.out.println(memberRepository.findByUsername("first").get());
	}
	
	@Disabled @Test void update() {
		Member member=memberRepository.findById(1L).get();
		member.setEmail("first@naver.com");
		member.setUsername("one");
		memberRepository.save(member);
	}
	@Disabled @Test void updatePassword() {
		memberRepository.updateByIdandPass("1234", "0000", 1L); //0000 → 1234
	}
	@Test void delete() {
		Member member = memberRepository.findById(1L).get();
		memberRepository.delete(member);
	}
	
}
