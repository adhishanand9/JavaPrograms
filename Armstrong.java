import java.util.*;
public class Armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t;
		int sum=0;
		int temp=a;
		while(a>0)
		{
			t=a%10;
			a/=10;
			sum+=(t*t*t);	
		}
		//System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("Number is Armstrong "+sum);
		}
		
	}

}