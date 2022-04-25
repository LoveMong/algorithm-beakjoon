package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
// 배열 사용
public class Problem_3052C {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr = new boolean[42];
		
		
		for(int i = 0; i < 10; i++) {
			
			arr[Integer.parseInt(br.readLine()) % 42] = true;
			
		}
		
		br.close();
		
		int count = 0;
		
		for(boolean value : arr) {
			
			if(value) { // value 가 true 라면
				
				count++;
				
			}			
			
		}
		
		System.out.println(count);
		
	}

}
