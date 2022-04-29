package method;

// 셀프넘버
public class Problem_4673 {
	
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001]; // 1부터 10000 까지의 셀프 넘버를 확인 하는 변수(기본 false)		
		
		for(int i = 1; i < 10001; i++) { // 1부터 10000 까지의 셀프 넘버를 확인
			
			int n = d(i); // 셀프 넘버가 아닌 수를 확인하는 메소드 호출 -> 셀프 넘버가 아닌 수를 변수 n에 초기화			
			
			if(n < 10001) {
				
				check[n] = true; // 셀프 넘버가 아닌 수의 인덱스를 true로 변경(셀프 넘버 = false가 됨)				
				
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			
			if (!check[i]) { // false만 출력에 담는다(셀프 넘버 만 출력에 담는다)				
				
				sb.append(i).append('\n');
				
			}
			
		}
		
		System.out.println(sb);
		
		
	}
	
	public static int d(int num) {
		
		int sum = num;
		
		while (num != 0) { // 셀프 넘버가 아닌 수를 구하는 알고리즘
			
			sum = sum + (num % 10);
			num = num/10;
			
			/*
			 1234 + 1 + 2 + 3 + 4 = 1244
             즉 sum 에 먼저 1234 라는 수를 선언과 함께 초기화 시켜주었고, 다음 반복문부터 각 자리수를 더해주는 방식인 것이다.
				
				[반복문]
				
				첫 번째 반복 )
				
				number % 10 = 4 이므로 sum 에 4 가 더해져 sum 은 1238 이 된다.
				
				number / 10 = 123 이고 이 수가 새로운 number 가 된다. 즉 number = 123 이 된다.
				
				 
				
				두 번째 반복 )
				
				number % 10 = 3 이므로  sum 에 3 이 더해져 sum 은 1241 이 된다.
				
				number / 10 = 12 이고 이 수가 새로운 number 가 된다. 즉 number = 12 가 된다.
				
				 
				
				세 번째 반복 )
				
				number % 10 = 2 이므로  sum 에 2 가 더해져 sum 은 1243 이 된다.
				
				number / 10 = 1 이고 이 수가 새로운 number 가 된다. 즉 number = 1 이 된다.
				
				 
				
				네 번째 반복 )
				
				number % 10 = 1 이므로  sum 에 1 이 더해져 sum 은 1244 가 된다.
				
				number / 10 = 0 이고 이 수가 새로운 number 가 된다. 즉 number = 0 이 된다.
				
				 
				
				이후 while 조건문에 의해 number 가 0 이므로 반복문을 탈출한다.
				
				그리고 sum 을 return 해주면 된다.


			 */
			
		}
		
		return sum;
		
	}

}
