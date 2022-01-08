package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2445 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<i+1; j++) {
				bw.write("*");
			}
			for(int k=N*2-i; k>0; k--) {
				if(k>i) {
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			bw.write("\n");
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=i; j<=N; j++) {
				bw.write("*");
			}
			for(int k=1; k<i*2-1; k++) {
				bw.write(" ");
			}
			for(int h=N; h>=i; h--) {
				bw.write("*");
			}
				bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

}