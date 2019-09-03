/*
 * Program to replace a substring in a string is discussed here. The steps for replacing a substring with another string are 
 */
package coding;
import java.util.*;
public class code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the full String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the string which you want to replace: ");
		String str2 = sc.nextLine();
		System.out.println("Enter the new String: ");
		String str3 = sc.nextLine();
		
		String replaced = str1.replace(str2, str3);
		System.out.println(replaced);
	}

}
