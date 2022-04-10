package loop;

import java.util.Scanner;

public class Problem_10950 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;		
		int c = sc.nextInt();
		
		int arr[] = new int[c];
		
		for (int i = 0; i < c; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			arr[i] = a + b;			
			
		}
		
		for (int d : arr) {
			
			System.out.println(d);
			
		}
		
		
		
		
		
		
	}
	
	

}
