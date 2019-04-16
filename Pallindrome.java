import java.util.*;
import java.lang.Math;
public class Pallindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t;
		int sum=0;
		int temp=a;
		int i=0;
		while(a>0)
		{
			t=a%10;
			a/=10;
			sum=sum*10+t;
			i++;	
		}
		//System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Number is Palindrome "+sum);
		}
		
	}

}