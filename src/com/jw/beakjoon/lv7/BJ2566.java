package com.jw.beakjoon.lv7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2566 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[9][9];
		
		// 값 넣어주기
		for(int i=0; i<9; i++) { // 행
			
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			
			for(int j=0; j<9; j++) { // 열 
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		// 최댓값과 최댓값의 행과 열번호 추출
		
		int max = arr[0][0]; // 0으로 선언시 전부 0일경우 최댓값은 추출가능하지만 행,열은 알 수 가 없다.
		StringBuilder sb = new StringBuilder(); // 행과 열을 담아줄 변수
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				
				if(arr[i][j] > max) {
					sb.setLength(0); // 최댓값이 갱신될때마다 초기화
					max = arr[i][j];
					sb.append(i+1 + " " + (j+1));
				}else if(arr[i][j] == max) { // 전부 0이거나 최댓값이 2개 이상일 경우 처리
					sb.setLength(0);
					sb.append(i+1 + " " + (j+1));
				}
			}
		}
		
		sc.close();
		
		System.out.println(max + "\n" + sb);
		
	}
	
}
