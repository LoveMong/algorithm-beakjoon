package arithmeticOperation;

import java.util.Scanner;

// 오븐 시
public class Problem_2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int setHour = sc.nextInt();
		int setMinute = sc.nextInt();
		
		int cookingTime = sc.nextInt();
		
		int outputHour;
		int outputMinute;
		
		sc.close();
		
		
		if (setMinute + cookingTime > 59) {
			
			outputHour = setHour + ((setMinute + cookingTime) / 60);
			outputMinute = (setMinute + cookingTime) % 60;
			
			if (outputHour > 23) {
				
				outputHour -= 24;		
				
			}
		
		} else {
			
			outputHour = setHour;
			outputMinute = setMinute + cookingTime;
					
		}
		
		System.out.println(outputHour + " " + outputMinute);
		
	}
	
}
