package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BufferedReader, StringBuilder 사용한 빠른 A + B 
public class Problem_15552 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		//StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스, 쪼개어진 문자열은 토큰(token)
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " "); // 입력받는 두 정수 문자열 분리
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);
		
	}

}
