package com.jw.beakjoon.lv8;

import java.util.Scanner;

public class BJ2903 {

	public static void main(String[] args) {
		
		/*
		 * 한 변에 점이 몇개 있는지를 알면 중복되지 않는 전체 점의 개수를 알 수 있다.
		 * 즉, 한 변의 점을 a라고 한다면 a*a를 하면 된다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 반복 횟수
		
		int point = 2; // 한 변에 있는 점의 개수 (초기 상태 : 2)
		
		for(int i=0; i<num; i++) {
			
			point = (point - 1) + point;
			
		}
		
		sc.close();
		System.out.println(point * point);
		
		
		
	}
	
}
