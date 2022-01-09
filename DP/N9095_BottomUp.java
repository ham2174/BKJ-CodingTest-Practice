package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N9095_BottomUp { //BottomUp

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=0; i<T; i++) {
        	int n = Integer.parseInt(br.readLine());
        	for(int j=3; j<=n; j++) {
        		dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
        	}
        	bw.write(String.valueOf(dp[n]+"\n"));
        }
        
        bw.flush();
        bw.close();
	}

}
