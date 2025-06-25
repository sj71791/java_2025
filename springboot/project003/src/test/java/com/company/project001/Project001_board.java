package com.company.project001;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.company.project001.board.BoardMapper;
import com.company.project001.domain.Board;
import com.company.project001.domain.Member;

@SpringBootTest  
class Project001_board {

	@Autowired BoardMapper boardMapper;
	
	@Disabled @Test
	public void test() {
		Member member = new Member();
		member.setId(74L); //실제 존재하는 member ID로 설정
		
		for (int i = 1; i<=100; i++) {
			Board board = new Board();
			board.setBtitle("테스트제목" + i);
			board.setBcontent("테스트내용" + i);
			board.setBfile("file" + i + ".jpg");
			board.setBip("127.0.0.1");
			board.setBpass("pass" + i);
			board.setBhit(0L);
			board.setMember(member);
			boardMapper.insert(board);
		}
		//3. findById
		//log.info("" + boardMapper.findById(1L));
		//2. findAllByOrderByDesc
		//log.info("" + boardMapper.findAllByOrderByDesc());
		//1. findAllPaged
		//log.info("" + boardMapper.findAllPaged(10, 0));
	}
	
	@Disabled @Test 
	public void test2() {
		//delete
		Board board2 = boardMapper.findAllByOrderedByDesc().get(10);
		boardMapper.deleteByIdAndBpass(board2);
		
		//update
		Board board = boardMapper.findAllByOrderedByDesc().get(10);
		board.setBtitle("수정된 제목 - new");
		board.setBcontent("수정된 내용 - new"); //아이디, pass
		boardMapper.updateByIdAndBpass(board);
	}
	
}







