package com.jw.beakjoon.lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5073 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int[] arr = new int[3];
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<3; i++) {
				arr[i]= Integer.parseInt(st.nextToken());
			}
			
			int max = arr[0];
			int sum = arr[1] + arr[2];
			for(int i=1; i<3; i++) { // max값과 max를 제외한 나머지를 더한 값 찾기
				if(max < arr[i]) {
					max = arr[i];
					sum = i==2 ? arr[0] + arr[1] : arr[0]+arr[2]; 
				}
			}
			
			if(arr[0]+arr[1]+arr[2] == 0) {
				break;
			}else if(sum <= max) { // 삼각형의 조건을 만족하지 못하는 경우
				sb.append("Invalid");
			}else if((arr[0]+arr[1]+arr[2])/3 == arr[0]) { // 세 변의 길이가 같은 경우
				sb.append("Equilateral");
			}else if(arr[0]==arr[1]||arr[0]==arr[2]||arr[1]==arr[2]) { // 두 변의 길이만 같은 경우
				sb.append("Isosceles");
			}else { // 세 변의 길이가 모두 다른 경우
				sb.append("Scalene"); 
			}

			System.out.println(sb.toString());
			sb.setLength(0); // 리셋
			
		}
		
		br.close();
	}
	
}
