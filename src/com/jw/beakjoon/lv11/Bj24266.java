package com.jw.beakjoon.lv11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24266 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Integer.parseInt(br.readLine());
		
		System.out.println((num*num*num) + "\n3");
		
		br.close();
		
	}
	
}
