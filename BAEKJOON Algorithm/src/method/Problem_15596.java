package method;

import java.util.Random;

// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
public class Problem_15596 {
	
	public static long sum(int[] a) { // 배열 a의 합을 구하는 함수
		
		int[] num = a;
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			
			sum += num[i];			
			
		}
		
		return sum;			
		
	}
	
	public static void main(String[] args) {
		
		Random rNum = new Random();
		
		int xNum = rNum.nextInt(10); // 난수 이용
		
		int[] a = new int[xNum];
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = xNum;			
		
			System.out.print(a[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("배열 a의 합 : " + sum(a));		
		
	}

}
