package com.jw.beakjoon.lv4;

import java.util.Scanner;

public class BJ10807 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] num3 = new int[num];
		
		// 1번 - 입력받은 정수를  배열에 담아준다.
		for(int i=0; i<num; i++) {
			int num2 = sc.nextInt();
			
			num3[i] = num2;
		}
		
		int num4 = sc.nextInt(); // 찾으려고 하는 정수
		int count = 0; // 찾으려는 정수가 몇개 포함되어있는지 체크
		
		// 2번 - 입력받은 정수를 가지고있는 배열에서 찾으려고 하는 정수가 있는지 확인 true일 경우 count증가
		for(int i=0; i<num3.length; i++) {
			if(num3[i] == num4) {
				count++;
			}
		}
		
		sc.close();
		System.out.println(count);
	}
}
