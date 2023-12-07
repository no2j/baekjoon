package com.jw.beakjoon.lv11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24267 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Integer.parseInt(br.readLine());
		
		// 팩토리얼 3!
		System.out.println((num * (num-1) * (num-2))/6 + "\n3");
		br.close();
		
	}
	
}
