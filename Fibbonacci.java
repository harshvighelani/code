/** Definition:Print Fibonacci Series starting from n number & 
 * 		print next 5 elements
 * eg:4
 * out:5,8,13,21,34
 *	Author : Harshvi Ghelani
 * 	Creation Date: 7 May 2022
*/
/*
Modification History
Modified on 7 May 9:55 by Harshvi Ghelani [Written core program]
*/
import java.util.*;
public class Fibbonacci
{

	int fibn(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		else
		{
			return fibn(n-1)+fibn(n-2);
		}

	}

	public static void main(String[] args) {

		int m, i, ans;

		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();

		Fibbonacci f = new Fibbonacci();

		int flag = 0;
		
		System.out.print("[");

		for(i=0;i<5;i++)
		{
			if(flag!=0)
				System.out.print(", ");
			flag = 1;
			ans=f.fibn(m);
			System.out.print(""+ans);
			m++;
		}
		System.out.println("]");

		// System.out.print(f.fibn(m)+ " ");
	}
}
