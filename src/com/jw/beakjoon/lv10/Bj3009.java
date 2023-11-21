package com.jw.beakjoon.lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Bj3009 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> listX = new ArrayList<>();
		ArrayList<Integer> listY = new ArrayList<>();
		
		// 입력 값 넣어주기
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			listX.add(Integer.parseInt(st.nextToken()));
			listY.add(Integer.parseInt(st.nextToken()));
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		// X축, Y축 값 비교
		Collections.sort(listX);
		Collections.sort(listY);
		
		// Integer 객체 타입이기 때문에 equals를 사용해야 비교할 수 있다. == 으로 처리하면 안됨.
		sb.append(listX.get(0).equals(listX.get(1)) ? listX.get(2) + " " : listX.get(0) + " ");
		sb.append(listY.get(0).equals(listY.get(1)) ? listY.get(2) : listY.get(0));
		
		System.out.println(sb.toString());
		
		br.close();
		
	}
	
}
