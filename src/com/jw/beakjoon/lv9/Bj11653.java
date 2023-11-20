package com.jw.beakjoon.lv9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11653 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		if(N != 1) {
			
			int i = 2;
			
			while(true) {
				
				
				if(N/i == 1 && N%i == 0) { // 몫 1, 나머지 0일 때 == 더이상 인수분해 할 수 없음
					sb.append(i + "\n");
					break;
				}
				
				if(N%i == 0) { // 합성수 분해
					N = N/i;
					sb.append(i + "\n");
					i = 2;
					continue;
				}
				
				i++;
			}
			
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
	
}
