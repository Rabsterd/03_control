package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요.");
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i >= num ; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요.");
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		
		if(dan >= 2 && dan <= 9) {
			for(int i = dan; i <= 9; i++) {
			
			System.out.println("===== "+ i +"단 =====");
		
			for(int x = 1; x <= 9; x++)
			
			System.out.printf("%d * %d = %2d\n", i, x, x * i);
			}
		} else {
			System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int x = i; x >= 1; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++ ) {
			for(int y = num; y > i; y--) {
				System.out.print(" ");
			}
			for(int x = 1; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int x = 1; x <= i; x++) {
				System.out.print("*");
				}
			System.out.println();
		}
		for(int y = num-1; y >=1; y--) {
			for(int z = y; z >= 1; z--) {
				System.out.print("*");				
			}
			System.out.println();		
		}
							
	}
			

}

