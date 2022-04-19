package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem_10818B {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] num = new int[n];
		int index = 0;
		
		while (st.hasMoreTokens()) { // hasMoreTokens()는 StringTokenizer 에 토큰이 남아있으면 true, 비어있으면 false를 반환한다.
			
			num[index] = Integer.parseInt(st.nextToken());
			index++;
			
		}
		
		br.close();
		Arrays.sort(num);
		System.out.println(num[0] + " " + num[n-1]);		
		
		
	}

}
