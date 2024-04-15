package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ex01 {
	
	public static char solution(int n, String s) {
		char answer = ' ';
		int m = Integer.MIN_VALUE;
		HashMap<Character,Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
			map.put(x,map.getOrDefault(x,0)+1);
			
		}
		
//		System.out.println(map.containsKey('F'));
//		System.out.println(map.size());
//		System.out.println(map.remove('C'));
//		System.out.println(map.size());
		
		
		for(char key : map.keySet()) {
			//System.out.println(key+ " " + map.get(key)); A 2 B 2 C 1
			if(map.get(key)> m) {
				m = map.get(key);
				answer = key;
				
			}
		}
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.print(solution(n,str));
		
	}

}
