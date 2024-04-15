package String;

import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("입력하시오 : ");
		int n = kb.nextInt();
		
		System.out.println(solution(n));
	}
	
	private static int solution(int n) {
		// TODO Auto-generated method stub
		int answer = 0;
        if(n%2==1){
        	for(int i = 0; i<=n; i++) {
        		if(i%2==1) {
        			answer += i;
        		}
        	}
            
        }else {
        	for(int j = 0; j<=n; j++) {
        		if(j%2==0) {
        			answer += j*j;
        		}
        	}
        }
        return answer;
		
	}



}
