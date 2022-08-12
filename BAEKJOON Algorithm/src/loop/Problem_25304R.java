package loop;

import java.util.Scanner;

// 영수증
public class Problem_25304R {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int totalPrice = sc.nextInt();
		int purchaseTypeNum = sc.nextInt();
		int hap = 0;
		
		
		for (int i = 0; i < purchaseTypeNum; i++) {
			int price = sc.nextInt();
			int quantity = sc.nextInt();
			
			hap += price * quantity;

		}
		
		
		System.out.println(totalPrice == hap ? "yes" : "No");
		
		
		sc.close();
		
	}

}
