package com.jw.beakjoon.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ25206 {

	public static void main(String[] args) throws IOException {
		
		// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
		// P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sumCredit = 0; // 학점 합계
		double resultAvg = 0; // 과목평점 합계
		
		double credit = 0; // 학점
		String avg = ""; // 과목평점
		
		double result = 0; // 최종 전공평점 (학점 * 과목평점)*20/학점의 총합 
		
		for(int i=0; i<20; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			st.nextToken(); // 과목명
			credit = Double.parseDouble(st.nextToken()); // 학점
			avg = st.nextToken(); // 과목평점
			
			if(!avg.equals("P")) { // 과목평점이  P가 아닐경우
				
				sumCredit += credit; // 학점합계 추가
				
				switch(avg) {
					case "A+" : resultAvg = 4.5;
						break;
					case "A0" : resultAvg = 4.0;
						break;
					case "B+" : resultAvg = 3.5;
						break;
					case "B0" : resultAvg = 3.0;
						break;
					case "C+" : resultAvg = 2.5;
						break;
					case "C0" : resultAvg = 2.0;
						break;
					case "D+" : resultAvg = 1.5;
						break;
					case "D0" : resultAvg = 1.0;
						break;
					case "F" : resultAvg = 0;
						break;
				}
				
				result += (credit * resultAvg); // 학점 * 과목평점
			}
		}
		br.close();
		System.out.println(result / sumCredit);
		
	}
	
}
