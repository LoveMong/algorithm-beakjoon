package arithmeticOperation;

import java.util.Scanner;

// 알람 시계
public class Problem_2884 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputHour = sc.nextInt();
		int inputMinute = sc.nextInt();
		
		int outputHour;
		int outputMinute;
		
		if (inputMinute >= 45) {
			
			outputHour = inputHour;
			outputMinute = inputMinute - 45;
			
		} else {
			
			if (inputHour == 0) {
				
				outputHour = 23;
				outputMinute = 60 - (45 - inputMinute);
				
			} else {
				
				outputHour = inputHour - 1;
				outputMinute = 60 - (45 - inputMinute);
				
			}
			
		}
		
		System.out.println(outputHour + " " + outputMinute);
		
		
	}

}
