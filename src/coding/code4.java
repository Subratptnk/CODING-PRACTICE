/*
 * Program to sort first half of an array in ascending and second half in descending order.
 */
package coding;
import java.util.*;
public class code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enetr the number of elements in an array: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		specialSort(arr,n);
		
		
	}

	private static void specialSort(int[] arr, int n) {
		Arrays.sort(arr);
		
		for(int i=0;i<n/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		for(int j= n-1; j>=n/2;j--)
		{
			System.out.print(arr[j]+" ");
		}
		
	}

}
