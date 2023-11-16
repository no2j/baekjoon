package com.jw.beakjoon.lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ10951 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		
		while((str = br.readLine()) != null) {
			
			StringTokenizer st = new StringTokenizer(str," ");
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
