package array;


import java.util.Scanner;


public class Problem_2562 {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		
		for(int i = 0; i < 9; i++) {
			
			n[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		int max = n[0];
		int iNum = 1;
		
		for(int i = 1; i < n.length; i++) {
			
			if (max < n[i]) {
				
				max = n[i];
				iNum = i + 1;
				
			}
			
		}
		
		System.out.println(max);
		System.out.println(iNum);
		
	}

}
