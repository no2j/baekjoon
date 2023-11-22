package com.jw.beakjoon.lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15894 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 최대 10의 9승이기 때문에 long타입으로 설정
		long N = Integer.parseInt(br.readLine());
		
		System.out.println(N*4);
		
		br.close();
		
	}
	
}
