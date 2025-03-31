package spring000;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;	//##
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.iotest.MyArea;

//1. Spring ioc �����̳ʻ���
//2. ���
@RunWith(SpringJUnit4ClassRunner.class)//1. Spring ioc �����̳ʻ���
@ContextConfiguration(locations="classpath:config/beans001.xml")//2. �������ϰ��
public class JunitTest002 {
	@Autowired ApplicationContext context; //3. Bean (spring �����ϴ� ��ü)
	
	@Test
	public void test2() {
		MyArea myArea = context.getBean("myArea", MyArea.class);
		
		assertEquals("alpha>100.0", myArea.mycalc(10, 0));
	}
}
