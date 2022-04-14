package loop;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (입력 마지막에는 0 두 개가 들어온다.)
public class Problem_10952 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				
				sc.close();
				break;
				
			}
			
			System.out.println(a+b);
			
			
			
		}

		
	}

}
