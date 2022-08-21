package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 나머지
public class Problem_3052R {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int[] arrNum = new int[10];
		
		for (int i = 0; i < arrNum.length; i++) {
			
			arrNum[i] = Integer.parseInt(br.readLine()) % 42;
			
		}
		
		
		br.close();
		
		HashSet<String> hashset = new HashSet<>();
		
		
		for (int num : arrNum) {
			
			hashset.add(String.valueOf(num));
			
		}
		
		System.out.println(hashset.size());
		
	}

}
