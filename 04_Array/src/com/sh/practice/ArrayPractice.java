package com.sh.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] iArr = new int[16];
		
		for(int i=1; i<iArr.length; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		
		while(true) {
			
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[] result = new int[num];
		
		int sum = 0;
		if(num <= 100) {
			for(int i=0; i<result.length; i++) {
				sum += i + 1;
				
			}
			
			System.out.println(sum);
		}
			
		}
				
	}
	public void practice3() {
	
	while(true) {
		
		System.out.print("What number? : ");
		int num = sc.nextInt();
		
		int[] result = new int[num];
		
		if(num > 0) {
			for(int i=0; i<result.length; i++) {
				System.out.println("positive integer");
			}
			
		}else if(num < 0){
				System.out.println("negative number");
		}else {
			System.out.println("다시입력해주세요.");
			return;
		}
	}
	}
}
