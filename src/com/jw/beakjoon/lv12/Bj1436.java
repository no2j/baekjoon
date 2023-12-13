package com.jw.beakjoon.lv12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1436 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int name = 666;
		int count = 1;
		
		while(count != n) {
			name++;
			
			if(String.valueOf(name).contains("666")) {
				count++;
			}
		}
		
		br.close();
		System.out.println(name);
		
	}
	
}
