package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class Problem_11021 {
	
	public static void main(String []args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int caseNum = Integer.parseInt(br.readLine());
			
		StringTokenizer st;
			
			
		for(int i = 1; i <= caseNum; i++) {
				
			st = new StringTokenizer(br.readLine(), " ");
				
			bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ) + "\n" );
				
		}
			
		br.close();
			
		bw.flush();
		bw.close();
			
			
			
	}


}
