package com.jw.beakjoon.lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1085 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int resultX = w-x > x ? x : w-x;
		int resultY = h-y > y ? y : h-y;
		
		int result = resultX > resultY ? resultY : resultX;
		
		System.out.println(result);
		
		br.close();
	}
	
}