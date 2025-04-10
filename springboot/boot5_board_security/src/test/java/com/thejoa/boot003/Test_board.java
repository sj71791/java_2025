package com.thejoa.boot003;

import java.net.InetAddress;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.thejoa.boot005.board.Board;
import com.thejoa.boot005.board.BoardRepository;
import com.thejoa.boot005.member.Member;
import com.thejoa.boot005.member.MemberRepository;

@SpringBootTest
public class Test_board {
	@Autowired BoardRepository boardRepository;
	@Autowired MemberRepository memberRepository;
	
	@Test
	public void insertBoard() {
		Member member=new Member(); member.setId(1L);
		Board board=new Board();
		board.setBtitle("title-1");
		board.setBcontent("content-1");
		board.setBpass("1111");
		board.setBfile("1.jpg");
		
		try {
			board.setBip(InetAddress.getLocalHost().getHostAddress());
			
		}catch(Exception e) {e.printStackTrace();}
		board.setMember(member);
		boardRepository.save(board);
	}
	
	@Disabled //@Test
	public void selectBoard() {
		List<Board> list2=boardRepository.findAll();
		System.out.println(list2.get(0).getBtitle());
	}
	
	@Disabled //@Test
	public void findByIdBoard() {
		Optional<Board> findBoard= boardRepository.findById(1L);		
		
		if(findBoard.isPresent()) {
			Board board=findBoard.get();
			System.out.println(board.getBtitle());
		}
	}//find-select / save- insert, update / delete-delete
	
	@Disabled //@Test
	public void updateBoard() {
		Optional<Board> findBoard= boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board=findBoard.get();
			board.setBtitle("title-new");
			board.setBcontent("content-new");
			boardRepository.save(board);
		}
	}
	@Disabled //@Test 
	public void deleteBoard() {
		Optional<Board> findBoard = boardRepository.findById(1L);
		if(findBoard.isPresent()) {
			Board board=findBoard.get();
			boardRepository.delete(board);
		}
	}
}




