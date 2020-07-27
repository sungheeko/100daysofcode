package com.sh.practice;

import java.util.Scanner;

public class OperatorTest1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		System.out.print("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double avg = sum/ 3;
		
		System.out.println(sum);
		System.out.println((int)avg);
				
	}

	
	public void test2() {
		
		System.out.print("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		int fir = num1 + 100;
		int sec = num2 % 10;
		
		System.out.println(fir);
		System.out.println(sec);
	}
	
	public void test3() {
		
		System.out.print("정수를 입력하세요.");
		int num = sc.nextInt();
		
		System.out.println(num++);
		
		int op = ++num;
		System.out.println(op);
		
	}
	
	public void test4() {
		
		System.out.print("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		int a = num1++;
		int b = --num2;
		int result = num1 * num2;
		
		System.out.println(num1++);
		System.out.println(b);
		System.out.println(result);
		
		
	}

}
