package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	public void ex1() {
		
		// if문
		// 조건식이 true일때만 내부 코드 수행
		
		/* 작성법
		 * if(조건식){
		 * 	조건식이 true일 때 수행할 코드
		 * }
		 * 
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		//입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수입니다");
			
		}
		
		if(input <=0) {
			System.out.println("양수가 아니다");
			
		}
		
			
	}
	
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true면 if문,
		// false면 else 구문이 수행됨
		
		/*
		 * if(조건식) {
		 *			조건식이 true일 때 수행될 코드 
		 * } else {
		 * 			조건식이 false일 때 수행될 코드 
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//홀짝 검사
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 != 0) {
			System.out.println("홀수입니다.");
		} else {// 짝수 또는 0 입력 시 수행
			
			// 중첩 if문
			if(input == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("짝수입니다.");
			}
			
			
		}
		
	}
	
	public void ex3() {
		// 양수, 음수, 0 판별
		
		// if - else if - else
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0 ) {//input이 양수일 경우
			System.out.println("양수입니다.");
		} else if(input < 0) {// input이 음수일 경우
			// 바로 위에 있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수입니다.");
			
		} else {
			System.out.println("0입니다.");
		}
		
	}
	
	
	public void ex4() {
		//달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파경보", -12도 이하 "한파주의보"
		// 여름일 때 온도가 35도 이상 "폭염경보", 33도 이상 "폭염주의보"
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		int temperature = 33;
		
		String season;
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			if(temperature <= -15) {
				//season = "겨울 한파 경보";
				season +="한파 경보";
				//season = season + "한파 경보"
			} else if(temperature <= -12) {
				season += "한파 주의보";
			}
			
		} else if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			
			if(temperature > 35) {
				season += "폭염 경보";
			} else if(temperature >=33) {
				season += "폭염 주의보";
			}
			
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season);
		
	}
	
}
