package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input > 0 && input % 2 == 0) {
			result = "짝수입니다.";
			} else if(input > 0 && input % 2 == 1) {
				result = "홀수입니다.";
			} else { 
				result = "양수만 입력해주세요.";
			}
		System.out.println(result);
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		int evr = (kor + math + eng)/3;
		
		String result;
		
		
		if(kor < 40 || math < 40 || eng < 40 || evr < 60) {
			result = "불합격입니다.";
		} else {
			result = "국어 : " + kor + "\n수학 : " + math +"\n영어 : " + eng + "\n합계 : " + sum + "\n평균 : " + evr + "\n축하합니다, 합격입니다!"; 
		}
		System.out.println(result);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : result = month + "월은 31일까지 있습니다."; break;
		case 2 : result = month + "월은 28일까지 있습니다."; break;
		case 4 : case 6 : case 9 : case 11 : result = month + "월은 30일까지 있습니다."; break;
		default : result = month + "월은 잘못 입력된 달입니다.";
		}
		System.out.println(result);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		String result;
		
		if(BMI < 18.5) {
			result = "저체중";
		} else if(BMI >= 18.5 && BMI < 23) {
			result = "정상체중";
		} else if(BMI >= 23 && BMI < 25) {
			result = "과체중";
		} else if(BMI >= 25 && BMI < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		
		System.out.println(result);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int semis = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finals = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		double dsemis = semis * 20 / 100;  //semis * 0.2;
		double dfinals = finals * 30 / 100;  // finals * 0.3;
		double dhomework = homework * 30 / 100; // homework * 0.3;
		double dattend = attend;
		double sum = dsemis + dfinals + dhomework + dattend;
		int attend2 = 20 - (20*30/100);
		
		
		
		System.out.println("================= 결과 =================");
		
		if(attend <= attend2) {
			System.out.println("Fail [출석 횟수 부족("+ attend + "/20)]");
		}else if(sum < 70) {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수     (30) : %.1f\n출석 점수     (20) : %.1f\n총점 : %.1f\n%s", dsemis, dfinals, dhomework, dattend, sum, "Fail [점수 미달]");
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n기말 고사 점수(30) : %.1f\n과제 점수     (30) : %.1f\n출석 점수     (20) : %.1f\n총점 : %.1f\n%s", dsemis, dfinals, dhomework, dattend, sum, "PASS");;
		}
		
		
		
	}
}
