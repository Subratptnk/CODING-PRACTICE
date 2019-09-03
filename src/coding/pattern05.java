package coding;
import java.util.*;
public class pattern05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int z=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
				
			}
			for(int k = 0;k<z;k++)
			{
				//System.out.print(z-i);
				System.out.print((char)(i+64));
			}
			z+=2;
			System.out.println();
		}
	}

}
