// https://www.hackerrank.com/challenges/java-stack/problem

import java.util.*;
class Solution {
	public static void main(String []argh) {
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String input = sc.next();
            Stack<Character> s = new Stack<>();
            for(int i=0; i<input.length(); i++) {
                if(!s.isEmpty()) {
                    switch(input.charAt(i)) {
                        case '}': if(s.peek() == '{') {
                            s.pop();
                        } break;
                        case ']': if(s.peek() == '[') {
                            s.pop();
                        } break;
                        case ')': if(s.peek() == '(') {
                            s.pop();
                        } break;
                        default: s.push(input.charAt(i));
                	}
                } 
				else { s.push(input.charAt(i)); } 
            } 
			System.out.println(s.isEmpty());
        }
		sc.close();
	}
}