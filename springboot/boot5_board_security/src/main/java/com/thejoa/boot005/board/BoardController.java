package com.thejoa.boot005.board;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thejoa.boot005.member.Member;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	// ver-1 @Autowired BoardService service;
	private final BoardService service;
	
	@GetMapping("/board/list")
	public String list(Model model){
		model.addAttribute("list", service.findALl()); //전체리스트뽑고
		return "board/list"; //board폴더안에 / list파일
	} //http://localhost:8383/board/list
	
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model) {
		//##조회수올리고 / 상세보기기능
		model.addAttribute("dto", service.find(id));
		return "board/detail"; 
	} //http://localhost:8383/board/detail/5
	
	@GetMapping("/board/insert")
	public String insert_get(Principal principal, Model model) {
		model.addAttribute("username", principal.getName());
		return "board/write";
	} //http://localhost:8383/board/insert (글쓰기 폼)
	
	@PostMapping("/board/insert")
	public String insert_post(Board board, Member member) {
		board.setMember(member);
		service.insert(board);
		return "redirect:/board/list";
	} //http://localhost:8383/board/insert (글쓰기 기능 - 갱신된리스트)
	////////////////////////////////////////////////////////////////
	// @RequestParam - form, query, string, 데이터 헤더로부터 데이터 추출
	// @PathVariable - url 경로의 변수를 추출할때 사용
	
	@GetMapping("/board/update/{id}")
	public String update_get(@PathVariable Long id, Model model) {
		model.addAttribute("dto", service.update_view(id));
		return "board/edit";
	} //http://localhost:8383/board/update/5 (글수정 폼)
	
	@PostMapping("/board/update")
	public String update_post(Board board, RedirectAttributes rttr) {
		String msg="fail";
		if(service.update(board) > 0) {msg="글수정성공!";}
		rttr.addFlashAttribute("msg",msg);
		return "redirect:/board/detail/" + board.getId();
	} //폼태그에서 테스트 (글수정 기능 - 갱신된리스트)
	
	@GetMapping("/board/delete/{id}")
	public String delete_get(@PathVariable Long id, Model model) {
		model.addAttribute("id", id);
		return "board/delete";
	} //http://localhost:8383/board/delete (글삭제 폼)
	
	@PostMapping("/board/delete")
	public String delete_post(Board board, RedirectAttributes rttr) {
		String msg="fail";
		if(service.delete(board) > 0) {msg="글삭제성공!";}
		rttr.addFlashAttribute("msg", msg);
		service.delete(board); //## 글삭제기능
		return "redirect:/board/list";
	} //http://localhost:8383/board/update (글수정 기능 - 갱신된리스트)
	@GetMapping("/board/search")
	public String search() {
		return "redirect:board/search";
		
	}
}
/* Restful Api
// 기존게시판     : localhost:8080/board/detail?bno=10 쿼리스트링
// Restful Atp : localhost:8080/board/detail/bno/10 쿼리스트링
	1) resultful - http url을 기반으로 자원에 접근해서 서비스를 제공하는 애플리케이션
	2) api
	3) method (GET : 검색 / POST : 생성 / PATCH(부분업데이트), PUT(전체업데이트) / DELETE(삭제))
	4) DATA - json, xml
*/