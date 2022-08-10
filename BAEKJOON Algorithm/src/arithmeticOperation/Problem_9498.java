package arithmeticOperation;

import java.util.Scanner;

// 시험 성적
public class Problem_9498 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		sc.close();
		
		
		
		switch (score/10) {
		case 9:
			System.err.println("A");
			break;
		
		case 8:
			System.err.println("B");
			break;
		
		case 7:
			System.err.println("C");
			break;
		
		case 6:
			System.err.println("D");
			break;	

		default:
			System.err.println("F");
			break;
		}
		
		
	}

	
	
}
