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
		int mat[][] = new int[row][row];
		// matrix

		for(int i=0;i<row;i++)
		{
			for(int j = 0 ;i<row;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<row;i++)
		{
			for(int j = 0 ;i<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
