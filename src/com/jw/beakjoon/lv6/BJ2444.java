package com.jw.beakjoon.lv6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2444 {
/*
 * 밑 코드에 sb.append()를 사용하기 전에는 String result = ""이라는 String타입 변수를 선언하였었고, result += " " 또는 "*" 또는 "\n"를 사용하였었음.
 *  
 * 문제 제출 시 메모리 초과라는 결과를 받았고, 해결을 위해 밑 순서로 진행하였음.
 * 1. Scanner를 사용하지않고 메모리, 속도에 장점이 있는 BufferedReader를 사용해봤음 => 미해결
 * 2. BufferedReader도 효과가 없었고 더 찾아보던 중 StringBuilder를 사용 => 메모리 초과 문제 해결
 * 
 * 이유 : 
 * 자바에서 String 객체는 변경 불가능하다. 따라서 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고, 이전 문자열은 가비지 컬렉터로 들어간다.
 * StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업 시 하나의 대안이 될 수 있다.
 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		
		br.close();
		
		int num2 = 2*num1-1;
		
		StringBuilder sb = new StringBuilder();
		
		//반복할수록 *가 +2됨
		for(int i=0; i<num2; i++) {

			if(i < num1) { // 윗 삼각형
				
				for(int j=0; j<num1-(i+1); j++) { // 공백 추가 (1개씩 감소)
					sb.append(" ");
				}
				
				for(int j=0; j<(2*i+1); j++) { // * 추가 (2개씩 증가)
					sb.append("*");
				}

				sb.append("\n");
				
			}else { // 역 삼각형
				
				for(int j=num2; j<num1+i; j++) { // 공백 1개씩 증가
					sb.append(" ");
				}
				
				for(int j=0; j<num2-((2*i+1)-num2); j++) { // * 2개씩 감소
					sb.append("*");
				}
				
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
	
}
