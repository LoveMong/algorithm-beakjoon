package loop;

import java.util.Scanner;

// A + B - 3
public class Problem_10950R {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testNum = sc.nextInt();
		
		int[] hap = new int[testNum];
		
		
		for (int i = 0; i < testNum; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			hap[i] = A + B;
			
		}
		
		
		for (int print : hap) {
			System.out.println(print);
		}
		
		
		sc.close();
		
	}
	
	
}
