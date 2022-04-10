package loop;

import java.util.Scanner;

public class Multiplication {
	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			
			num = sc.nextInt();
			
		} while(num < 0 || num > 9);
		
		
		
		for(int i = 1; i <= 9; i++) {
			
			System.out.println(num + " * " + i + " = " + (num * i));
			
		}
		
		sc.close();
	
	
	
	}
	

}
