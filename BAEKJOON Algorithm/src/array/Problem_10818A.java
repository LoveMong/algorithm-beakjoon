package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_10818A {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			num[i] = sc.nextInt();
			
		}
		
		sc.close();
		Arrays.sort(num); // 메서드의 매개값으로 기본 탑입 배열이나 String배열 지정 시 자동 오름차순 정렬
		System.out.println(num[0] + " " + num[n-1]);
		
	}

}
