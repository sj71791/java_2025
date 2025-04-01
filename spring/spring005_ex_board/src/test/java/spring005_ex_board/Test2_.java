package spring005_ex_board;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BoardDao;
import com.company.dto.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test2_ {
	@Autowired ApplicationContext context;
	@Autowired DataSource dataSource;
	@Autowired BoardDao dao;
	
	@Test public void test() throws UnknownHostException {
		BoardDto dto = new BoardDto(); 
		//insert
		dto.setBname("first"); dto.setBtitle("title"); dto.setBpass("1111");
		dto.setBcontent("content"); dto.setBip(InetAddress.getLocalHost().getHostAddress());
		System.out.println(dao.insert(dto));
		
		//delete
//		dto.setBpass("1111"); dto.setBno(1);
//		System.out.println(dao.delete(dto));
		//update
//		dto.setBname("first"); dto.setBtitle("title-new"); dto.setBpass("1111");
//		dto.setBcontent("content-new"); dto.setBip(InetAddress.getLocalHost().getHostAddress());
//		System.out.println(dao.update(dto));
		
		//update
//		System.out.println(dao.updateHIt(1));
		
		//select
//		System.out.println(dao.select(1));
		
		//selectAll
		//System.out.println(dao.selectAll());
	}
	
}
