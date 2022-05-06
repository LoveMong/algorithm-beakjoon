package characterString;

import java.util.Scanner;

public class Problem_10809 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j',
						   'k','l','m','n','o','p','q','r','s','t',
						   'u','v','w','x','y','z'};
		
//		char[] cWord = new char[word.length()];
//		for(int i = 0; i < word.length(); i++) {
//			
//			cWord[i] = word.charAt(i);
//			
//		}
		
		int confirm = 0;
		
		for(int i = 0; i < alphabet.length; i++) {
			
			for(int j = 0; j < word.length(); j++) {
				
				if(alphabet[i] == word.charAt(j)) {
					
					System.out.print(j);
					
					confirm = 1;
					
					break;
					
				}
				
			}
			
				if(confirm == 0)
				
				System.out.print("-1 ");					
			
		}
		
		
	}

}
