package arithmeticOperation;


import java.util.Scanner;

// 윤년
public class Problem_2753 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		sc.close();
		
		
		
		if (year % 4 == 0) { // 입력 연도가 4의 배수인가?
			
			if (year % 400 == 0) { // 입력 연도가 4의 배수이면서 400의 배수인가?
				System.out.println("1");  // true -> 윤년이므로 '1'출력
			} else if (year % 100 == 0) { // 입력 연도가 4의 배수이면서 100의 배수인가?
				System.out.println("0"); // true -> 윤년이 아니므로 '0'출력
			} else { // 입력 연도가 4이 배수이지만 400의 배수도 100의 배수도 아니면
				System.out.println("1"); // 윤년이므로 '1'을 출력
			}
			
		} else { // 입력 연도가 4의 배수가 아니면 윤년이 아니다.
			System.out.println("0"); // 윤년이 아니므로 '0'을 출력
		}		
	}
}


