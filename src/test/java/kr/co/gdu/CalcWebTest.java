package kr.co.gdu;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import kr.co.gdu.MavenProject.Calc;

public class CalcWebTest {


	@Mock
	HttpServletRequest request;
	@Mock
	HttpServletResponse response;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() throws SerialException, IOException, ServletException {
		 
		when(request.getParameter("a")).thenReturn("3");
		when(request.getParameter("b")).thenReturn("2");
		when(request.getParameter("key")).thenReturn("add");
		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw); //출력문을 담을 공간 
		
		when(response.getWriter()).thenReturn(pw); // 리턴되어 오는거 pw에 넘겨서 출력 .
		
		System.out.println(sw);
		
		Calc calc = new Calc();
		
		calc.doGet(request,response);
		
		
		
	}
}
