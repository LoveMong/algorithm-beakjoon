package array;

import java.util.Scanner;

// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
public class Problem_4344A {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr;
		
		int testcase = sc.nextInt();
		
		for(int i = 0; i < testcase; i++) {
			
			int n = sc.nextInt(); // 학생 수 입력
			
			arr = new int[n];
			
			double sum = 0; // 성적 누적 합 변수
			
			
			//성적 입력 부분
			for(int j = 0; j < n; j++) {
				
				int val = sc.nextInt(); // 성적 입력
				arr[i] = val;
				sum += val; // 성적 누적 합
				
				
			}
			
			double mean = (sum/n);
			double count = 0; // 평균 넘는 학생 수 변수
			
			// 평규 넘는 학생 비율 찾기
			for(int j = 0; j < n; j++) {
				
				if(arr[j] > mean) {
					
					count++;
					
				}
				
			}
			
			System.out.printf("%.3f%%\n",(count/n) * 100);
			
			
		}
		
		sc.close();
		
	}

}
