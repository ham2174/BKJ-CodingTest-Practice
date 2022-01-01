package IO;

import java.io.*;
import java.util.StringTokenizer;

public class N2558 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(); 

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st2.nextToken());
		
		sb.append(a+b);
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();

	}

}
