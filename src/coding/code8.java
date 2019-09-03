/*
 * In a town, houses are marked with English alphabets. Committee in the town wants to renovate the houses. They decided to renovate only houses named with vowels.
 * Committee has given the list to members and asks them to identify the houses which are not renovated. Write an algorithm to help the committee members to find houses which are not renovated
 */
package coding;
import java.util.*;
public class code8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String str = sc.nextLine();
		
		str = str.replaceAll("[AEIOUaeiou]", " ");
		System.out.println(str);
	}

}
