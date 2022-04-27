package array;

import java.util.Scanner;

// Key : charAt() 메소드
/*
 OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
*/
public class Problem_8958 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[sc.nextInt()]; // 테스트케이스 수 입력
		
		for(int i = 0; i < str.length; i++) {
			
			str[i] = sc.next(); // OX 퀴즈 결과 입력
			
		}
		
		sc.close();
		
		for(int i = 0; i < str.length; i++) {
			
			int cnt = 0; // 연속 점수
			int sum = 0; // 누적 점수
			
			for(int j = 0; j < str[i].length(); j++) {
				
				if(str[i].charAt(j) == 'O') { // 첫번째 테스트케이스 OX퀴즈 결과에서 정답(O)인 것 확인
					
					cnt++; // 점수 획득
					
					
				} else {
					
					cnt = 0; // 정답이 아니면 연속 점수 초기화
					
				}
				
				sum += cnt; // 획득 점수 -> 누적 점수로 반영
				
				
			}
			
			System.out.println(sum);
			
			
		}
		
		
	}

}
