package jsp_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Jsp025_Login
 */
@WebServlet("/user_login")
public class Jsp025_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jsp025_Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int result=-1;
		String name= request.getParameter("name");
		String pass= request.getParameter("pw");
		PrintWriter out = response.getWriter();
		
		DBManager db=new DBManager();
		PreparedStatement pstmt=null; ResultSet rset=null; 
		Connection conn=db.getConnection();
		String sql="select count(*) from member where name=? and pass=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			rset=pstmt.executeQuery(); //insert, update, delete | executeQuery -select
			if(rset.next()) {result=rset.getInt("count(*)");}
			
			if(result==1) {
				HttpSession session = request.getSession();
				session.setAttribute("username", name);   // 세션설정
				response.sendRedirect("jsp025_my.jsp");
			}else {
				out.println("<script>alert('정보를 확인해주세요!'); history.go(-1);</script>");
			}
			
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
		} 
		catch (Exception e) { e.printStackTrace(); }
		finally {
			if(rset!=null) {try { rset.close(); } catch (Exception e) { e.printStackTrace(); }}
			if(pstmt!=null) {try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try { conn.close(); } catch (Exception e) { e.printStackTrace(); }}
		}
	}

}
