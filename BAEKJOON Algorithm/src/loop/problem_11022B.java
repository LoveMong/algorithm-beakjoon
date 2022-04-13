package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.(다른 방법 B)
public class problem_11022B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int a;
		int b;
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		
		for(int i = 1; i <= t; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sb.append("Case #" + i + ": ")
			  .append(a + " + " + b + " = " + (a+b))
			  .append('\n');
			
			
		}
		
		br.close();
		System.out.println(sb);
		
		
	}

}
