package com.jw.beakjoon.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2563 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] intArr = new int[100][100]; // 흰색 도화지 (가로, 세로 크기 각각 100)
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		int index1 = 0; // 행
		int index2 = 0; // 열
		
		int result = 0;
		
		for(int i=0; i<num; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			index2 = Integer.parseInt(st.nextToken()); // 첫 자연수
			index1 = Integer.parseInt(st.nextToken()); // 두번째 자연수
			
			for(int j=index2; j<=index2+9; j++) { // 3부터 13까지
				
				for(int k=index1; k<= index1+9; k++) {
					
					if(j<100 && k<100 && intArr[j][k] == 0) { // 인덱스가 99까지만 접근할 수 있도록 설정 및 0과 1의 값으로 구분하여 체크
						
						intArr[j][k] = 1;
						result++;
					}
					
				}
			}
		}
		
		br.close();
		System.out.println(result);
	}
	
}
