package characterString;

import java.io.IOException;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
// System.in 사용
public class Problem_11654A {

	public static void main(String[] args) throws IOException {
		
		// System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장
		// 예외 처리 필요
		int a = System.in.read();
		
		System.out.print(a);


	}

}
