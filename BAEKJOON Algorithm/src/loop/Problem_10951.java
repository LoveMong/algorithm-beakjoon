package loop;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. -> 파일 종료 조건이 없이 그냥 입력이 주어짐
// 입력의 종료는 더이상 읽을 수 있는 데이터 (EOF) 가 없을 때 종료한다.
public class Problem_10951 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) { // hasNextInt() -> 입력값이 정수일경우 true를 반환, 아닐경우 예외를 발생시킴
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a + b);			
			
		}
		
		sc.close();		
		
		
	}

}
