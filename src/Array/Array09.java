package Array;

import java.util.Scanner;

class Array09 {
	
	public static int solution(int n, int[][] arr) {
		int answer= Integer.MIN_VALUE;
		int sum1, sum2; //sum1 > 행의 합 sum2 > 열의합
		
		for(int i = 0; i<n; i++) {
			sum1=sum2=0;
			for(int j = 0; j<n; j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer=Math.max(answer,sum1);
			answer=Math.max(answer, sum2);
			
		}
		sum1=sum2=0;
		
		for(int i = 0; i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
			
		}
		answer=Math.max(answer, sum1);
		answer=Math.max(answer, sum2);
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				arr[i][j]= kb.nextInt();
				
			}
		}
		System.out.println(solution(n,arr));
	}

}
