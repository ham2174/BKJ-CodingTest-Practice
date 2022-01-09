package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N11726_BottomUp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int X = Integer.parseInt(br.readLine()); 
        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2; i<=X; i++) {
        	dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        
        bw.write(String.valueOf(dp[X]%10007));
        bw.flush();
        bw.close();
	}

}
