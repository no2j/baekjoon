package com.jw.beakjoon.lv11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24264 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int 사용 시 overflow 발생하므로 long 사용
		long num = Integer.parseInt(br.readLine());
		
		System.out.println((num *= num) + "\n2");
		
		br.close();
		
	}
	
}
