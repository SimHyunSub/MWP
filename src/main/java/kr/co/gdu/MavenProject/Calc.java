package kr.co.gdu.MavenProject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		String key = request.getParameter("key");
		System.out.println("a: " + a + ", b: " + b +", key: " + key);
		
		Calculator calc = new Calculator();
		
		int result = 0;
		//int result = calc.add(Integer.parseInt(a), Integer.parseInt(b)); case문으로 바꿔보자 
		
		switch (key) {
		case "add":
			result = calc.add(a, b); 
			break;
		case "subtract":
			result = calc.subtract(a , b); 
			break;
		case "multiply":
			result = calc.multiply(a, b); 
			break;
		case "divide":
			result = calc.divide(a, b); 
			break;

		default:
			break;
		}
		
		
		System.out.println("result: " + result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}
	

}
