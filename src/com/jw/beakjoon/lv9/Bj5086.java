package com.jw.beakjoon.lv9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5086 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int firstNum = Integer.parseInt(st.nextToken()); 	// 첫 번째 숫자
			int secondNum = Integer.parseInt(st.nextToken()); 	// 두 번째 숫자
			
			if(firstNum + secondNum != 0) {
				if(secondNum % firstNum == 0) { // 약수 판별
					sb.append("factor");
				}else {
					if(firstNum % secondNum == 0) { // 배수 판별
						sb.append("multiple");
					}else {	// 약수 배수 모두 아닌 경우
						sb.append("neither");
					}
				}
				sb.append("\n");
			}else {
				break;
			}
		}
		System.out.println(sb.toString());
		br.close();
	}
	
}
