package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 평균
public class Problem_1546R {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int testCaseNum = Integer.parseInt(br.readLine());
		
		int[] arrNum = new int[testCaseNum];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for (int i = 0; i < arrNum.length; i++) {
			
			arrNum[i] = Integer.parseInt(st.nextToken());
			
		}
		
		
		Arrays.sort(arrNum); // 최댓값을 구하기 위해 오름차순으로 정렬
		
		int max = arrNum[arrNum.length - 1]; // 최댓값 -> 오른쪽 끝자리 수
		
		
		
		double score = 0; // 새로운 방식을 적용할 점수 변수
		
		
		for (double num : arrNum) {
			
			score += (num / max) * 100; // 새로운 점수 누적
			
		}
		
		br.close();
		
		System.out.println(score / testCaseNum);
		
	}
}
