/*
 * 	postfix to infix
 */
package assesment;
import java.util.*;
public class PBL01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression: ");
		String str = sc.next();
		System.out.println(getInfix(str));
	}

	private static String getInfix(String str) {
		
		Stack<String> s = new Stack<String>();
		
		for(int i=0;i<str.length();i++)
		{
			if(isOperand(str.charAt(i)))
			{
				s.push(str.charAt(i)+" ");
			}
			else
			{
				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();
				s.push("("+op2+" "+str.charAt(i)+" "+op1+")");
			}
		}
		
		return s.peek();
	}

	private static boolean isOperand(char x) {
		return(x>='a' && x<='z'||x>='A' && x<='Z');
	
	}

}
