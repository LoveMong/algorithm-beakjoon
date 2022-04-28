package array;

import java.util.Scanner;

// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
public class Problem_4344 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[][] n = new int[a][b]; // (2차원 배열 사용) 테스트케이스 수, n명의 점수 변수 생성
		
		for(int i = 0; i < n.length; i++) {
			
			int sum = 0; // [i]번째 테스트케이스의 n명 학생들의 점수의 합
			int avNum = 0; // [i]번째 테스트케이스의 n명 학생들의 점수 평균
			int count = 0; // [i]번째 평균점수보다 높은 점수의 학생 수			
			
			for(int j = 0; j < n[i].length; j++ ) { 
				
				n[i][j] = sc.nextInt(); // [i]번째 테스트케이스 점수 입력
				
				sum += n[i][j]; // 점수 누적 시킴
				
			}
			
			avNum = sum / n[i].length; // 평균 점수 입력		
			
			for(int j = 0; j < n[i].length; j++) {
				
				if (avNum < n[i][j]) {
					
					count++;
					
				}				
				
			}
			
			double num = (Double.valueOf(count) / Double.valueOf(b)) * 100;			
			
			System.out.println(String.format("%.3f", num));
			
			
		}
		
		sc.close();
		
	}

}
