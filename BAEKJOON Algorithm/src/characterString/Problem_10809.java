package characterString;

import java.util.Scanner;

/*
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
public class Problem_10809 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j',
						   'k','l','m','n','o','p','q','r','s','t',
						   'u','v','w','x','y','z'};		
		
		
		for(int i = 0; i < alphabet.length; i++) {
		
			int confirm = 0;
			
			for(int j = 0; j < word.length(); j++) {
				
				if(alphabet[i] == word.charAt(j)) {
					
					System.out.print(j + " ");
					
					confirm = 1;
					
					break;
					
				}
				
			}
			
			if (confirm == 0 ) {
				
				System.out.print("-1 ");
		
			}										
			
		}
		
		
	}

}
