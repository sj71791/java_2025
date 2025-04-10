package com.thejoa.boot003.board;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BoardRepository extends JpaRepository<Board, Long> {
	//1. @Query 테이블명 사용 : Board - select
	//@Query(value="select * from board order by id desc", nativeQuery=true);
	@Query("select b from Board b order by id desc")
	List <Board> findAllByOrderByDesc();
	 
	//2. insert, update, delete - @Modifying, @Transactional, @Query
	@Modifying	   //2-1. 삽입, 수정, 삭제 쿼리는 변경작업
	@Transactional //2-2. rollback 활성화 
	@Query("delete from Board b where b.id= :id and b.bpass= :bpass")
	int deleteByIdAndBpass(@Param("id") Long id, @Param("bpass") String bpass);
	//2-3. @Param("id") 쿼리의 변수명과 동일하면 생략가능
	//2-4. deleteByIdAndBpass( Board board ) X 객체파라미터 지원안함.
	
	@Modifying
	@Transactional
	@Query("update Board b set b.btitle= :btitle, b.bcontent= :bcontent where b.id=:id and b.bpass= :bpass")
	int updateByIdandBpass(Long id, String bpass, String btitle, String bcontent);
	
	
}
/*
글검색부분은  작성자 및 글제목으로도 가능하게 [도전!]
※ 참고)
select  distinct b  
from Board b  left  join   Member m  on  b.member = m
where    b.title       like  %:key%  
       or  b.content  like  %:key%  
       or  m.name    like  %:key%  
*/