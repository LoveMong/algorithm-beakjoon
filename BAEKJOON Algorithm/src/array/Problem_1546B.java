package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BufferedReader + 배열X 
// 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오
public class Problem_1546B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 입력 받을 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = 0;
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			
			int value = Integer.parseInt(st.nextToken());
			
			if (value > max) {
				
				max = value; // 입력받은 점수 중 최댓값 저장
				
			}
			
			sum += value; // 입력받은 점수의 합
			
		}
		
		System.out.println( ((sum/max) * 100) / n );


	
	}
	
	/*
	  
	 	먼저 입력 개수 N 을 받는다.

		다음 줄에 StringTokenizer 을 생성과 동시에 BufferedReader.readLine() 으로 한 줄을 입력받으면서 공백(" ")으로 구분시켜준다.
		
		 
		
		다음으로 맨 처음 max 값을 -1 로 초기화 한다. (입력받을 값이 0보다 크거나 같기 때문)
		
		 
		
		그리고 StringTokenizer 의 토큰(분리된 문자열)을 꺼내오면서 value에 저장한 뒤 max 값과 비교하고, sum 에 value 값을 더해준다.
		
		 
		
		그리고 굳이 매번 하나의 value 마다 (value/max)*100 을 해주면서 sum 에 더해주는 것 보다는 마지막에 한번에 연산한 값을 출력해주는게 연산을 덜 할 것이다. (이때 sum 이 double이라 연산값 또한 double 로 형변환 되어 반환된다.)
		
		 
		
		예로들어 3, 7, 6, 2 라는 값을 입력받았을때
		
		(3/7)*100 + (7/7)*100 + (6/7)*100 + (2/7)*100 이렇게 하나
		
		((3+7+6+2) / 7)*100 을 하나 값은 같기 때문에 상관이 없다.


	 */

}
