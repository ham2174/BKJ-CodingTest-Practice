package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N10844_BottomUp { // BottomUp

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        long[][] dp = new long[N+1][10];
        
        for(int i=1; i<=9; i++) { // 1자리수의 자릿값 경우의 수 초기화
        	dp[1][i] = 1;
        }
        
        for(int i=2; i<=N; i++) {
        	for(int j=0; j<10; j++) {
        		if(j == 0) { // 자릿값 "0"일 경우 다음에 오는 수가 "1"밖에 없음
        			dp[i][j] = dp[i-1][j+1] % 1000000000;} 
        		else if(j == 9) { // 자릿값 "9"일 경우 다음에 오는 수가 "8"밖에 없음
        			dp[i][j] = dp[i-1][j-1] % 1000000000;} 
        		else { // 자릿값이 "1~8" 일 경우 -1, +1의 수가 올 수 있음
        			dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;}
        	}
        }
        
        long sum = 0; // 경우의 수 토탈 합
        for(int i=0; i<=9; i++) {
        	sum += dp[N][i];
        }
        
        bw.write(String.valueOf(sum%1000000000));
        bw.flush();
        bw.close();
	}
}
