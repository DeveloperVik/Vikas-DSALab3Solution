package BalancedBrackets;

import java.util.*;

import java.util.Stack;

public class BalancedBrackets {

	public static int isBalanced(String str) {
		 
		 if(str.isEmpty()) {
		  return -1;
		 }
		 
		 
		 Stack<Character> stack = new Stack<>();//create Dequeue object
		 
		 //looping the string
		 for(int i = 0 ; i < str.length(); i++) {
		  
		  char current = str.charAt(i);//get char at the current index
		  
		  //insert into the stack if the string contains the brace
		  
		  if(current == '{' || current == '(' || current == '[') {
		   stack.push(current);
		  }
		  
		  if(stack.isEmpty() &&( current == '}' || current == ']' || current == ')')) {
		   return 0;
		  }
		  
		  //compare a peek of the stack and current character element 
		  
		  if(!stack.isEmpty() && ((stack.peek() == '{' && current == '}') 
		     || (stack.peek() == '(' && current == ')') 
		     || (stack.peek() == '[' && current == ']'))) {
		    
		    stack.pop();
		  }
		  
		 }
		 return stack.isEmpty()?1:0;//using trenary operator we return true by 1 and false by 0.
		 
		}


		public static void main(String[] args) {
		    Scanner sc= new Scanner(System.in);
		 String s=sc.nextLine();
		 int valid = isBalanced(s);
		 
		 if(valid == 1) {
		  System.out.println("The entered String has Balanced Brackets");
		 }
		    else {
		  System.out.println("The entered String do not contain  Balanced Brackets");
		 }
		}
	
}
