package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 별 찍기 2
public class Problem_2439R {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCaseNum = Integer.parseInt(br.readLine());
		
		
		for (int i = 1; i <= testCaseNum; i++) {
			
			for (int j = 1; j <= testCaseNum - i; j++) {
				
				bw.write(" ");
				
			}
			
			for (int k = 1; k <= i; k++) {
				
				bw.write("*");
				
			}
			
			bw.newLine();
			
		}
		
		bw.flush();
		bw.close();
		
		br.close();
		
		
	}
}
