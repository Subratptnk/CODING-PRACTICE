/*
 * Bob has to send a secret code S to his boss. He designs a method to encrypt the code using two key values N and M. The formula that he uses to develop the encrypted code is shown below:

(((S^N%10)^M)%1000000007)

Write an algorithm to help Bob to encrypt the code.
 */
package coding;
import java.math.BigInteger;
import java.util.*;
public class code7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of S, N and M respectively: ");
		BigInteger S = sc.nextBigInteger();
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		
		BigInteger b1,b2;
		
		b1 = new BigInteger("10");
		b2 = new BigInteger("1000000007");
		
		BigInteger ans = S.pow(N.intValue());
		ans = ans.mod(b1);
		ans = ans.pow(M.intValue());
		ans = ans.mod(b2);
		System.out.println(ans);
		
	}

}
