package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


// 나머지
public class Problem_3052R {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] arrNum = new int[10]; // 입력받은 10개의 정수를 각각 42로 나눈 후 나머지를 담을 변수
		
		for (int i = 0; i < arrNum.length; i++) { // 배열 변수에 입력받은 순서대로 42로 나누고 나머지를 저장
			
			arrNum[i] = Integer.parseInt(br.readLine()) % 42;
			
		}
		
		
		br.close();
		
		HashSet<String> hashset = new HashSet<>(); // HashSet 생성
		
		
		for (int num : arrNum) { // HashSet 값 추가 기능을 이용 위에서 구한 나머지값들을 중복을 제거하며 추가 
			
			hashset.add(String.valueOf(num));
			
		}
		
		System.out.println(hashset.size()); // HashSet에 저장된 값의 갯수를 출력
		
	}

}
