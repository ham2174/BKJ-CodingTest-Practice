package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class N1924 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] weekend = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int mon = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i=0; i<mon; i++) {
			sum += days[i];
		}
		sum += day;
		
		bw.write(weekend[sum%7]);
		bw.flush();
		bw.close();

	}

}
