package loop;

import java.util.Scanner;

public class Problem_11022 {
	
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int a;
		int b;
		
		for(int i = 1; i <= t; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
			
			
		}
		
		sc.close();		
		
		
	}

}
