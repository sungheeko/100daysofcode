package com.sh.practice;

public class PrintPractice2 {
	
	public void practice1( ) { 
		
		for(int dan=2; dan<=9; dan++){
			System.out.printf(" ----- %d ----- \n", dan);
				
			for(int su=1; su <= 9; su++) {
				System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
			
			}
		}
		
	}

	
	public void practice2() {
		
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
