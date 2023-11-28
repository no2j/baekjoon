package com.jw.beakjoon.lv10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10101 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());;
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = arr[0] + arr[1] + arr[2]; // 세 각의 합
		
		int count = 0;
		
		for(int i : arr) { 
			if(i == 60) {
				count++;
			}
		}
		
		if(count == 3) { // 세 각의 크기가 모두 60
			System.out.println("Equilateral");
		}else if(sum == 180) { // 세 각의 합 180
			if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) { // 두 각이 같은 경우
				System.out.println("Isosceles");
			}else { // 같은 각이 없는 경우
				System.out.println("Scalene");
			}
		}else { // 세 각의 합이 180이 아닌경우
			System.out.println("Error");
		}
		
		br.close();
		
	}
	
}
