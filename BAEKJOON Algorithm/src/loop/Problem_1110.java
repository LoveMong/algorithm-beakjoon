package loop;

import java.util.Scanner;

//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
public class Problem_1110 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int copyNum;
		int t = 0;
		
		do {
			
			System.out.println("0 <= N <= 99 정수 N 입력");
			
			n = sc.nextInt();
			
		} while (n < 0 && n > 99);
		
		sc.close();
		
		
		copyNum = n; // 변수 복사
		
		
		while (true) {
			
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			
			
			t++;
			
			
			if(n == copyNum) {
				
				break;
				
			}
			
		}
		
		
		System.out.println(t);
		
		
		
	}

}
