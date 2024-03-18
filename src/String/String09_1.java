package String;

import java.util.Scanner;

class String09_1 {
	
	public static int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
		if(Character.isDigit(x)) answer +=x;
		}
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(solution(str));
	}
}
