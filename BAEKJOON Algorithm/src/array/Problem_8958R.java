package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// OX퀴즈
public class Problem_8958R {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCaseNum = Integer.parseInt(br.readLine()); // 테스트케이스 수 입
		
		String[] quizResult = new String[testCaseNum]; // 퀴즈 결과를 담는 String 배열 변수 생성
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for (int i = 0; i < testCaseNum; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			quizResult[i] = st.nextToken();
			
			int cnt = 0; // 연속 점수
			
			int sum = 0; // 누적 점수
			
			
			for (int j = 0; j < quizResult[i].length(); j++) { // 첫 번째 테스트케이스 OX 결과들 중에서
				
				if (quizResult[i].charAt(j) == 'O') { // j번째 문자가 'O' 라면 
					
					cnt++; // 연속 점수 ++
					
					sum += cnt; // 연속 점수를 누적 점수에 합함
					
				} else if (quizResult[i].charAt(j) == 'X') { // j번째 문자가 'X' 라면
					
					cnt = 0; // 연속 점수 0으로 초기화
					
				}
				
			}		
			
			sb.append(sum + "\n");
			
		}
		
		br.close();
		
		System.out.println(sb);
		
	}

}
