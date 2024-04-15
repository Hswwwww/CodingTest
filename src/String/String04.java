package String;

import java.util.ArrayList;
import java.util.Scanner;

public class String04 {
	public ArrayList<String>solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);b
//			
//		}
		for(String x : str) {
			char [] s = x.toCharArray(); //문자 배열화..
			int lt = 0 , rt = s.length-1;
			
			while(lt<rt) {
				char tmp = s[lt];
				s[lt]= s[rt];
				s[rt]= tmp;
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
			
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String04 T = new String04();
		Scanner kb = new Scanner(System.in);
		System.out.println("입력:");
		int n = kb.nextInt();
		
		String [] str = new String[n];
		for(int i = 0; i<n; i++) {
			str[i]= kb.next();
			
		}
		
		for(String x : T.solution(n, str)) {
			 System.out.println(x);
		}
	}
}
