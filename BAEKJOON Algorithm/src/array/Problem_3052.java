package array;

import java.util.Scanner;

// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
// 도전 실패..
public class Problem_3052 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("수를 입력 받아 42로 나눈 후 나머지를 저장한다.");
			System.out.print( (i + 1) + "번째 수 입력 :");
			num[i] = (sc.nextInt()) % 42;
			
		}
		
		sc.close();
		
		for(int arr : num) {
			
			System.out.print(arr + " ");
			
		}
		
		
		int count = 0;
		
		for(int i = 0; i < num.length; i++) {
			
			for(int j = i + 1; j < num.length; j++) {
				
				if(num[i] == num[j] && (num[i] * num[j] != 0) ) {
					
					count++;
					
				}
				
			}
			
		}		
		
		System.out.println(count);
		System.out.println("서로 다른 값의 개수는 ? " + (10 - count));
		
	}

}
