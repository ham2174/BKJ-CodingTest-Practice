package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N11727_BottomUp { // ButtomUp

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        
        for(int i=3; i<=n; i++) {
        	dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
        
        bw.write(String.valueOf(dp[n]%10007));
        bw.flush();
        bw.close();
	}

}
