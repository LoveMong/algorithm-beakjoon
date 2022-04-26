package array;

import java.util.Scanner;


// 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오
public class Problem_1546 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] num = new float[n];
		
		for(int i = 0; i < num.length; i++) {		
			
			num[i] = sc.nextInt();			
			
		}
		
		sc.close();
		
		float max = num[0];
		
		for(int i = 1; i < num.length; i++) {
			
			if(max < num[i]){
				
				max = num[i];
				
			}
			
		}		
		
		
		for(int i =0; i < num.length; i++) {
			
			float a = num[i]/max; 
			num[i] = a*100;
		
		}	
		
		float sum = 0;
		for(float arr : num) {			
			
			sum += arr;
			
		}
		
		System.out.println(sum/num.length);
	
	}

}
