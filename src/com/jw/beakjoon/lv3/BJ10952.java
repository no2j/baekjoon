package com.jw.beakjoon.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ10952 {

	/*
	 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
	 * 
	 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	 * 
	 * 입력의 마지막에는 0 두 개가 들어온다.
	 */		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if(num1+num2 == 0) {
				break;
			}else {
				bw.write(num1+num2+"\n");
				bw.flush();
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
