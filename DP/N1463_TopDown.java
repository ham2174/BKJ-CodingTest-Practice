package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N1463_TopDown { //TopDown 방식
	
	static Integer[] dp; // dp 클래스 배열 생성
	
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int X = Integer.parseInt(br.readLine()); //정수 X 입력
        
        dp = new Integer[X+1]; // dp 클래스 배열에 입력값+1 만큼 배열의 길이 생성
        dp[0] = 0; 
        dp[1] = 0; // 1은 연산이 필요 없기 때문에 값을 0으로 지정
        		   
        bw.write(String.valueOf(solution(X))); // solution 메소드 호출 하면서 출력
        bw.flush();
        bw.close();
    }
	
	public static int solution(int X) { // 조건> 1. X/3   2. X/2  3. X-1 세가지 조건을 이용하여 1을 만들었을 때 연산의 최솟값 구하기
		if(dp[X] == null) {
			if(X%6 == 0) { // 2와 3의 공통 배수 6의 배수 일 경우
				dp[X] = Math.min(solution(X-1), Math.min(solution(X/3), solution(X/2))) + 1;
			}
			else if(X%3 == 0) { // 3의 배수일 경우
				dp[X] = Math.min(solution(X/3), solution(X-1)) + 1;
			}
			else if(X%2 == 0) { // 2의 배수일 경우
				dp[X] = Math.min(solution(X/2), solution(X-1)) + 1;
			}
			else { // 빼기 1을 해야 하는 경우
				dp[X] = solution(X-1) + 1;
			} // 빼기 1은 항상 조건에서 먼저 생각해야 하기 때문에 모든 조건문에 같이 넣어 준다.
		}
		return dp[X]; // 누적된 최솟값 리턴
	}
}