package edu.kh.practice;

import java.util.Scanner;

public class ControlPractice {
	
	public void ex5(){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("나이 : ");
	int age = sc.nextInt();
	
	
	if(age <= 13) {System.out.println("어린이 입니다.");
		} else if(age > 13 && age <= 19) {
			System.out.println("청소년 입니다.");
			
		}else{
			System.out.println("성인 입니다.");
		}
	}
	
	
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score <90) {
			System.out.println("B");
		} else if(score >= 70 && score <80) {
			System.out.println("C");
		} else if(score >= 60 && score <70) {
			System.out.println("D");
		} else if(score <60 && score >= 0) {
			System.out.println("F");
		} else {System.out.println("잘못 입력하셨습니다");
		}
	}
	
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double high = sc.nextDouble();
		
		if(age >= 12 && age < 100 && high >= 140.0) {
			System.out.println("탑승 가능");
		}  else if(age < 12 && age >= 0) {
			System.out.println("적정 연령이 아닙니다.");
		} else if(high < 140.0) {
			System.out.println("적정 키가 아닙니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
			
	}
	
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		 
		System.out.print("키 : ");
		double high = sc.nextDouble();
		
		if(age < 0 || age > 100) {
			System.out.println("나이를 잘못 입력하셨습니다.");
		} else if(high < 0 || high > 250.0) {
			System.out.println("키를 잘못 입력하셨습니다.");
		} else if(age >= 12 && high < 140.0) {
			System.out.println("나이는 적절하나 키가 적절치 않음");
		} else if(age < 12 && high >= 140.0) {
			System.out.println("키는 적절하나 나이가 적절치 않음");
		} else if(age <12 && high < 140.0) {
			System.out.println("나이와 키 모두 적절치 않음");
		} else { System.out.println("탑승 가능");
		}
	}
}
