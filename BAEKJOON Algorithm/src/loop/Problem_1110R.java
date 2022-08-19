package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 더하기 사이클
public class Problem_1110R {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 테스트 정수 입력 받음
		int result = 0; // 입력받은 정수로 몇 번 만에 돌아오는지 체크하는 기준
		int A = N; // 새로운 수를 저장하기 위한 변수
		
		br.close();
		
		
		do {
			
			result++;
			
			A = ((A % 10) * 10) + (((A / 10) + (A % 10)) % 10);
			
		} while(N != A); // 입력받은 정수와 새로운 수가 같아질 때까지 반복문 실행
			
		System.out.println(result);
		
	}
}
