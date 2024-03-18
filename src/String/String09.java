package String;

import java.util.Scanner;

class String09 {
	public static int solution(String s) {
		int answer = 0;
		
		for(char x : s.toCharArray()) {
			if(x>=48&& x<=57) {
				answer= answer*10+(x-48);
				 
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(solution(str));
	}

	
	
}
