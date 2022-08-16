package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// A + b - 5
public class Problem_10952R1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while (true) { // A와 B에 '0'이 입력될 때까지 두 수를 더한 후 StringBulider에 저장한다.
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				
				br.close();
				break; // 조건이 참이면 진행중인 반복문을 빠져나감			
				
			}
			
			sb.append((a+b)).append("\n");
			
		}
		
		System.out.println(sb);
		
	}

}
