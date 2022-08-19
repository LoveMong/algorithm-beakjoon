package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// 최소, 최대
public class Problem_10818R {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int testCaseNum = Integer.parseInt(br.readLine()); // 입력받을 정수의 수
		
		int[] arrNum = new int[testCaseNum]; // 입력받은 수의 크기 배열 선
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // 정수를 입력받아 StringTokenizer에 저장
		
		
		for (int i = 0; i < testCaseNum; i++) { // 반복문을 사용하여 입력받은 정수 배열의 값으로 넣어줌
			
			arrNum[i] = Integer.parseInt(st.nextToken());
					
		}
		
	
		br.close();
		
		Arrays.sort(arrNum); // 배열 변수 arrNum을 오름차순으로 정렬
	
		System.out.println(arrNum[0] + " " + arrNum[arrNum.length - 1]); // 첫번째 수-> min, 마지막 수 -> max
		
		
	}

}
