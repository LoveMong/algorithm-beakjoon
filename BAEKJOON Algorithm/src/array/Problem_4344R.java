package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 평균은 넘겠지
public class Problem_4344R {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCaseNum = Integer.parseInt(br.readLine());

	
		for (int i = 0; i < testCaseNum; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()); // 학생 수 입력
			
			int[] arrN = new int[n]; // 학생 수 크기의 점수 변수			
			
			int sum = 0; // 총 점수
			
			
			for (int j = 0; j < n; j++) {
				
				arrN[j] = Integer.parseInt(st.nextToken());
				
				sum += arrN[j];
				
			}
			
			double average = sum / n; // 평균 점수
			
			double count = 0; // 평균 보다 높은 점수를 가진 학생 수 
			
			
			for (int y : arrN) {
				
				if(y > average) {
					
					count++;
					
				}
				
			}
		
			System.out.printf("%.3f%%\n", (count /n) * 100);
			
		}
		
		br.close();
		
	}

}
