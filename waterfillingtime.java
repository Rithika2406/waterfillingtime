import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b, c;
		for(int i = 0; i < t; i++)
		{
		   a = sc.nextInt();
		   b = sc.nextInt();
		   c = sc.nextInt();
		   if(a + b + c <= 1)
		   {
		       System.out.println("Water filling time");
		   }
		   else
		   {
		       System.out.println("Not now");
		   }
		}
	}
}