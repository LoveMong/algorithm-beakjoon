package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 최댓값
public class Problem_2562R {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrNum = new int[9]; // 입력받을 9개의 자연수를 담을 배열 변수 선언
		int max = 0; // 최댓값을 저장하기 위한 변수 선언
		int count = 0; // 최댓값이 배열의 몇 번째에 위치하는지 확인하는 변수 선언
		
		for (int i = 0; i < arrNum.length; i++) { // 최댓값 구하는 반복문
			
			arrNum[i] = Integer.parseInt(br.readLine());
			
			if (max < arrNum[i]) {
				max = arrNum[i];						
			}
			
		}
		
		
		for (int num : arrNum) { // 최댓값이 몇 번째에 위치해있는지 확인하는 반복문
			if (num != max) {
				count++;
			} else {
				count++;
				break;
			}
		}
		
		br.close();
		
		System.out.println(max + "\n" + count);	
		
	}
}
