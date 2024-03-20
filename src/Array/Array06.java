package Array;

import java.util.ArrayList;
import java.util.Scanner;

class Array06 {
	
	public static ArrayList<Integer> solution(int n, int[]arr){
		ArrayList<Integer> answer = new ArrayList<>();
		int[] array = new int[n];
		for(int i = 0; i<arr.length; i++) {
			String tmp = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
			array[i]+=Integer.valueOf(tmp);
			
		}
		
	


    for(int i=0; i<array.length; i++){
        if(isPrime(array[i])) answer.add(array[i]);
    	}
    return answer;
	}

	public static boolean isPrime(int num){
	    if(num==1) return false;
	    for(int i=2; i<num; i++){
	        if(num%i==0) return false;
	    }
	    return true;
	}
	 
	 public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i]= kb.nextInt();
		}
		
		for(int x : solution(n,arr)) {
			System.out.println(x +" ");
		}
	}
}
