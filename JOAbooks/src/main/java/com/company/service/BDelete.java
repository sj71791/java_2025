package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;
import com.company.domain.BoardVO;

public class BDelete implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// UTF
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// PARAMETER
		int bno=Integer.parseInt(request.getParameter("bno"));
		
		// SQL
		BoardDao dao = new BoardDao();
		
		// 결과
		request.setAttribute("result", String.valueOf(dao.delete(bno)));
	}

}
