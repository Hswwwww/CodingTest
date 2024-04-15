package Array;

import java.util.Scanner;

class Array08 {
	
	public static int[] solution(int n, int[] arr) {
		int[] answer= new int[n];
		int p = 0;
		for(int i = 0; i<n; i++) {
			p=1;
			for(int j = 0; j<n; j++) {
				if(arr[j]>arr[i])p++;
			}
			
			answer[i]=p;
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
		
		for(int x : solution(n,arr))System.out.println(x +" ");
	}

}
