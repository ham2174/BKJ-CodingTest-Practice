package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) { // N = 2
			for(int j=0; j<N-i; j++) {
				bw.write(" ");
			}
			for(int k=0; k<i*2-1; k++) {
				if(k==0) {
					bw.write("*");
				}
				else if(k%2 == 1) {
					bw.write(" ");
				}
				else {
					bw.write("*");
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

}