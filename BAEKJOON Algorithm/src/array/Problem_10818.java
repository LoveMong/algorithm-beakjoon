package array;

import java.util.Random;
import java.util.Scanner;

public class Problem_10818 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();		
		sc.close();
		
		int[] num = new int[n];
		
		Random random = new Random();
		
		System.out.print("정수나열 : ");
		
		
		
		for(int i = 0; i < n; i++) {
			
			num[i] = random.nextInt(100);			
			
			System.out.print(num[i] + " ");
			
		}
		
		System.out.println();
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 1; i < num.length; i++) {
			
			if (max < num[i]) {
				
				max = num[i];
				
			} else if (max > num[i]) {
				
				min = num[i];
				
			}
			
		}	
		
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);
		
	}

}
