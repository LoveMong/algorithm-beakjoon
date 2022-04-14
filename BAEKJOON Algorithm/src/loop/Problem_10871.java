package loop;

import java.util.Scanner;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
public class Problem_10871 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		for(int i = 0; i < n; i++) {
			
			if(a[i] < x) {
				
				System.out.print(a[i] + " ");
				
			}
			
			
		}
		
		
	}
		


}
