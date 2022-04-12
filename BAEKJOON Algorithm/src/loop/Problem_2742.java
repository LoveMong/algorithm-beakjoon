package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
public class Problem_2742 {
	
	public static void main(String []args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			System.out.println(n - i);
			
		}
		
		br.close();
		
	
		
	}

}
