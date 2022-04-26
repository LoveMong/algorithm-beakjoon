package array;

import java.util.Arrays;
import java.util.Scanner;

// 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오
public class Problem_1546A {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		double[] num = new double[sc.nextInt()];
		
		for(int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextDouble();
			
		}
		
		sc.close();
		
		double sum = 0;
		Arrays.sort(num); // 배열 정렬(오름차순)을 이용 최댓값 구한다.(최댓값 위치 = 배열 길이 - 1)
	
		for(int i = 0; i < num.length; i++) {
			
			sum += (num[i] / num[num.length - 1]) * 100;
			
		}
		
		System.out.println(sum / num.length);		

	
	}
	
	/*

	먼저 배열에 모든 원소를 입력받아 저장하고 Arrays 패키지에 있는 sort() 를 사용하여 정렬을 한다.

	그러면 오름차순으로 정렬이 되고 최댓값은 배열의 마지막 원소가 된다.

	또한 주의해야 할 점이 오차범위가 있기 때문에 반드시 연산 할 때 최소한 자료형 1개 이상은 double 형으로 써야한다. 그러면 자동 형변환이 되면서 자료형이 큰 쪽으로 (int 에서 double) 변환이 되기 때문이다.
	
	이 코드에서는 배열과 sum 을 double 형으로 해줬다.


	 */

}
