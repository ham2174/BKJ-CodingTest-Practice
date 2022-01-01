package IO;

import java.io.*;
import java.util.StringTokenizer;

public class N11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int count=1;
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case #" + count + ": ").append(a+b).append("\n");
			count++;
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
