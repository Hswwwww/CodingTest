package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class ex02 {
	
	public static String solution(String str) {
		String answer="";
		Stack<Character>stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			//stack.pop > 제일 상단걸 꺼내고 그 값 리턴
			if(x==')') {
				while(stack.pop()!='(') {
					
				}
			}else stack.push(x);	
		}
		for(int i = 0; i<stack.size(); i++) answer+=stack.get(i);
		return answer;
		
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));
	}

}
