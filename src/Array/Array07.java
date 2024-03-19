package Array;

import java.util.Scanner;

class Array07 {
	
	public static int solution(int n, int[]arr) {
		int answer= 0;
		int p= 0;
		for(int i = 0; i<n; i++) {
			if(arr[i]==1) {
				p++;
				answer+=p;
			}else p=0;
			
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
