package com.sh.practice;

public class PrintPractice1 {
	
	public void practice1() {
		// "강한친구 대한육군"을 두번 출력하기
		
		String[] str = new String[5];
		
	      for(int i=0; i<str.length; i++) {
	        System.out.println("강한친구 대한육군");
	        
	    }
	}

	public void practice2() {
		// 정수를 변수 선언을 하고 -100을 출력하기
		
		int i = -100;
		System.out.println(i);
	}
	
	
	
	public void practice3() {
		
		System.out.println("Programming! " + "It's fun.");
		
	}
	
	public void practice4() {
		
		String name = "Hong Gil Dong";
		int age = 13;
		System.out.println("My name is " + name + ". " +
							"I am " + age + " years old");
	}
	
	public void practice5() {
		
		int height = 170;
		double weight = 68.6;
		
		System.out.printf("My height %d My weight %.6f ", height, weight);
	}
	
	public void practice6( ) { 
		// 5 * 2 = 10 출력하기
		
		for(int dan=2; dan<=9; dan++){
			System.out.printf(" ----- %d ----- \n", dan);
				
			for(int su=1; su <= 9; su++) {
				System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
			
			}
		}
		
	}
	
	public void Question7() {
		
		int kor = 90;
		int mat = 80;
		int eng = 100;
		int sum = 90 + 80 + 100;
		int avg = sum / 3;
		
		System.out.println(kor);
		System.out.println(mat);
		System.out.println(eng);
		System.out.println(sum);
		System.out.println(avg);
		
	}
}


