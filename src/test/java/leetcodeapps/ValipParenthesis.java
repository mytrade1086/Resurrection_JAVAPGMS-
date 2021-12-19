package leetcodeapps;

import java.util.Stack;

public class ValipParenthesis {
//https://leetcode.com/problems/valid-parentheses/
	public static void main(String[] args) {
		
		//
		
		String str="()[]{}";
		
		Stack<Character> stk=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
		
			if(str.charAt(i)=='(' ||str.charAt(i)=='['||str.charAt(i)=='{') {
				
				stk.push(str.charAt(i));
				
			} 
			
			else if(str.charAt(i)==')' ||str.charAt(i)==']'||str.charAt(i)=='}')
			{
				stk.pop(str.charAt(i));
				
			}
		}
			}
			
			
			
		}
	}
}
