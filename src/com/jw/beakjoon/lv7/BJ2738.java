package com.jw.beakjoon.lv7;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2738 {

	public static void main(String[] args) throws IOException {
		
		// 두 행렬 A와 B가 주어지기 때문에 두개의 배열보다 2차원 배열을 활용하면 된다.
		
		Scanner sc = new Scanner(System.in);
		
		// N은 몇번 반복시킬지를 의미
		// M은 배열의 길이를 의미
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		int num = Integer.parseInt(st.nextToken()); // N을 의미
		
		int index =  Integer.parseInt(st.nextToken()); // M을 의미
		
		int arr[][] = new int[num*2][index]; 
		
		
		// 값 넣어주기
		for(int i=0; i<num*2; i++) {
			
			st = new StringTokenizer(sc.nextLine());
			
			for(int j=0; j<index; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0, j=num; i<num; i++, j++) { // N만큼 반복
			
			for(int k=0; k<index; k++) { // 인덱스 길이만큼 반복
				
				sb.append((arr[i][k] + arr[j][k]) + " ");
			}
			sb.append("\n");
		}
		
		sc.close();
		System.out.println(sb.toString());
		
	}
	
}
