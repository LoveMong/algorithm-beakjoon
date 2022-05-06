package characterString;

import java.util.Scanner;

// 아스키코드 값 이용
/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class Problem_10809A {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; // 알파벳 갯수만큼 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = -1; // 배열 전부를 -1로 초기화
			
		}
	
		String s = sc.nextLine(); // 문자열 입력 받는다.	
		
		/*
		 그리고 ch 의 문자의 위치를 우리가 앞서 만든 arr 배열의 값으로 바꿔준다.
		 이때 문제에서 위치는 0 부터 시작한다고 했으니 ch 의 문자의 위치는 i 가 되는 것을 알 수 있다.
		 또한 arr 배열의 인덱스(원소 위치)는 ch 가 갖고 있는 문자 인코딩 값(=아스키코드 값과 동일)에 'a' 또는 97 을 빼주면 된다.
         ( a 는 10진수로 97 이라는 값에 대응된다.)
		 만약 b 라는 문자가 ch 에 담겨있을 경우 b - 'a' 또는 b - 97 을 하면 1 이 되고, arr[1] 은 문자 b를 가리키는 것을 의미한다.
		 즉 아래와 같이 짜면 된다.		 
		 */
		
		for(int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(arr[ch - 'a'] == -1) { // arr 원소 값이 -1인 경우에만 초기화
				
				arr[ch - 'a'] = i;
				
			}
			
		}
				
		for(int val : arr) { // 배열 출력
			
			System.out.print(val + " ");
			
		}
		
	}

}
