package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 더하기 사이클
public class Problem_1110R {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		int A = N;
		
		br.close();
		
		
		do {
			result++;
			A = ((A % 10) * 10) + (((A / 10) + (A % 10)) % 10); 
		} while(N != A);
			
		System.out.println(result);
		
	}
}
