package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
public class Problem_2741 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		br.close();
		
		
		int i = 1;
		
		while (i <= n) {
			
			bw.write(i + "\n");
			
			i++;
			
		}
		
		bw.flush(); // 버퍼 비우기
		bw.close(); // 버퍼 닫기
		

		
		
	}

}
