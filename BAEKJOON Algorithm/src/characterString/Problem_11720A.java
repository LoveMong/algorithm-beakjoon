package characterString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
public class Problem_11720A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			
			sum += (value - '0'); // '0' or '48'
			
		}
		
		/*
		 getBytes() 는 문자열을  byte 배열로 반환한다.
		 
		 즉, readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환되므로 for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
		 
		 이때 말했듯이 UTF-16 인코딩에 맞게 각 문자의 값을 저장하므로 반드시 '0' 또는 48 을 빼주어야 한다.
		 */
		
		System.out.println(sum);
		
	}

}
