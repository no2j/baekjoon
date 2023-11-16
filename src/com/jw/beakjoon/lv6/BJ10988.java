package com.jw.beakjoon.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10988 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(br.readLine());
		
		int count = 1;
		
		for(int i=0; i<sb.length(); i++) {
			if(sb.toString().charAt(i) ==  sb.reverse().toString().charAt(i)) {
				count *= 1;
			}else {
				count *= 0;
			}
		}
		
		if(count != 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		br.close();
		
	}
}
