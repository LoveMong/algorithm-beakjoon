package characterString;

import java.util.Scanner;

/*
 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
 S에는 QR Code "alphanumeric" 문자만 들어있다.
  */
public class Problem_2675 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 케이스 수
		
		for(int i = 0; i < t; i++) {
			
			/*
			  문자열 S 를 입력받을 때 Scanner.nextLine() 이 아닌 Scanner.next() 로 입력받아야 한다.
			  nextLine() 으로 입력받으면 입력 과정에서 공백까지 읽어버리기 때문(공백까지 같이 출력됨)			  
			 */
			
			int n = sc.nextInt(); // R의 수 입력
			String s = sc.next(); // 출력할 문자열 입력			
			
			for(int j = 0; j < s.length(); j++) {
				
				for(int k = 0; k < n; k++) { // 문자열의 각 문자를 R번만큼 반복 출력 
					
					System.out.print(s.charAt(j));
					
				}
				
			}
			
			sc.close();
		
			System.out.println();
			
		}
		
	
	}

}
