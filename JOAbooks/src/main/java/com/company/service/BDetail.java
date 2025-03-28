package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;
import com.company.domain.BoardVO;

public class BDetail implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//2
		int bno=Integer.parseInt(request.getParameter("bno"));
		//3. dao 조회수 올리기 dao.updateHit(번호) /해당글상세 dao.select(번호)
		BoardDao dao = new BoardDao();
		dao.updateHit(bno);
		//4
		request.setAttribute("dto", dao.select(bno));
	}
}