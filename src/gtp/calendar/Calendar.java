package gtp.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello, Calendar");
		
		//입력변수
		int a = 0;
		int b = 0;
		int add1 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 값을 입력하세요. : ");
		//첫번째 값
		String s1 = scanner.next();
		
		System.out.println("두번째 값을 입력하세요. : ");
		//두번째 값
		String s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		add1 = a + b;
		
		
//		addVal = f_inVal + n_inVal;
		
		System.out.println("Result : a = " + a + "\r" + 
		                           " b = " + b + "\r" +
				                   " a + b = " + add1 + " 입니다.");
		
		
		
		
		
		
		

	}

}
