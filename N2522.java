package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N2522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N;i++) {
			for(int j=i; j<N; j++) {
				bw.write(" ");
			}
			for(int k=0; k<i; k++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		for(int i=1; i<N; i++) { // N = 3
			for(int j=0; j<i; j++) {
				bw.write(" ");
			}
			for(int k=N-i; k>0; k--) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		
		
		bw.flush();
		bw.close();
	}

}