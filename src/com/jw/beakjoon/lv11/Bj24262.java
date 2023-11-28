package com.jw.beakjoon.lv11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24262 { // 알고리즘 수업 - 알고리즘의 수행 시간 1

	public static void main(String[] args) throws IOException {
		
		/*
		 * 	MenOfPassion(A[], n) {
			    i = [n / 2];
			    return A[i]; # 코드1
			} 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int max = 0;
		for(int i=0; i<n; i++) {
			if(max > i/2) {
				max = i/2;
				count = i+1;
				if(n==0 || max > 3) {
					max = 4;
					break;
				}
			}
		}
		
		System.out.println(count + "\n" + max);
		
		br.close();
	}
	
}
