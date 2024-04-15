package TwoPointers_SlidingWindow;

import java.util.Scanner;

class ex03 {
	
	public static int solution(int n, int k, int[] arr) {
		int answer =0;
		int sum = 0;
		
		for(int i = 0; i<k; i++) {
			sum+=arr[i];
			
		}
		answer=sum;
		
		for(int i = k; i<n; i++) {
			sum+=(arr[i]-arr[i-k]);
			answer=Math.max(answer, sum);
		}
		
		
		
		return answer;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]= kb.nextInt();
		}
		
		System.out.println(solution(n,k,arr));
	}

}
