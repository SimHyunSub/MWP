package kr.co.gdu.MavenProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calc() {
        super();
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		action(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		action(request, response);
	}
	
	protected void action(HttpServletRequest request, HttpServletResponse response) {
	 try {
			int a = Integer.parseInt(request.getParameter("a"));
			int b = Integer.parseInt(request.getParameter("b"));
			String key = request.getParameter("key");
			boolean check = true;
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
				check= false;
				break;
			}
			
			System.out.println("result: " + result);
			
			response.setContentType("text/html; charset=UTF-8");
			
			String html = "<h1>결과값 : " + result + " </h1>";
				   html += "<a href='index.html'>계산기로 이동</a>";
			
			response.getWriter().append(html);
			if (check) {
			request.setAttribute("result", result); //result라고 하는 key로 result값을 담아 보낸다 어디로 ? result.jsp로 
			//result.jsp 로 보내기위해 처리하는것들
		    RequestDispatcher rd = request.getRequestDispatcher("result.jsp"); //Dispatcher 어느쪽으로 보낼것이냐 ?
		    //rd.forward(request, response); //보낸다 .
			}else {
			//	response.sendRedirect("index.html");
			}
			
			} catch (Exception e) {
				e.printStackTrace();
		} finally { 	//오류가 생겼으나 그냥 다음으로 넘어가고싶다.
			System.out.println("종료");
		}
	}
}
