package com.sh.practice;

import java.util.Scanner;

public class OperatorTest3 {
	
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		System.out.print("수학점수: ");
		int math = sc.nextInt();
		System.out.print("컴퓨터점수: ");
		int com = sc.nextInt();
		
		int sum = kor + eng + math + com;
		int avg = sum / 4;
		
		System.out.println(sum);
		System.out.println(avg);
		
	}

	
	public void test2() {
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int b = sc.nextInt();
		
		int result1 = a / b;
		int result2 = a % b;
		
		System.out.println(a + " / " + b + " = " + result1 
							+ "..." + result2);
	}
	
	public void test3() {
		
		System.out.print("가로길이 : ");
		int width = sc.nextInt();
		System.out.print("세로길이 : ");
		int height = sc.nextInt();
		
		int width2 = width + 5;
		int height2 = height * 2;
		
		System.out.println(width2++);
		System.out.println(height2);
		System.out.println(width2 * height2);
		
	}
	
	public void test4() {
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int a = ++num1;
		int b = num2--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a++);
		System.out.println(--b);
		
	}
	
	public void test5() {
		
		System.out.print("민수의 키를 입력하세요 : ");
		int height1 = sc.nextInt();
		System.out.print("민수의 몸무게를 입력하세요 : ");
		int weight1 = sc.nextInt();
		System.out.print("기영이의 키를 입력하세요 : ");
		int height2 = sc.nextInt();
		System.out.print("기영이의 몸무게를 입력하세요 : ");
		int weight2 = sc.nextInt();
		
		boolean result = height1 > height2 && weight1 > weight2 ? true : false;
		System.out.println(result);
		
		
	}

}
