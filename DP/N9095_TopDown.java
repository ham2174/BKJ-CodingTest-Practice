package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N9095_TopDown { // TopDown
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++) {
        	int n = Integer.parseInt(br.readLine());
        	dp = new int[11];
        	bw.write(String.valueOf(TopDown(n)+"\n"));
        }
        
        bw.flush();
        bw.close();
	}
	static int TopDown(int n) {
		if(n == 0) {return 1;}
		if(n == 1) {return 1;}
		if(n == 2) {return 2;}
		if(dp[n] > 0) {return dp[n];}
		
		dp[n] = TopDown(n-1) + TopDown(n-2) + TopDown(n-3);
		
		return dp[n];
	}
}