package characterString;

import java.util.Scanner;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class Problem_11654 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 [입력] String 으로 입력받는다.

		-> [charAt()] String 에서 char 로, 즉 문자열을 잘라 문자로 변환한다.
		
		-> int 타입 변수에 저장함으로써 문자에 대응되는 값, 즉 아스키 코드값을 저장한다.
		 */
		
		int a = sc.next().charAt(0);
		
		System.out.print(a);
		
		sc.close();

	}

}
