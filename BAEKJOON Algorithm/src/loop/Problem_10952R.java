package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// A + B - 5
public class Problem_10952R {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCaseNum = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
	
		String zero = "0/0";
		
		for (int i = 0; i <= testCaseNum; i++) {
			
			if (i == testCaseNum) {
				st = new StringTokenizer(zero, "/");
			} else {
				st = new StringTokenizer(br.readLine());
				bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			}
						
		}
		
		bw.flush();
		bw.close();
		
		br.close();
		
	}

}
