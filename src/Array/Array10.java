package Array;

import java.util.Scanner;

class Array10 {
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	
	
	public static int solution(int n, int[][]arr) {
		int answer=0;
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; i<n; j++) {
				arr[i][j]= kb.nextInt();
				
			}
		}
		System.out.println(solution(n,arr));
	}

}
