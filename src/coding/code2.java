/*
 * Program to find the transpose of a matrix is discussed here.
 * Transpose of a matrix can be performed by exchanging the elements of row by column and the elements of a column by row
 */
package coding;
import java.util.*;
public class code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of column: ");
		int col = sc.nextInt();
		
		int matrix[][] = new int[row][col];
		System.out.println("Enter the elements of matrix: ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("The matrix is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of matrix: ");
		{
			for(int i=0;i<col;i++)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print(matrix[j][i]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
