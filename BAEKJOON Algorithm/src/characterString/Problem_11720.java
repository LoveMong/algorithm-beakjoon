package characterString;

import java.util.Scanner;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
// charAt() 사용
public class Problem_11720 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		String num = sc.next();
		
		sc.close();
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			System.out.println(num.charAt(i));
			sum += num.charAt(i) - '0'; //  char - '0'을 이용하면 아스키코드값을 알 필요없이 int형으로 변환
			
			
		}
		
		System.out.println(sum);		
		
		
	}

}
