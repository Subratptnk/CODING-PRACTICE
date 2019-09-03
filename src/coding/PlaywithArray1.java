package coding;


import java.util.*;
public class PlaywithArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		Integer arr[] = new Integer[n];
		//Integer temp[] = new Integer[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		System.out.println("*********************************************************************************************");
		System.out.println("PRESS 1 --> For finding the K smallest number");
		System.out.println("PRESS 2 --> For finding the K largest number");
		System.out.println("PRESS 3 --> For sort the array in increasing order");
		System.out.println("PRESS 4 --> For sort the array in decreasing order");
		System.out.println("PRESS 5 --> For checking the array is pallindrome or not");
		System.out.println("PRESS 6 --> For finding the maximum number and minimum number in an array");
		System.out.println("PRESS 7 --> For find the sum of all array elemets");
		System.out.println("PRESS 8 --> For removing the duplicates");
		System.out.println("PRESS 9 --> For having a fight between odds and even");
		System.out.println("*********************************************************************************************");
		System.out.println("Enter your option: ");
		int opt = sc.nextInt();
		
		while(opt != 0)
		{
			
			if(opt == 1)
			{
				
				System.out.println("Enter the K value: ");
				int k = sc.nextInt();
				Arrays.sort(arr);
				System.out.println("K smallest element is :"+arr[k]);
				for(int i = 0 ; i<k ;i++)
				{
					System.out.print(arr[i] + " ");
				}
				
			}
				
				
				
			if(opt == 2)
			{
				
				System.out.println("Enter the K value: ");
				int k1 = sc.nextInt();
				Arrays.sort(arr,Collections.reverseOrder());
				System.out.println("K largest element is :"+arr[k1-1]);
				for(int i = 0 ; i<k1 ;i++)
				{
					System.out.print(arr[i] + " ");
				}
				
			}
			
			if(opt == 3)
			{
				Arrays.sort(arr);
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
			}
			
			if(opt == 4)
			{
				Arrays.sort(arr,Collections.reverseOrder());
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				
			}
			
			if(opt == 5)
			{
				//int b[] = new int[arr.length];
				//System.arraycopy(arr, 0, b, 0, arr.length);
				String str = arr.toString();
				System.out.println(str);
				String temp = "";
				for(int i = arr.length-1;i>=0;i--)
				{
					temp = temp+str.charAt(i);
				}
				System.out.println(temp);
				if(temp == str)
					System.out.println("Pallindrome");
				else
					System.out.println("Not pallindrome");
			}
			
			
			
			
			
			
			
			System.out.println("Do you want to continue then press opts: ");
			 opt = sc.nextInt();
			
		}
		
		
		
		
		
		
	}

}
