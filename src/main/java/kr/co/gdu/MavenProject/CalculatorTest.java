package kr.co.gdu.MavenProject;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import javax.management.MXBean;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc;
	int a,b;
	
	@Before
	public void Before() {
		System.out.println("before()");
		calc = new Calculator();
		a = 2;
		b = 6;
	}
	
	
	public void test() {
		System.out.println("test()");
		int add = calc.add(a, b); 					// 8
		int subtract = calc.subtract(add, b); 		// 2 
		int multiply = calc.multiply(subtract, a);  // 4
		int divide = calc.divide(multiply, a); 		// 2
		//로직에 대해서 마지막에 assertEquals로 비교한다 ! 
		assertEquals(2,divide);
	}
	
	
	public void after() {
		System.out.println("after()");
	}

}
