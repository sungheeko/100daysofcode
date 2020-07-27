package com.sh.practice;

import java.util.Scanner;

public class OperatorTest2 {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		System.out.print("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		boolean result = num1 == num2 ? true : false;
		System.out.println(result);	
		
	}
	
	public void test2() {
		
		System.out.print("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(false);
		}else if(num1 < num2) {
			System.out.println(true);
		}else if(num1 >= num2) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
		
		
	}
	
	public void test3() {
		
		System.out.print("정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int b = sc.nextInt();
		
		boolean c = a != 0;
		boolean d = b != 0;
		System.out.println(c);
		System.out.println(d);
		
		int sum = a + b;
		int mul = a * b;
		System.out.println(sum);
		System.out.println(mul);
		
		 
	}

	
	public void test4() {
		
		System.out.print("정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int b = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int c = sc.nextInt();
		
		boolean result = a > b && a > c ? true : false;
		System.out.println(result);
		boolean result2 = a == b && a == c && b == c ? true : false;
		System.out.println(result2);
		
	}
}
