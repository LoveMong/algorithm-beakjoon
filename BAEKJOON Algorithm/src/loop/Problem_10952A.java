package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (입력 마지막에는 0 두 개가 들어온다.)
public class Problem_10952A {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		StringBuilder sb = new StringBuilder();
				
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				
				br.close();
				break;
				
			}
			
			sb.append((a+b)).append('\n');			
			
		}
		
		System.out.println(sb);
		
	}

}
