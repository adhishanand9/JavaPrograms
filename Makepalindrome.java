import java.util.*;
public class Makepalindrome
{
	static void palindrome(int n)
	{
		int x=rev(n);
		if(x==n)
		{
			System.out.println("Number is a Pallindrome: "+n);
			System.out.println("Number of Steps: "+count);
		}
		else
		{
			n+=x;
			palindrome(n);
			
		}
	}
	static int count=0;
	static int rev(int n)
	{
		int temp=n;
		int rev=0,a;
		while(temp>0)
		{
			a=temp%10;
			temp=temp/10;
			rev=rev*10+a;	
		}
		count++;
		//System.out.println(rev+" "+count);
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		palindrome(a);
		
	}
}