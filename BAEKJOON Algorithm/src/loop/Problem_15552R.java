package loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 빠른 A + B
public class Problem_15552R {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
				
		StringTokenizer st;
		
		for (int i = 0; i < N; i++) {
			// 두 정수의 문자열 공백분리를 위해서 매 반복마다 StringTokenizer을 생성과 동시에 문자를 입력 받음
			st = new StringTokenizer(br.readLine(), " ");
			// StringTokenizer의 nextToken()함수를 이용 입력받은 값을 공백단위로 구분하여 순서대로 출력
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		
		br.close(); // 스트림을 닫음
		
		bw.flush(); // 남아있는 데이터를 모두 출력시킴
		bw.close(); // 스트림을 닫음
		
		
	}
}
