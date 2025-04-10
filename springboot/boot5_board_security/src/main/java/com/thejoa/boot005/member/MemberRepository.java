package com.thejoa.boot005.member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findByUsername(String username);
	
	/*
	 * @Query("insert into member m (m.username, m.password, m.email) values (username, password, email)"
	 * )
	 * 
	 * @Query("select m from Member m") List <Member> findAll();
	 */

	@Modifying
	@Transactional
	@Query("delete from Member m where m.id= :id and m.password= :password")
	int deleteByIdAndPass(@Param("id") Long id, @Param("password") String password);
	
	@Modifying
	@Transactional
	@Query("update Member m set m.password= :password where m.password=:old and m.id=:id")
	int updateByIdandPass(String password, String old, Long id);

}

// Q1. crud - sql구문적기


// Q2. @Query 아이디와 비번이 같은 유저의 비밀번호 변경
// 2-1 @Modifying @Transactional @Query
// update Member m set m.password=? where m.password




