package com.jw.beakjoon.lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2720 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine()); 
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<testCase; i++) {
		
			int num = Integer.parseInt(br.readLine());
		
			if(num/25 > 0) { // 쿼터 0.25
				sb.append(num/25 + " ");
				num = num - 25*(num/25);
			}else {
				sb.append(0 + " ");
			}
			
			if(num/10 > 0) { // 다임 0.10
				sb.append(num/10 + " ");
				num = num - 10*(num/10);
			}else {
				sb.append(0 + " ");
			}
			
			if(num/5 > 0) { // 니켈 0.05
				sb.append(num/5 + " ");
				num = num - 5*(num/5);
			}else {
				sb.append(0 + " ");
			}
			
			if(i < testCase-1) {
				sb.append(num/1 + "\n"); // 페니 0.01
			}else {
				sb.append(num/1); // 페니 0.01
			}
		
		}
		
		br.close();
		System.out.println(sb);
		
	}
	
}
