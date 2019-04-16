import java.util.*;
public class Sumdigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t;
		int sum=0;
		while(a>0)
		{
			t=a%10;
			a/=10;
			sum+=t;	
		}
		//System.out.println(sum);
		System.out.println("Sum of Digits :"+sum);
		
		
	}

}