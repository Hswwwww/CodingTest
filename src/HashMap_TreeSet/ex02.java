package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ex02 {
	public static String solution(String s1, String s2) {
		String answer="YES";
		HashMap<Character,Integer>map = new HashMap<>();
		for(char x : s1.toCharArray()) {
			map.put(x,map.getOrDefault(x,0)+1);
			
		}
		
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) answer="NO";
			map.put(x, map.get(x)-1);
		}
		
		
		return answer;
		
	}
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(solution(a,b));
	}

}

//A b aAeCe
//baeeAcA

