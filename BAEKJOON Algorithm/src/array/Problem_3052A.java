package array;

import java.util.HashSet;
import java.util.Scanner;

// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
// HashSet 사용
public class Problem_3052A {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			
			h.add(sc.nextInt() % 42); // 입력받은 값의 나머지를 add메소드롤 통해 HashSet에 저장
			
		}
		
		sc.close();
		
		System.out.println(h.size());
		
	}
	
	/*
	 
	  HashSet.add() 메소드는 HashSet에 저장하는 메소드이다.
	  처음 생성할 때 HashSet<Integer> 으로 타입을 Integer로 선언했기 때문에 int 형 또는 Integer 객체를 넣어주어야한다.
      이 메소드에서 값을 넣을 때 만약 중복되는 값이 없으면 HashSet 에 저장되면서 True 를 반환하고, 만약 중복되어 저장되지 않으면 False 를 반환한다.
	  (나머지 값이 HashSet 원소에 이미 저장되어있어 중복일 경우 저장이 되지 않고 HashSet 에 없으면 저장한다.)	
      HashSet.size() 는 HashSet 의 크기(= 저장되어 있는 원소의 개수)를 반환한다.

	 */
}
