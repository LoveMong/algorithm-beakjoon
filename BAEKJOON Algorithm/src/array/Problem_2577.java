package array;

import java.util.Scanner;

// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
public class Problem_2577 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		
		sc.close();
		
		String str = Integer.toString(value); // 문자열 분리를 위해 String형으로 변환
		
		
		for(int i = 0; i <= 9; i++) { // 0 ~ 9 각각의 수를 검사할 반복문
			
			int count = 0;
			
			for(int j = 0; j < str.length(); j++) { // 해당 인덱스의 문자와 i를 비교 후 count 한다.
				
				
				if ( (str.charAt(j) - '0') == i ) { // char - '0' 이용 시 아스키코드값을 알 필요없이 int형으로 변환
					
					count++;
					
				}
				
			}
			
			System.out.println(count);			
			
			
		}		
		
		
	}

}
