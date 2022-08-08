package arithmeticOperation;

import java.util.Scanner;

public class Problem_2588 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
             
        System.out.print("num1 입력 : ");
        int num1 = scanner.nextInt();
        
        System.out.print("num2 입력 : ");
        String num2 = scanner.next();
        
        
        int[] arrNum = new int[num2.length()];        
        
        for(int i = 0; i < arrNum.length; i++) {
        		arrNum[i] = num2.charAt(2-i) - '0';
        		System.out.println(num1 * arrNum[i]); 
        }
                
        
        System.out.println(num1 * Integer.parseInt(num2));
                

    }

}
