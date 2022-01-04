package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N11721 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int len = str.length();
		int startIndex = 0;
		int endIndex = 10; 
		
		for(int i=0; i<len/10; i++) {
			bw.write(str.substring(startIndex, endIndex)+"\n");
			startIndex += 10;
			endIndex += 10;
		}
		
		bw.write(str.substring(startIndex)); // 마지막 줄 처리
		bw.flush();
		bw.close();
	}

}
