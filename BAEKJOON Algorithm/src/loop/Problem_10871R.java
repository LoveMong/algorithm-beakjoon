package loop;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// X보다 작은 수
public class Problem_10871R {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int testCaseNum = Integer.parseInt(st.nextToken());
		int targetNum = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < testCaseNum; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			
			if (num < targetNum) {
				sb.append(num).append(" ");
			}
			
		}
		
		System.out.println(sb);
		
		br.close();
		
	}

}
