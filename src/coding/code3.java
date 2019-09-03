/*
 * Program to check for balanced parenthesis with and without using stack is discussed here. You can develop a parenthesis checker without using stack as well. But using stack can have several advantages.

Using a stack to balance parenthesis will help you balance different types of grouping operators such as [], {} and () and verify that they are correctly nested.
Using a stack will also help improve the efficiency of the code
 */
package coding;
import java.util.*;
public class code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression: ");
		String exp = sc.next();
		
		if(balParenthesis(exp))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

	private static boolean balParenthesis(String exp) {
		
		Stack stack = new Stack();
		
		for(int i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[')
				stack.push(exp.charAt(i));
			
			if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']')
			{
				if(stack.isEmpty())
					return false;
				
				Character top =  (Character) stack.pop();
				
				if(top == '(' && exp.charAt(i)!=')' || top == '{' && exp.charAt(i)!='}' || top == '[' && exp.charAt(i)!=']' )
				{
					return false;
				}
			}
		}
		
		
		return stack.empty();
	}

}
