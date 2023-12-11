package com.jw.beakjoon.lv12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2231 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			
			sb.append(i);
			int sum = 0;
			for(int j=0; j<sb.length(); j++) {
				sum += Character.getNumericValue(sb.charAt(j));
			}
			
			if(sum + i == N) {
				break;
			}
			
			sb.setLength(0);
			
		}
		
		if(sb.length() == 0) {
			System.out.println(0);
		}else {
			System.out.println(sb);
		}
		
		br.close();
		
	}
	
}
