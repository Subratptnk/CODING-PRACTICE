/*
 * 
 */
package coding;
import java.util.*;
public class matrix01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of coloumn");
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		// matrix
		System.out.println("Enter the elements of matrix: ");

		for(int i=0;i<row;i++)
		{
			for(int j = 0 ;j<col;j++)
			{
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Matrix 1 ");
		
		for(int i=0;i<row;i++)
		{
			for(int j = 0 ;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		int mat2[][] = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j = 0 ;j<col;j++)
			{
				mat2[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("matrix 2");
		for(int i=0;i<row;i++)
		{
			for(int j = 0 ;j<col;j++)
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix multiplied: ");
		
		for(int i=0;i<row;i++)
		{
			for(int j = 0 ;j<col;j++)
			{
				System.out.print(mat[i][j] * mat2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
