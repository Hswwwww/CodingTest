package String;

import java.util.Scanner;

class String11 {
	public static String solution(String s) {
		String answer="";
		int cnt = 1;
		s= s+" ";
		for(int i = 0; i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1))cnt++;
			else {
				answer += s.charAt(i);
				if(cnt>1)answer+=String.valueOf(cnt);
				cnt=1;
			}
		}
		return answer;
	}
	 
	 public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));
	 }

}
