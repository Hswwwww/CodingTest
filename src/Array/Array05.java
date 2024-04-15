package Array;

import java.util.Scanner;

public class Array05 {
    public static int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=2; i<arr.length; i++) {
        	
            if (arr[i] == 0) {
            	
                answer++;
               
                for (int j=i; j<arr.length; j=j+i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

}