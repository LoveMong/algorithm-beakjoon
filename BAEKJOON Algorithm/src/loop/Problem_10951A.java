package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. -> 파일 종료 조건이 없이 그냥 입력이 주어짐
// 입력의 종료는 더이상 읽을 수 있는 데이터 (EOF) 가 없을 때 종료한다.
public class Problem_10951A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		
		while ( (str = br.readLine()) != null) {
			
			StringTokenizer st = new StringTokenizer(str, " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a + b).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);
		
		
		
	}

}
