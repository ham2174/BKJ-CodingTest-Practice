package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N11726_TopDown {
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int X = Integer.parseInt(br.readLine()); 
        dp = new int[1001];
        
        bw.write(String.valueOf(TopDown(X)));
        bw.flush();
        bw.close();
	}
	static int TopDown(int X) { // f(n) = f(n-1) + f(n-2);
		if(X == 0 || X == 1) {
			return 1;
		}
		if(dp[X] > 0) return dp[X]; // 값을 저장하여 빠르게 처리 하기 위한 구문★★★★★★★
		
		dp[X] = TopDown(X-1) + TopDown(X-2);
		dp[X] %= 10007;
		
		return dp[X];
	}
}