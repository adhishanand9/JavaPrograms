import java.util.*;
public class Gcd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		if(a>b)
		{
			met(a,b);
		}
		else if(b>a)
		{
			met(b,a);	
		}
		else
		{
			System.out.println("Both Number are  Same.");
		}
	}
	static void met(int a,int b)
	{
		int gcd=0;
		int i=1;
		while(i<=b)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
				
			}
			i++;
		}
		System.out.println(gcd);
	}

}