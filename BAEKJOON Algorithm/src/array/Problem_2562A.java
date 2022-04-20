package array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Problem_2562A {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] n = new int[9];
		
		for(int i = 0; i < n.length; i++) {
			
			n[i] = Integer.parseInt(br.readLine());
			
		}
		
		br.close();
		
		int max = n[0];
		int iNum = 1;
		
		for(int i = 1; i < n.length; i++) {
			
			if (max < n[i]) {
				
				max = n[i];
				iNum = i + 1;
				
			}
			
		}
		
		System.out.print(max + "\n" + iNum);
		
	}


}
