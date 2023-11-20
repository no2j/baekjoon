package com.jw.beakjoon.lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()); // 낮에 a미터만큼 나무막대를 올라간다.
		int b = Integer.parseInt(st.nextToken()); // 밤에 b미터만큼 나무막대에서 미끄러진다.
		int v = Integer.parseInt(st.nextToken()); // 나무 막대 높이
		
		/*
		 *	정상에 올라간 후에는 미끄러지지 않는다.
		 *	낮에 정상에 도달할 수 있기 때문에 v-b로 설정.
		 */
		
		int day = (v-b) / (a-b);
		
		if((v-b) % (a-b) != 0) {
			day++;
		}
		
		System.out.println(day);
		
		br.close();
	}
	
	
}
