package characterString;

import java.util.Scanner;

public class Problem_1157 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; // 영문자의 개수는 26개
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) { // 문자열 s 에 대하여 첫 번째 문자부터 마지막 문자까지 검사하기 위한 반복문을 작성
		
			/*
			 먼저 대문자의 범위는 십진수로 65~90 이다.
			 그리고 소문자의 범위는 97~122 이다.
			 즉 C 를 입력받았을 때, 배열의 세 번째 원소인 2 을 도출해내려면 C 는 67 이니 65 를 빼주면 된다.
			 만약 소문자 e 를 입력받았을 경우에는 다섯 번째 원소인 4 를 도출해야하니 97을 빼주면 101 - 97 = 4 로 배열의 인덱스 값을 도출할 수 있다.
			 */
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				
				arr[s.charAt(i) - 'A']++; // (대문자)해당 인덱스의 값 1 증가(문자열에서 나온 중복 알파벳의 수를 세기위해)
				
			} else { // 소문자 범위
				
				arr[s.charAt(i) - 'a']++; // (소문자)해당 인덱스의 값 1 증가(문자열에서 나온 중복 알파벳의 수를 세기위해)
				
			}
			
		}
		
		int max = -1; // 최대값 기준
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			
			if (arr[i] > max) {
				
				max = arr[i];
				
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.				
				
			} else if (arr[i] == max) {
				
				ch = '?';				
				
			}
		}
		
		System.out.println(ch);
		
	}

}
