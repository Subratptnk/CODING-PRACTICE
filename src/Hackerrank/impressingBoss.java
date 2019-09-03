/*
 * https://www.hackerrank.com/contests/hourrank-27/challenges/impressing-the-boss/problem
 * 
 */
package Hackerrank;
import java.util.*;
public class impressingBoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases: ");
		int test = sc.nextInt();
		while(test-->0)
		{
			System.out.println("Enter the number of years: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the array elements: ");
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			String res = canModify(arr);
			System.out.println(res);
		}
		
	}

	private static String canModify(int[] arr) {
		int b[] = new int[arr.length];
		System.arraycopy(arr,0 , b, 0, arr.length);
		boolean alreadySorted = true;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				arr[i] = arr[i-1];
				b[i-1] = b[i];
				alreadySorted = false;
				break;
				
			}
		}
		if(alreadySorted || isSorted(arr) || isSorted(b))
		{
			return "YES";
		}
		return "NO";
	}

	private static boolean isSorted(int[] arr) {
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
				return false;
		}
		return true;
	}
	
	/*
private static String canModify(int[] arr) {
	int n = arr.length-1;
	if(arr[0]>arr[n])
		return "NO";
	else if(arr[0] == arr[n])
		return "No";
	else
		return "YES";
	}
	*/

}
