package characterString;


import java.util.Scanner;

// 그룹 단어 체커
public class Problem_1316 {
	
	
	static Scanner sc = new Scanner(System.in); // 전역 변수 sc
	
	
	public static void main(String[] args) {
		
		int count = 0;
		int t = sc.nextInt();
		
		
		for (int i = 0; i < t; i++) {
			if (check() == true) {
				count++;				
			}
		}
		
		System.out.println(count);		
		
	}
	
	static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = sc.next();
		
		
		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i); // i 번째 문자 저장 (현재 문자)
			
			
			// 앞선 문자와 i 번째 문자가 같지 않다면?
			if (prev != now) {
				
				
				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if (check[now - 'a'] == false) {
					check[now - 'a'] = true; // true 로 바꿔줌
					prev = now; // 다음 턴을 위해 prev 도 바꿔줌
					
				}
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹 단어가 아니다.)
				else {
					return false; // 함수 종료
				}
				
			}
			
			// 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
			else {
				continue;
			}
			
			
		}
		
		return true;		
		
	}

}
