package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N11727_TopDown { // TopDown
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        dp = new int[1001];
        
        bw.write(String.valueOf(TopDown(n)%10007));
        bw.flush();
        bw.close();
	}
	static int TopDown(int n) {
		if(n == 0) { return 0;}
		if(n == 1) { return 1;}
		if(n == 2) { return 3;}
		if(dp[n] > 0) { return dp[n];} // 값을 저장하여 빠르게 처리 하기 위한 구문★★★★★★★
		
		dp[n] = TopDown(n-1) + (2 * TopDown(n-2));
		dp[n] %= 10007;
		return dp[n];
	}
	
}
