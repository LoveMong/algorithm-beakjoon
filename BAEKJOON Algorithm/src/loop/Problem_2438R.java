package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 별 찍기
public class Problem_2438R {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCaseNum = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= testCaseNum; i++) {
				
			for (int j = 1; j <= i; j++) { // 첫 번째 for문 i만큼 별을 출력
				
				bw.write("*");
				
			}
			
			bw.newLine(); // 두 번째 for문 완료 이후 줄바꿈
			
		}
		
		bw.flush();
		bw.close();
		
		br.close();
		
	}
}
