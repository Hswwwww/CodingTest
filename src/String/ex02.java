//package String;
//
//import java.util.Scanner;
//
//public class ex02 {
//	
//	public static void main(String[] args) {
//	
//		Scanner kb = new Scanner(System.in);
//		int a = kb.nextInt();
//		int b = kb.nextInt();
//		int c = kb.nextInt();
//		
//		System.out.println("입력:");
//		
//		System.out.println(Solution.solution(a,b,c));
//		
//	}
//
//	class Solution {
//	    public static int solution(int number, int n, int m) {
//	        int answer = 0;
//	        int s = n*m;
//	        if(number%s==0) {
//	        	answer = 1;
//	        }else {
//	        	answer = 0;
//	        }
//	        return answer;
//	    }
//	}
//}
