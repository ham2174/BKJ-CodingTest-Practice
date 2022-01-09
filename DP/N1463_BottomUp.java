package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N1463_BottomUp { // BottomUp 방식

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int X = Integer.parseInt(br.readLine()); 
        
        int[] dp = new int[X+1];
        dp[0] = 0;
        dp[1] = 0;
        
        for(int i=2; i<=X; i++) {
        	if(i%6 == 0) {
        		dp[i] = Math.min(dp[i/3], Math.min(dp[i/2], dp[i-1])) + 1;
        	}
        	else if(i%3 == 0) {
        		dp[i] = Math.min(dp[i/3], dp[i-1]) + 1;
        	}
        	else if(i%2 == 0) {
        		dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
        	}
        	else {
        		dp[i] = dp[i-1] + 1;
        	}
        }
        
        bw.write(String.valueOf(dp[X]));
        bw.flush();
        bw.close();
	}
}