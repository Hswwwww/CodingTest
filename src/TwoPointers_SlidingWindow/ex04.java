package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class ex04 {
	
	public static int solution(int n, int m, int [] arr) {
		int answer = 0;
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int [] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]= kb.nextInt();
		}
		System.out.println(solution(n,m,arr));
	}

}
