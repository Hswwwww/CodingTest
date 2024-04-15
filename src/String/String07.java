package String;

import java.util.Scanner;

class String07 {
	
	public String solution(String str) {
		String answer="YES";
		
//		String s = str.toUpperCase();
//		String tmp = "";
//		for(int i = s.length()-1; i>=0; i--) {
//			tmp+=s.charAt(i);
//		}
//		
//		if(tmp.equals(s)) {
//			
//			return answer;
//		}else 
//			return "NO";
		
		String s = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(s));
		return answer;
		
	}
	
	public static void main(String[] args) {
		String07 T = new String07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
