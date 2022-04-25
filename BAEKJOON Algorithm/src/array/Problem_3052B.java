package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
public class Problem_3052B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		
		
		for(int i = 0; i < 10; i++) {
			
			h.add(Integer.parseInt(br.readLine()) % 42);
			
		}
		
		System.out.println(h.size());
		
	}

}
