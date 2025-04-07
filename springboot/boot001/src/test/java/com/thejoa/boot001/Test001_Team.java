package com.thejoa.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot001.myjpa.Member;
import com.thejoa.boot001.myjpa.MemberRepository;
import com.thejoa.boot001.myjpa.Team;
import com.thejoa.boot001.myjpa.TeamRepository;

@SpringBootTest
class Test001_Team {

	@Autowired TeamRepository teamRepository;
	//@Autowired MemberRepository memberRepository ;
	 
	
	// teamRepository - save (insert, update) / teamRepository.delete-(delete)
	// teamRepository - findAll() select      / teamRepository.findById (select)
	
	@Disabled @Test
	public void insert() {
		Team team=new Team();
		team.setName("avengers");
		teamRepository.save(team);
	}
	@Disabled //@Test
	public void selectAll() {
		List<Team> list=teamRepository.findAll();
		System.out.println(list.size());
		System.out.println(list.get(0).getName());
	}
	
	@Disabled //@Test
	public void update() {
		//1. 수정할 팀찾기
		// Optional<Team> - null 값 안전보장
		Optional<Team> findTeam = teamRepository.findById(1L);
		System.out.println(findTeam.isPresent());	//true
		
		//2. 이름변경해서 수정
		Team team = findTeam.get();
		team.setName("avenger");
		teamRepository.save(team);	// save : insert, update
	}
	
	@Disabled //@Test
	public void delete() {
		Optional<Team> findTeam = teamRepository.findById(2L);
		System.out.println(findTeam.isPresent());	//true
		
		Team team = findTeam.get();
		teamRepository.delete(team);
	}
	
	/* 
	@Test 
	public void insert_member() {
		Team team=new Team();
		team.setId(1L);
		//team.setId(2L);//##1  error team의 id가 2L 없어서 오류남.
		
		Member member=new Member();
		member.setName("first");
		member.setAge(11);
//		member.setName("second");
//		member.setAge(22);
		member.setTeam(team);//##2
		memberRepository.save(member); //#insert,update - save
	}*/
	
}
//crud1. insert into team (name) values("milk")
//crud2. select * from team / select * from team where id=?
//crud1. update set name=? where id=?
//crud1. delete from team where id=?