package TwoPointers_SlidingWindow;

import java.util.Scanner;

public class ex05 {
	
	public static int solution(int n) {
		int answer= 0 , lt = 0;
		int m = n/2+1;
		int [] arr = new int[m];
		int sum = 0;
		for(int i = 0; i<m; i++) {
			arr[i]=i+1;
		};
		
		for(int i = 0; i<m; i++) {
			sum+=arr[i];
			if(sum == n) {
				answer++;
			}
			while(sum>n) {
				sum = sum-arr[lt];
				arr[lt]++;
				if(sum==n) {
					answer++;
				}
			}
		}
		
		
		
		return answer;
		
}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(solution(n));
	} 
	

}
