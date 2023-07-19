package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for문
	 * - 끝이 정해져 있는(횟수가 지정되어 있는)반복문
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식){
	 * 		반복수행할 코드
	 * }
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 *  
	 * - 조건식 : for문의 반복 여부를 지저하는 식
	 *				보통 초기식에 사용된 변수를 이용하여 조건식을 작성함
	 *
	 * - 증감식 : 초기식에 사용된 변수를 for문이 
	 * 				끝날 때마다 증가 또는 감소시겨
	 * 				조건식의 결과를 변하게 하는 식
	 * 
	 */
	
	
	
	public void ex1() {
		// for문 기초 사용법 1
		// 1~10 출력하기
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public void ex2() {
		for(int i = 3; i <= 7; i++) {
			System.out.println(i);
		}
	}
	
	public void ex3() {
		for(int i = 2; i <= 15; i++) {
			System.out.println(i);
		}
	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i+=2) {
			System.out.println(i);
		}
	}
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(double i = 1.0; i <= input; i += 0.5) {
			System.out.println(i);
		}
	}
	
	public void ex7() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 입력
		// ABCDEF...Z
		
		// * char 자료형은 문자형이지만 실제로 정수(문자표 번호)를 저장한다
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i); // 강제형변환
		}
		
		System.out.println("\n==========================");
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
	}
	
	public void ex8() {
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	public void ex9() {
		
		// for문 응용 1 : 반복문을 이용한 값의 누적
		
		// 1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; // 반복되어 증가되는 i 값의 합계를 저장할 변수
					//	0으로 시작하는 이유 : 아무것도 더하지 않음으로
					//	정확히 결과를 도출할 수 있기 때문
		
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			sum += input;
		}
		System.out.println("합계 : " + sum);
		
	}
	
	public void ex11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	public void ex12() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수에()를 붙여서 출력
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % 5 == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
	
	public void ex13() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % num == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
			
		}
	}
	
	public void ex14() {
		
		// 구구단 출력
		// 2 ~ 9 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2 ~ 9 사이 숫자가 아니면 "잘못 입력하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void ex15() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 19) {
			for(int i = 1; i <= 19; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			} 
		}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	
	public void ex16() {
		// 구구단 모두 출력하기
		
		for(int dan = 2; dan <= 9; dan++) {
			
			for(int num = 1; num <=9; num++) {
				System.out.printf("%2d X %2d = %2d  ", dan, num, dan * num);
				
			}
			System.out.println(); // 하나의 단 출력이 끝났을 때 줄바꿈
			// 아무내용 없는 println은 줄 바꿈 
		}	
	}
	
	public void ex17() {
		
		for(int dan = 9; dan >= 2; dan--) {
			
			for(int num = 1; num <=9; num++) {
				System.out.printf("%d X %d = %2d  ", dan, num, dan * num);
			}
			System.out.println();
		}
	}
	
	public void ex18() {
		// 2중 for문을 이용해서 다음 모양을 출력하시오
		
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i = 1; i <= 5; i++) {// 5바퀴 반복하는 for문
			for(int num = 1; num <= 5; num++) {// 12345 반복하는 for문
				System.out.print(num);
			}
			System.out.println();
		}	
	}
	
	public void ex19() {
		
		for(int i = 1; i <=3; i++) {
			for(int num = 5; num >=1; num--) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
	public void ex20() {
		
		for(int i = 1; i <= 4; i++) {
			for(int num = 1; num <= i; num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
	public void ex21() {
		
		for(int i = 4; i >= 1; i--) {
			for(int num = i; num >= 1; num--) {
				System.out.print(num);	
			}
			System.out.println();
		}
	}
	
	public void ex22() {
		//숫자 세기 count
		
		//1부터 20까지 1씩 증가하며서
		//3의 배수의 총 개수 출력
		//3의 배수의 합계 출력
		
		int count = 0; // 3의 배수의 개수를 세기 위한 변수
		int sum = 0; // 3의 배수의 합계를 구하기 위한 변수
		for(int i = 1; i<=20; i++) {
			
			if(i % 3 == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
			
		}
		System.out.println(": " + count + "개");
		System.out.println("3의 배수 합계 : " + sum);
		
	}
	
	public void ex23() {
		
		// 2중 for문과 count를 이용해서 아래모양 출력하기
		
		// 1  2  3  4
		// 5  6  7  8
		// 9 10 11 12
		
		int count = 1;
		
		for(int i= 1; i <= 3; i++) { // 3줄
			for(int k = 1; k <= 4; k++) { // 4칸
				System.out.printf("%3d", count);
				count++;
			}
			System.out.println();
		}
	}
	
	public void ex24() {
		for(int dan = 1; dan <= 9; dan++) {
			for(int num = 2; num <=9; num++) {
				System.out.printf("%2d X %2d = %2d  ", num, dan, num * dan);
				}
			System.out.println();  
		}
			
	}
	
	
}

