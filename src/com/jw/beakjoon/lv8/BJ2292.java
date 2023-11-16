package com.jw.beakjoon.lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2292 {

	public static void main(String[] args) throws IOException {
		
		// 반복 횟수 증가할 때마다 chkNum에 6의 배수만큼 추가.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNum = Integer.parseInt(br.readLine()); // 입력 값.
		
		int chkNum = 1; // 시작 숫자 1을 의미
		
		int count = 0;
		
		if(inputNum == 1) {
			count++;
		}else {
			while(inputNum >= chkNum) { // 입력 받는 값이 chkNum보다 작다면 반복 수행
				
				chkNum = chkNum+(6*count);
				
				count++;
				
				// chkNum+6의 배수 한 값과 같다면 i-1
				if(inputNum == chkNum) {
					count--;
				}
				
			}
		}
		
		br.close();
		System.out.println(count);
		
	}
	
}
