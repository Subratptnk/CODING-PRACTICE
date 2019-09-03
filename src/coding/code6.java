/*
 Program to sort elements by frequency in a given array is discussed here.
 You need to print the elements of an array in the decreasing frequency and if 2 numbers have same frequency then print the one which came first.
 
 */
package coding;
import java.util.*;
public class code6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		sortFreq(str);
	}

	private static void sortFreq(String str) {
		StringBuilder op = new StringBuilder();
		
		Integer freq[] = new Integer[10];
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			freq[Integer.parseInt(String.valueOf(str.charAt(i)))]++;
		}
		
		Arrays.sort(freq,Collections.reverseOrder());
		
		for(int i=0;i<freq.length;i++)
		{
			System.out.println(freq);
		}
		
		
		
	}

}
