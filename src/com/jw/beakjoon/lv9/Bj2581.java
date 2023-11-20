package com.jw.beakjoon.lv9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2581 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = 0;
		
		for(int i=M; i<=N; i++) { // 범위 설정
			
			int count = 0; // 소수 판별 카운트
			
			// 소수 찾기
			for(int j=1; j<=i; j++) { 
				
				if(i % j == 0) { // 소수 판별
					count++;
					
					if(count > 2) { // 소수가 아닐 경우
						break;
					}
					
				}
				
			}
			
			// 합 구하기
			if(count == 2) {
				sum += i;
			}
			
			// 최솟값 구하기
			if(sum == i) {
				min = i;
			}
			
		}
		
		// 최종 판별
		if(sum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum + "\n" + min);
		}
		
		br.close();
	}
	
}
