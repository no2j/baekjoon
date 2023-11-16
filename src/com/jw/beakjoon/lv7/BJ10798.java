package com.jw.beakjoon.lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10798 {

	public static void main(String[] args) throws IOException {
		
		// 총 다섯줄의 입력이 주어지며 글자들이 빈칸 없이 연속으로 주어진다.
		// 입력한 다섯줄의 글자들을 세로로 순서대로 글자들을 연속으로 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Character[][] charArr = new Character[5][15]; // 총 다섯줄과 각 줄의 최대 15개의 글자를 의미
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<charArr.length; i++) { // 총 다섯줄
			
			sb.setLength(0); // StringBuilder를 초기화 해주기 위해 사용.
			
			sb.append(br.readLine()); // 입력을 받으면 StringBuilder에 넣어준다.
			
			for(int j=0; j<sb.length(); j++) { // 입력받은 문자열을 한 글자씩 각 인덱스에 넣어준다.
				
				charArr[i][j] = sb.charAt(j);
				
			}
			
		}
		
		int maxLength = charArr[0].length;
		
		for(int i=0; i<5; i++) {
			if(charArr[i].length > maxLength) {
				maxLength = charArr[i].length;
			}
		}
		
		sb.setLength(0); // StringBuilder를 재사용 하기 위해 초기화. 최종 출력문에 사용할 변수
		
		for(int i=0; i<maxLength; i++) { // 글자들을 세로로 가져오기
			
			for(int j=0; j<5; j++) {
				
				if(charArr[j][i] != null) {
					sb.append(charArr[j][i]);
				}
				
			}
			
		}
		
		br.close();
		System.out.println(sb);
	}
	
}
