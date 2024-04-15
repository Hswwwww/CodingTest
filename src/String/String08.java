package String;

import java.util.Scanner;

class String08 {
	public static String solution(String s) {
		String answer = "NO";
		String str = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) {
			return "YES";
		}else
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(solution(str));
		
	}

}
