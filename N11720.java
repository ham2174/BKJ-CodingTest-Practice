package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		
		for(int i=0; i<N; i++) {
			sum += str.charAt(i) - '0'; // 아스키 코드 값을 인식을 하기 때문에 '0'을 빼준다. ('0' -> 10진수로 48)
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}

}
