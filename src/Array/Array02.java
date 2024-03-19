package Array;

import java.util.Scanner;

class Array02 {
	
	public static int solution(int n, int[]arr) {
		int answer =1;
		
		int m = arr[0];
		for(int i = 1; i<n; i++) {
			if(arr[i]>m) {
				answer++;
				m=arr[i];	
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]= kb.nextInt();
			
		}
		System.out.println(solution(n,arr));
	}
	

}
