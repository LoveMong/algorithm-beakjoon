package characterString;

import java.util.Scanner;

// 크로아티아 알파벳
public class Problem_2941 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch == 'c') { // ch 가 c 라면?
				if (i < str.length() -1) {
					if (str.charAt(i + 1) == '=') { // ch 다음 문자가 '=' 라면?
						i++; // i + 1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
					} else if (str.charAt(i + 1) == '-') {
						i++;						
					}
				}			
			}
			
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {	// dz= 일 경우
								i += 2;
							}
						}
					}
		        
					else if(str.charAt(i + 1) == '-') {	// d- 일 경우
						i++;
					}
				}
			}
		    
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// lj 일 경우
						i++;
					}
				}
			}
		    
			else if(ch == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {	// nj 일 경우
						i++;
					}
				}
			}
 
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// s= 일 경우
						i++;
					}
				}
		    }
 
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {	// z= 일 경우
						i++;
					}
				}
			}
		    
			count++;
 
		}
 
		System.out.println(count);
			
	}
		
		
}
	
	

